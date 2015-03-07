package cas;

import java.awt.*;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;
import Ertsys.*;

public class FlightsDetailsDisplay extends JPanel
{	
	private List<FlightDetailsDisplay> _flightsDisplay = new ArrayList<FlightDetailsDisplay>(); 
	private static final int numberOfPanels = 7;
	
	public FlightsDetailsDisplay(List<Aircraft> aircrafts)
	{
		setLayout(new GridLayout(numberOfPanels, 1, 0, 4));
		addDisplays(aircrafts);
	}
	
	public void update(List<Aircraft> aircrafts)
	{
		removeDisplays();
		addDisplays(aircrafts);
	}
	
	private void removeDisplays()
	{
		for (int i = 0; i < _flightsDisplay.size(); i++) 
		{
			this.remove(_flightsDisplay.get(i));
		}
		_flightsDisplay.clear();
	}
	
	private void addDisplays(List<Aircraft> aircrafts)
	{
		if (aircrafts != null)
		{
			int i;
			for (i = 0; i < aircrafts.size() && i < numberOfPanels; i++) 
			{
				FlightDetailsDisplay fdd = new FlightDetailsDisplay(aircrafts.get(i));
				this.add(fdd);
				_flightsDisplay.add(fdd);
			}				
		}
	}
}