package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.RootPaneContainer;
import javax.swing.border.Border;
import java.awt.MenuBar;

import java.awt.MenuBar;
public class Frame extends JFrame implements MouseListener{

	
	JButton vertexButton;
	JButton edgeButton;
	
	public Frame()
	{
		
		vertexButton = new JButton("Vertex");
		edgeButton = new JButton("Edge");
		
		vertexButton.setBackground(new Color(255,254,254));
		edgeButton.setBackground(new Color(255,254,254));
		
		vertexButton.setFocusable(false);
		edgeButton.setFocusable(false);
		
		
		JPanel panel = new JPanel();
		JPanel graphPanel = new JPanel();
		
		
		
		
		panel.setBackground(new Color(255,210,210));
		graphPanel.setBackground(new Color(255,255,255));
		
		panel.setPreferredSize(new Dimension(100,60));
		

				
		panel.setLayout(new GridLayout());
		panel.add(vertexButton);
		panel.add(edgeButton);
		

		
		CirclePanel cpanel = new CirclePanel();
		graphPanel.add(cpanel);
		cpanel.addMouseListener(new CircleClickListener(cpanel));
		
		//this.setSize(700,700);
		//this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//this.setLayout(null);
	
		this.addMouseListener(this);
		
		
		/*Flow Layout
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(0,50));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 0,6));
		
		panel.add(new JButton("Add Vertex"));
		panel.add(new JButton("Add Edge"));
		*/
		
		
		
		
		this.setSize(700,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		this.add(panel, BorderLayout.NORTH);
		this.add(graphPanel, BorderLayout.CENTER);
		
		
		
		
		
		
		this.setVisible(true);

		/*Test 1 BorderLayout
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLayout(new BorderLayout(0,7));
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		JPanel panel6 = new JPanel();
		
		
		panel1.setBackground(Color.BLUE);
		panel2.setBackground(Color.RED);
		panel3.setBackground(Color.GREEN);
		panel4.setBackground(Color.MAGENTA);
		panel5.setBackground(Color.DARK_GRAY);
		
		
		panel1.setPreferredSize(new Dimension(100,100));
		panel2.setPreferredSize(new Dimension(100,100));
		panel3.setPreferredSize(new Dimension(1,50));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		panel6.setPreferredSize(new Dimension(100,100));
		
		
		this.add(panel6, BorderLayout.CENTER);
		//this.add(panel1, BorderLayout.WEST);
		//this.add(panel2, BorderLayout.EAST);
		//this.add(panel3, BorderLayout.NORTH);
		//this.add(panel4, BorderLayout.SOUTH);
		//this.add(panel5, BorderLayout.CENTER);
		*/
		
		/*
		CirclePanel panel = new CirclePanel();
		this.setContentPane(panel);
		panel.addMouseListener(new CircleClickListener(panel));
		
		this.setSize(700,700);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLayout(null);
	
		this.addMouseListener(this);
		
		
		this.setVisible(true);
		
		*/
	}
	
	private void printMessage()
	{
		System.out.println("Hello World");
		//label.setVisible(true);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
	
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
