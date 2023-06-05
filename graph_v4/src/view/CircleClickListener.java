package view;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import models.*;

public class CircleClickListener extends MouseAdapter {
	
	
	private CirclePanel panel;
	
	public CircleClickListener(CirclePanel panel)
	{
		this.panel = panel;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		panel.addCircle(new Circle(new Vertex(), e.getX() - 12, e.getY() - 12, 26, Color.CYAN));
	}

}
