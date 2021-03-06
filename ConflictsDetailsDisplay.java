package cas;

import java.awt.GridLayout;
import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import Ertsys.*;

public class ConflictsDetailsDisplay extends JPanel
{
	private CASystem _system;
	private JLabel _JLMinTimeToConflict = new JLabel();
	private static final int _numberOfJLCriticalPairs = 15;
	private JLabel _JLCriticalPairs[] = new JLabel[_numberOfJLCriticalPairs];
	
	public ConflictsDetailsDisplay(CASystem casystem)
	{
		_system = casystem;
	    setLayout(new GridLayout(6, 3));
	    this.add(new JLabel("                         Aircrafts"));
	    this.add(new JLabel("Time to conflict"));
	    this.add(new JLabel("Resolution"));
	    for (int i = 0; i < _numberOfJLCriticalPairs; i++)
	    {
	    	_JLCriticalPairs[i] = new JLabel();
	    	_JLCriticalPairs[i].setMinimumSize(new Dimension(60, 20));
	    	this.add(_JLCriticalPairs[i]);
	    }
	}
		
	public void updateSystem(CASystem casystem)
	{
		_system = casystem;
		updateDetails();
	}
	
	private void updateDetails()
	{
		_JLMinTimeToConflict.setText("");
		AircraftPair criticalPairs[] = getCriticalPairs();

		int labelCount = 0;
		if (criticalPairs != null)
		{
			for (int i = 0; i < criticalPairs.length && labelCount + 1 < _JLCriticalPairs.length; i++)
			{
				_JLCriticalPairs[labelCount++].setText("                         " + _eSystem._lJavaString(criticalPairs[i].craft1.identification) + " & " + _eSystem._lJavaString(criticalPairs[i].craft2.identification));
				_JLCriticalPairs[labelCount++].setText(String.valueOf(criticalPairs[i].timeToConflict() * 10.0));
				_JLCriticalPairs[labelCount++].setText(_eSystem._lJavaString(criticalPairs[i].getMovementToPreventConflict()));
			}
		}
		for (; labelCount < _numberOfJLCriticalPairs; labelCount++)
			_JLCriticalPairs[labelCount].setText("");
	}
	
	private AircraftPair[] getCriticalPairs() {
		List<AircraftPair> pairs = new ArrayList<AircraftPair>();
		for (int i = 0; i < _system.getAircraftPairsOrderedByTimeToConflict()._oHash(); i++) {
			if (i == 5) { break; }
			pairs.add((AircraftPair) _system.getAircraftPairsOrderedByTimeToConflict()._oIndex(i));
		}
		return pairs.toArray(new AircraftPair[pairs.size()]);
	}
		
}