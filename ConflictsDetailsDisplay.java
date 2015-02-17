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
	private JLabel _JLCriticalPairs[] = new JLabel[10];
	
	public ConflictsDetailsDisplay(CASystem casystem)
	{
		_system = casystem;
	    setLayout(new GridLayout(0, 2, 10, 10));
	    this.add(new JLabel("Time to next possible conflict: "));
	    this.add(_JLMinTimeToConflict);
	    
	    for (int i = 0; i < 10; i++)
	    {
	    	_JLCriticalPairs[i] = new JLabel();
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
		_JLMinTimeToConflict.setText(_eSystem._lJavaString(_system.getMinimumTimeToConflict()));
		
		AircraftPair criticalPairs[] = getCriticalPairs();
		
		if (criticalPairs != null)
		{
			int labelCount = 0;
			for (int i = 0; i < criticalPairs.length && labelCount + 1 < _JLCriticalPairs.length; i++)
			{
				_JLCriticalPairs[labelCount++].setText(_eSystem._lJavaString(criticalPairs[i].craft1.identification));
				_JLCriticalPairs[labelCount++].setText(_eSystem._lJavaString(criticalPairs[i].craft2.identification));
			}
		}
	}
	
	private AircraftPair[] getCriticalPairs() {
		// if (system == null) { throw new InvalidArgumentException(); }
		List<AircraftPair> pairs = new ArrayList<AircraftPair>();
		for (int i = 0; i < _system.getAircraftPairsOrderedByTimeToConflict()._oHash(); i++) {
			if (i == 5) { break; }
			pairs.add((AircraftPair) _system.getAircraftPairsOrderedByTimeToConflict()._oIndex(i));
		}
		return pairs.toArray(new AircraftPair[pairs.size()]);
	}
		
}