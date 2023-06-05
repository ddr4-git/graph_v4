package view;

import java.awt.Color;
import java.awt.Graphics;

import models.*;

public class Circle {
	
	Vertex vertex;
	private int x;
	private int y;
	private int diameter;
	private Color color;
	
	public Circle(Vertex vertex, int x, int y, int diameter, Color color)
	{
		this.vertex = vertex;
		this.x = x;
		this.y = y;
		this.diameter = diameter;
		this.color = color;
		this.diameter = diameter;
		
	}
	
	public int getX()
	{
		return this.x;
	}
	
	public int getY()
	{
		return this.y;
	}
	
	public void draw(Graphics g)
	{
		g.setColor(color);
		g.fillOval(x, y, this.diameter, this.diameter);
	}

}
