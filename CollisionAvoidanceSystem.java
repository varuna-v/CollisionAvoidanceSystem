package cas;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.util.Arrays;
import java.util.ArrayList;
import javax.swing.JLabel;
import java.util.*;
import java.awt.Rectangle;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import Ertsys.*;

public class CollisionAvoidanceSystem extends JFrame {

	private static JLabel theText;
	private Container contentpane;
	private CASystem system;
	private Random random = new Random();
	private CraftsMovementDisplay movementDisplay;
	private FlightsDetailsDisplay flightsDetailsDisplay;
	private ConflictsDetailsDisplay cdsDisplay;
	private AlterPathDisplay alterPathDisplay;
	
	public static void main(String[] args) {
		CollisionAvoidanceSystem display = new CollisionAvoidanceSystem();
	}

	public CollisionAvoidanceSystem() {

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		InitialiseCASystem(screenSize);
		SetFrameProperties(screenSize);
		contentpane = getContentPane();
		GridBagLayout layout = getGBLLayout();
		contentpane.setLayout(layout);
		
		ArrayList<Aircraft> aircrafts =  retrieveAircrafts();
		
		int effectiveWidth = screenSize.width - 20;
		int effectiveHeight = screenSize.height - 20;
		
		GridBagConstraints gblConstraints = new GridBagConstraints();	
		gblConstraints.fill = GridBagConstraints.BOTH;
		gblConstraints.gridx = 0;
		gblConstraints.gridy = 0;
		movementDisplay = new CraftsMovementDisplay(aircrafts);
		contentpane.add(movementDisplay, gblConstraints);

		gblConstraints.gridx = 1;
		gblConstraints.gridy = 0;
		flightsDetailsDisplay = new FlightsDetailsDisplay(aircrafts);
		contentpane.add(flightsDetailsDisplay, gblConstraints);
		
		gblConstraints.gridx = 0;
		gblConstraints.gridy = 1;
		cdsDisplay = new ConflictsDetailsDisplay(system);
		contentpane.add(cdsDisplay, gblConstraints);

		gblConstraints.gridx = 1;
		gblConstraints.gridy = 1;
		alterPathDisplay = new AlterPathDisplay(aircrafts);
		alterPathDisplay.btnConfirm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	AlterPathPair app = alterPathDisplay.getDataToAlterPath(system);
        		if (app != null)
        		{
        			system.changeHeight(_eSystem._lString (app.identification), (char) 0, app.targetHeight);
        	    	update();
        		}
            }
        });  
		contentpane.add(alterPathDisplay, gblConstraints);
		
		
		
		while (true) {
			try {
				Thread.sleep(1000); // 1000 milliseconds is one second.
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
			system.fly();
			update();
		}		
	}
	
	private void update()
	{
		ArrayList<Aircraft> aircrafts =  retrieveAircrafts();
		//!!Create IUpdateable?? maybe set it up to react to system's aircrafts changing or system changing?
		movementDisplay.updateAircrafts(aircrafts);
		cdsDisplay.updateSystem(system);
		flightsDetailsDisplay.update(aircrafts);
		alterPathDisplay.update(aircrafts);
	}
	

	private void InitialiseCASystem(Dimension screenSize)
	{
		AirTrafficController initialATC = new AirTrafficController(
				getInitialSeqOfAircrafts(screenSize.width, screenSize.height),
				(Aircraft) null, 0.0, (double) (screenSize.width), 0.0,
				(double) (screenSize.height));
		system = new CASystem(initialATC);
	}
	
	private GridBagLayout getGBLLayout()
	{
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{6, 2, 0, 0};
		gridBagLayout.rowHeights = new int[]{8, 2};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0};
		return gridBagLayout;
	}
	

	private void SetFrameProperties(Dimension screenSize)
	{
		setTitle("Collision Avoidance System");		
		setBounds(0, 0, screenSize.width, screenSize.height);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	private double getRandom(int rangeMax) {
		return getRandom(0, rangeMax);
	}

	private double getRandom(int rangeMin, int rangeMax) {
		return rangeMin + (double) (rangeMax - rangeMin) * random.nextDouble();
	}

	private _eSeq getInitialSeqOfAircrafts(int maxX, int maxY) {
		return new _eSeq()._lAppend(
				((_eAny) new Aircraft(new Vector(getRandom(maxX),
						getRandom(maxY), 21353.0, VectorType.Position,
						(VectorType) null), new Vector(234.0, -93.0, 0.0,
						VectorType.Velocity, (VectorType) null), 50.0,
						AircraftStatus.FlyingAtLevel, (AircraftStatus) null,
						_eSystem._lString("A"), (char) 0, AircraftModel.Boeing777200, (
					            AircraftModel) null)),
				((_eAny) new Aircraft(new Vector(getRandom(maxX),
						getRandom(maxY), 3434.0, VectorType.Position,
						(VectorType) null), new Vector(54.0, 146.0, 0.0,
						VectorType.Velocity, (VectorType) null), 20.0,
						AircraftStatus.FlyingAtLevel, (AircraftStatus) null,
						_eSystem._lString("B"), (char) 0, AircraftModel.Boeing777200, (
					            AircraftModel) null)),
				((_eAny) new Aircraft(new Vector(getRandom(maxX),
						getRandom(maxY), 21053.0, VectorType.Position,
						(VectorType) null), new Vector(-265.0, 86.0, 0.0,
						VectorType.Velocity, (VectorType) null), 30.0,
						AircraftStatus.FlyingAtLevel, (AircraftStatus) null,
						_eSystem._lString("C"), (char) 0, AircraftModel.Boeing777200, (
					            AircraftModel) null)),
				((_eAny) new Aircraft(new Vector(getRandom(maxX),
						getRandom(maxY), 45534.0, VectorType.Position,
						(VectorType) null), new Vector(342.0, 134.0, 0.0,
						VectorType.Velocity, (VectorType) null), 25.0,
						AircraftStatus.FlyingAtLevel, (AircraftStatus) null,
						_eSystem._lString("D"), (char) 0, AircraftModel.Boeing777200, (
					            AircraftModel) null)),
				((_eAny) new Aircraft(new Vector(getRandom(maxX),
						getRandom(maxY), 21353.0, VectorType.Position,
						(VectorType) null), new Vector(57.0, -75.0, 0.0,
						VectorType.Velocity, (VectorType) null), 35.0,
						AircraftStatus.FlyingAtLevel, (AircraftStatus) null,
						_eSystem._lString("E"), (char) 0, AircraftModel.Boeing777200, (
					            AircraftModel) null)),
				((_eAny) new Aircraft(new Vector(getRandom(maxX),
						getRandom(maxY), 3468.0, VectorType.Position,
						(VectorType) null), new Vector(23.0, 105.0, 0.0,
						VectorType.Velocity, (VectorType) null), 10.0,
						AircraftStatus.FlyingAtLevel, (AircraftStatus) null,
						_eSystem._lString("F"), (char) 0, AircraftModel.Boeing777200, (
					            AircraftModel) null)),
				((_eAny) new Aircraft(new Vector(getRandom(maxX),
						getRandom(maxY), 344.0, VectorType.Position,
						(VectorType) null), new Vector(-364.0, 63.0, 0.0,
						VectorType.Velocity, (VectorType) null), 5.0,
						AircraftStatus.FlyingAtLevel, (AircraftStatus) null,
						_eSystem._lString("G"), (char) 0, AircraftModel.Boeing777200, (
					            AircraftModel) null)),
				((_eAny) new Aircraft(new Vector(getRandom(maxX),
						getRandom(maxY), 12345.0, VectorType.Position,
						(VectorType) null), new Vector(-12.0, 230.0, 0.0,
						VectorType.Velocity, (VectorType) null), 5.0,
						AircraftStatus.FlyingAtLevel, (AircraftStatus) null,
						_eSystem._lString("H"), (char) 0, AircraftModel.Boeing777200, (
					            AircraftModel) null)));
	}

	private ArrayList<Aircraft> retrieveAircrafts() {
		// if (system == null) { throw new InvalidArgumentException(); }
		ArrayList<Aircraft> aircrafts = new ArrayList<Aircraft>();
		for (int i = 0; i < system.getAircrafts()._oHash(); i++) {
			aircrafts.add((Aircraft) system.getAircrafts()._oIndex(i));
		}
		
		return aircrafts;
	}	

}