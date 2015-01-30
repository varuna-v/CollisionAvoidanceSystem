package cas;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.util.Arrays;
import java.util.ArrayList;
import javax.swing.JLabel;

import Ertsys.*;

public class CollisionAvoidanceSystem extends JFrame {

	private static JLabel theText;
	private Container contentpane;
	private CASystem system;

	public static void main(String[] args) {
		CollisionAvoidanceSystem display = new CollisionAvoidanceSystem();
	}

	public CollisionAvoidanceSystem() {
		AirTrafficController initialATC = new AirTrafficController(
				getInitialSeqOfAircrafts(), (Aircraft) null, 0.0, 10000.0, 0.0,
				10000.0);
		system = new CASystem(initialATC);
		setTitle("Collision Avoidance System");
		contentpane = getContentPane();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		// theText = new JLabel();
		// contentpane.add(theText);
		setBounds(0, 0, screenSize.width, screenSize.height);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		ATCDisplay atcDisplay = new ATCDisplay(retrieveAircrafts());
		contentpane.add(atcDisplay);

		while (true) {
			try {
				Thread.sleep(2000); // 1000 milliseconds is one second.
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
			system.fly();
			atcDisplay.updateAircrafts(retrieveAircrafts());
		}

		// panel.repaint();
		// work();
	}

	private void work() {
		// _eSeq crafts = system.getAircrafts();
		// String text = "<html>" + crafts;
		// for (Aircraft c : crafts)
		// text += c.toString() + "<br>";
		// text += "</html>";
		// theText.setText(text);
	}

	private _eSeq getInitialSeqOfAircrafts() {
		return new _eSeq()
				._lAppend(
						((_eAny) new Aircraft(
								new Vector(10.0, 1000.0, 21353.0,
										VectorType.Position, (VectorType) null),
								new Vector(234.0, 93.0, 0.0,
										VectorType.Velocity, (VectorType) null),
								50.0, AircraftStatus.FlyingAtLevel,
								(AircraftStatus) null, _eSystem._lString("A"),
								(char) 0)),
						((_eAny) new Aircraft(
								new Vector(67.0, 5.0, 3434.0,
										VectorType.Position, (VectorType) null),
								new Vector(54.0, 146.0, 0.0,
										VectorType.Velocity, (VectorType) null),
								20.0, AircraftStatus.FlyingAtLevel,
								(AircraftStatus) null, _eSystem._lString("B"),
								(char) 0)),
						((_eAny) new Aircraft(
								new Vector(879.0, 664.0, 7834.0,
										VectorType.Position, (VectorType) null),
								new Vector(265.0, 86.0, 0.0,
										VectorType.Velocity, (VectorType) null),
								30.0, AircraftStatus.FlyingAtLevel,
								(AircraftStatus) null, _eSystem._lString("C"),
								(char) 0)),
						((_eAny) new Aircraft(
								new Vector(435.0, 234.0, 45534.0,
										VectorType.Position, (VectorType) null),
								new Vector(342.0, 134.0, 0.0,
										VectorType.Velocity, (VectorType) null),
								25.0, AircraftStatus.FlyingAtLevel,
								(AircraftStatus) null, _eSystem._lString("D"),
								(char) 0)))
				._lAppend(
						((_eAny) new Aircraft(
								new Vector(7568.0, 6675.0, 34456.0,
										VectorType.Position, (VectorType) null),
								new Vector(57.0, 75.0, 0.0,
										VectorType.Velocity, (VectorType) null),
								35.0, AircraftStatus.FlyingAtLevel,
								(AircraftStatus) null, _eSystem._lString("E"),
								(char) 0)),
						((_eAny) new Aircraft(
								new Vector(453.0, 5753.0, 3468.0,
										VectorType.Position, (VectorType) null),
								new Vector(23.0, 105.0, 0.0,
										VectorType.Velocity, (VectorType) null),
								10.0, AircraftStatus.FlyingAtLevel,
								(AircraftStatus) null, _eSystem._lString("F"),
								(char) 0)),
						((_eAny) new Aircraft(
								new Vector(987.0, 5342.0, 344.0,
										VectorType.Position, (VectorType) null),
								new Vector(364.0, 63.0, 0.0,
										VectorType.Velocity, (VectorType) null),
								5.0, AircraftStatus.FlyingAtLevel,
								(AircraftStatus) null, _eSystem._lString("G"),
								(char) 0)));
	}

	private ArrayList<Aircraft> retrieveAircrafts() {
		ArrayList<Aircraft> aircrafts = new ArrayList<Aircraft>();
		for (int i = 0; i < system.getAircrafts()._oHash(); i++) {
			aircrafts.add((Aircraft) system.getAircrafts()._oIndex(i));
		}
		return aircrafts;
	}

	private ArrayList<Aircraft> getTestAircrafts() {
		return new ArrayList<Aircraft>(
				Arrays.asList(
						new Aircraft(
								new Vector(10.0, 1000.0, 21353.0,
										VectorType.Position, (VectorType) null),
								new Vector(234.0, 93.0, 0.0,
										VectorType.Velocity, (VectorType) null),
								50.0, AircraftStatus.FlyingAtLevel,
								(AircraftStatus) null, _eSystem._lString("A"),
								(char) 0),
						(new Aircraft(
								new Vector(67.0, 5.0, 3434.0,
										VectorType.Position, (VectorType) null),
								new Vector(54.0, 146.0, 0.0,
										VectorType.Velocity, (VectorType) null),
								20.0, AircraftStatus.FlyingAtLevel,
								(AircraftStatus) null, _eSystem._lString("B"),
								(char) 0)), (new Aircraft(new Vector(879.0,
								664.0, 7834.0, VectorType.Position,
								(VectorType) null), new Vector(265.0, 86.0,
								0.0, VectorType.Velocity, (VectorType) null),
								30.0, AircraftStatus.FlyingAtLevel,
								(AircraftStatus) null, _eSystem._lString("C"),
								(char) 0))));
	}
}