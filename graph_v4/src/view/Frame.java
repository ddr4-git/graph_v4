package view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Frame extends JFrame implements MouseListener{
	
	public Frame()
	{
		
		CirclePanel panel = new CirclePanel();
		
		this.setContentPane(panel);
		panel.addMouseListener(new CircleClickListener(panel));
		
		this.setSize(500,400);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.addMouseListener(this);
		
		
		this.setVisible(true);

	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Hello");
		
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
