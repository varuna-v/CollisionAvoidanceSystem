package cas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.util.List;;
import java.lang.Math;
import java.awt.BasicStroke;

import Ertsys.*;

public class ATCDisplay extends JPanel {

	private List<Aircraft> _aircrafts;
	public static List<JLabel> labels;
	private static final double scale = 1.4;
	
	public ATCDisplay(List<Aircraft> aircrafts)
	{
		_aircrafts = aircrafts;
	    setLayout(null);
	}
	
	public void updateAircrafts(List<Aircraft> aircrafts)
	{
		_aircrafts = aircrafts;
		this.repaint();
	}
	
	public void paintComponent(Graphics g)
	{
		setBackground(Color.black);
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		labels = new ArrayList<JLabel>();
		
		for (Aircraft aircraft : _aircrafts)
		{
			String id = aircraft.identification.toString();
			String sId = id.substring(4, id.length()-1);
			
			//Set conflict colour
			if (aircraft.conflictStatus == ConflictStatus.Conflicted)  
			    g2d.setColor(Color.red);
			else if(aircraft.conflictStatus == ConflictStatus.PotentialFutureConflict)
			{   g2d.setColor(Color.yellow);
				//System.out.println(sId);//!!
			}
			else 
			    g2d.setColor(Color.green);
			
			int x = (int)(aircraft.position.x/scale);
			int y = (int)(aircraft.position.y/scale);
			
			//Draw aircraft
			g2d.setStroke(new BasicStroke(1.5f));
			g2d.drawLine(x, y, x, y);
			//Display aircraft identity
			
			
			JLabel idLabel = new JLabel(sId);
			idLabel.setForeground(Color.ORANGE);
			labels.add(idLabel);
			//this.add(idLabel);
			idLabel.setLocation(x, y-1);
			
			//idLabel.setSize(5, 5);
			//Draw boundary
			g2d.setStroke(new BasicStroke(1f));
			int cx = (int)(x - (aircraft.boundaryRadius/2.0));
			int cy = (int)(y - (aircraft.boundaryRadius/2.0));
			g2d.drawOval(cx, cy, (int)aircraft.boundaryRadius, (int)aircraft.boundaryRadius);
			
		}
	}
	
}