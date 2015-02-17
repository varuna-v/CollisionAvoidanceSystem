package cas;

import java.awt.*;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;
import Ertsys.*;

public class FlightsDetailsDisplay extends JPanel
{	
	private List<FlightDetailsDisplay> _flightsDisplay = new ArrayList<FlightDetailsDisplay>(); 

	public FlightsDetailsDisplay(List<Aircraft> aircrafts)
	{
		setLayout(new GridLayout(0, 1, 0, 3));
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
			FlightDetailsDisplay flightDisplay = _flightsDisplay.get(i);
			this.remove(flightDisplay);
			_flightsDisplay.remove(flightDisplay);
		}
	}
	
	private void addDisplays(List<Aircraft> aircrafts)
	{
		if (aircrafts != null)
		{
			for (int i = 0; i < aircrafts.size(); i++) 
			{
				FlightDetailsDisplay fdd = new FlightDetailsDisplay(aircrafts.get(i));
				this.add(fdd);
				_flightsDisplay.add(fdd);
			}
		}
	}
}