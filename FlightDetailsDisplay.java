package cas;

import java.awt.*;
import javax.swing.*;
import Ertsys.*;

public class FlightDetailsDisplay extends JPanel
{
	private Aircraft _aircraft;
	private JLabel _labels[] = new JLabel[6];
	
	public FlightDetailsDisplay(Aircraft aircraft)
	{
		_aircraft = aircraft;
		setLayout(new GridLayout(3, 2));
		addLabels();
		setInitialLabels();
		setVariableLabels();
		setBorder(BorderFactory.createLineBorder(getForeground()));
	}
	
	//!! is this method used?
	public void updateAircraft(Aircraft aircraft)
	{
		_aircraft = aircraft;
		setVariableLabels();
		//if (aircraft != null && aircraft.identification.equals(_aircraft.identification))
		//{}
	}
	
	private void setInitialLabels()
	{
		_labels[2].setText("Position: ");
		_labels[4].setText("Velocity: ");
	}
	
	private void setVariableLabels()
	{
		if (_aircraft != null)
		{
			_labels[0].setText(_eSystem._lJavaString(_aircraft.identification));
			_labels[3].setText(_eSystem._lJavaString(_aircraft.position._rtoString()));
			_labels[5].setText(_eSystem._lJavaString(_aircraft.velocity._rtoString()));
		}
	}
	
	private void addLabels()
	{
		for (int i = 0; i < _labels.length; i++)
		{
			if (_labels[i] == null) { _labels[i] = new JLabel(" "); }
			this.add(_labels[i]);
		}
	}
}