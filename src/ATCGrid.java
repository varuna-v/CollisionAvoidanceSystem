import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ATCGrid extends JPanel {
	private static final int offset = 15;

	// !!maybe change to Rectangle
	private int _screenWidth;
	private int _screenHeight;

	public ATCGrid(int screenWidth, int screenHeight) {
		_screenWidth = screenWidth;
		_screenHeight = screenHeight;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		double max = 16;
		double min = 0;

		Graphics2D g2 = (Graphics2D) g;
		g2.translate(0, getHeight());
		g2.scale(2.0, 2.0);
		g2.draw(new Line2D.Double(0, 0, _screenWidth, 0));
		// g2.draw( new Line2D.Double(0,min*100,0,-max*100));
	}
}
// /**
// * Created by Varuna on 27/01/2015.
// */
// import java.awt.Graphics;
// import java.awt.Graphics2D;
// import javax.swing.JFrame;
// import javax.swing.JPanel;
// import javax.swing.SwingUtilities;
// import java.awt.Rectangle;
//
// public class ATCGrid extends JPanel
// {
// private static final int offset = 15;
//
// private int _screenWidth;
// private int _screenHeight;
//
// public ATCGrid(int screenWidth, int screenHeight)
// {
// _screenWidth = screenWidth;
// _screenHeight = screenHeight;
// }
//
// private void drawCoordinates(Graphics graphics)
// {
// Graphics2D g2d = (Graphics2D) graphics;
//
// g2d.drawLine(0, offset, _screenHeight, offset); //x axis
// g2d.drawLine( offset, 0, offset, _screenWidth); //y axis
// }
//
// @Override
//
// public void paintComponent(Graphics g) {
//
// super.paintComponent(g);
// drawCoordinates(g);
// }
// }