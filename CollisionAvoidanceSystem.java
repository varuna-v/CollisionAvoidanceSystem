package cas;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.util.Arrays;
import java.util.ArrayList;
import javax.swing.JLabel;
import java.util.*;
import java.awt.Rectangle;

import Ertsys.*;

public class CollisionAvoidanceSystem extends JFrame {

	private static JLabel theText;
	private Container contentpane;
	private CASystem system;
	private Random random = new Random();

	public static void main(String[] args) {
		CollisionAvoidanceSystem display = new CollisionAvoidanceSystem();
	}

	public CollisionAvoidanceSystem() {

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		AirTrafficController initialATC = new AirTrafficController(
				getInitialSeqOfAircrafts(screenSize.width, screenSize.height),
				(Aircraft) null, 0.0, (double) (screenSize.width + 50), 0.0,
				(double) (screenSize.height + 50));
		system = new CASystem(initialATC);

		setTitle("Collision Avoidance System");
		contentpane = getContentPane();

		setBounds(0, 0, screenSize.width, screenSize.height);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		ATCDisplay atcDisplay = new ATCDisplay(retrieveAircrafts());
		if (atcDisplay.labels != null)
		{
			for (JLabel label : atcDisplay.labels)
				atcDisplay.add(label);
		}
		contentpane.add(atcDisplay);

		while (true) {
			try {
				Thread.sleep(1000); // 1000 milliseconds is one second.
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
			if (atcDisplay.labels != null)
			{
				for (JLabel label : atcDisplay.labels)
					atcDisplay.add(label);
			}
			system.fly();
			atcDisplay.updateAircrafts(retrieveAircrafts());
		}

		// panel.repaint();
		// work();
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
						_eSystem._lString("A"), (char) 0)),
				((_eAny) new Aircraft(new Vector(getRandom(maxX),
						getRandom(maxY), 3434.0, VectorType.Position,
						(VectorType) null), new Vector(54.0, 146.0, 0.0,
						VectorType.Velocity, (VectorType) null), 20.0,
						AircraftStatus.FlyingAtLevel, (AircraftStatus) null,
						_eSystem._lString("B"), (char) 0)),
				((_eAny) new Aircraft(new Vector(getRandom(maxX),
						getRandom(maxY), 21053.0, VectorType.Position,
						(VectorType) null), new Vector(-265.0, 86.0, 0.0,
						VectorType.Velocity, (VectorType) null), 30.0,
						AircraftStatus.FlyingAtLevel, (AircraftStatus) null,
						_eSystem._lString("C"), (char) 0)),
				((_eAny) new Aircraft(new Vector(getRandom(maxX),
						getRandom(maxY), 45534.0, VectorType.Position,
						(VectorType) null), new Vector(342.0, 134.0, 0.0,
						VectorType.Velocity, (VectorType) null), 25.0,
						AircraftStatus.FlyingAtLevel, (AircraftStatus) null,
						_eSystem._lString("D"), (char) 0)),
				((_eAny) new Aircraft(new Vector(getRandom(maxX),
						getRandom(maxY), 21353.0, VectorType.Position,
						(VectorType) null), new Vector(57.0, -75.0, 0.0,
						VectorType.Velocity, (VectorType) null), 35.0,
						AircraftStatus.FlyingAtLevel, (AircraftStatus) null,
						_eSystem._lString("E"), (char) 0)),
				((_eAny) new Aircraft(new Vector(getRandom(maxX),
						getRandom(maxY), 3468.0, VectorType.Position,
						(VectorType) null), new Vector(23.0, 105.0, 0.0,
						VectorType.Velocity, (VectorType) null), 10.0,
						AircraftStatus.FlyingAtLevel, (AircraftStatus) null,
						_eSystem._lString("F"), (char) 0)),
				((_eAny) new Aircraft(new Vector(getRandom(maxX),
						getRandom(maxY), 344.0, VectorType.Position,
						(VectorType) null), new Vector(-364.0, 63.0, 0.0,
						VectorType.Velocity, (VectorType) null), 5.0,
						AircraftStatus.FlyingAtLevel, (AircraftStatus) null,
						_eSystem._lString("G"), (char) 0)),
				((_eAny) new Aircraft(new Vector(getRandom(maxX),
						getRandom(maxY), 12345.0, VectorType.Position,
						(VectorType) null), new Vector(-12.0, 230.0, 0.0,
						VectorType.Velocity, (VectorType) null), 5.0,
						AircraftStatus.FlyingAtLevel, (AircraftStatus) null,
						_eSystem._lString("H"), (char) 0)));
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