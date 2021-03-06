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
	private CraftsMovementDisplay movementDisplay;
	private FlightsDetailsDisplay flightsDetailsDisplay;
	private ConflictsDetailsDisplay cdsDisplay;
	private AlterPathDisplay alterPathDisplay;
	private IAircraftFeeder aircraftFeeder;
	
	public static void main(String[] args) {
		String feederIdentification = (args == null || args.length == 0) ? "" : args[0];
		CollisionAvoidanceSystem display = new CollisionAvoidanceSystem(feederIdentification);
	}
	
	public CollisionAvoidanceSystem(String feederIdentification) {
  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		InitialiseAircraftFeeder(feederIdentification, screenSize);
		InitialiseCASystem(screenSize);
		SetFrameProperties(screenSize);
		contentpane = getContentPane();
		GridBagLayout layout = getGBLLayout();
		contentpane.setLayout(layout);
		
		ArrayList<Aircraft> aircrafts =  retrieveAircrafts();
		
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
        			updateDisplay();
        		}
            }
        });
		contentpane.add(alterPathDisplay, gblConstraints);
		
		int n = 0;
		while (true) {
			try {
				Thread.sleep(1000); // 1000 milliseconds is one second.
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
			system.fly();
			updateDisplay();
			if (n % 2 == 0)
				injectAircraft();
			n++;
		}		
	}
	
	private void injectAircraft()
	{
		Aircraft craftToInject = aircraftFeeder.getAircraftToInject();
		if (craftToInject != null)
			system.addAircraft(craftToInject);		
	}
	
	private void updateDisplay()
	{
		ArrayList<Aircraft> aircrafts =  retrieveAircrafts();
		movementDisplay.updateAircrafts(aircrafts);
		cdsDisplay.updateSystem(system);
		flightsDetailsDisplay.update(aircrafts);
		alterPathDisplay.update(aircrafts);
	}
	

	private void InitialiseCASystem(Dimension screenSize)
	{
		AirTrafficController initialATC = new AirTrafficController(
				aircraftFeeder.getInitialSeqOfAircrafts(),
				(Aircraft) null, 0.0, (double) (screenSize.width), 0.0,
				(double) (screenSize.height));
		system = new CASystem(initialATC);
	}
	
	private void InitialiseAircraftFeeder(String feederIdentification, Dimension screenSize)
	{
		aircraftFeeder = AircraftFeederFactory.getAircraftFeeder(feederIdentification, screenSize);			
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


	private ArrayList<Aircraft> retrieveAircrafts() {
		ArrayList<Aircraft> aircrafts = new ArrayList<Aircraft>();
		for (int i = 0; i < system.getAircrafts()._oHash(); i++) {
			aircrafts.add((Aircraft) system.getAircrafts()._oIndex(i));
		}
		
		return aircrafts;
	}	

}