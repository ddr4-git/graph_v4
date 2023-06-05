package view;

import java.awt.Graphics;
import java.util.List;

import javax.swing.JPanel;

import java.util.List;
import java.util.LinkedList;

public class CirclePanel extends JPanel {

	private List<Circle> circles = new LinkedList<>();
	
	public void addCircle(Circle circle)
	{
		circles.add(circle);
		this.repaint();
	}
	
	
	@Override
	public void paint(Graphics g) {
		
		for(Circle circle: circles)
		{
			circle.draw(g);
		}
	}
}
