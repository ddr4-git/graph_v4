package view;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Label extends JLabel {
	
	
	public Label()
	{
		Border border = BorderFactory.createLineBorder(Color.cyan, 3);
		
		
		this.setText("Hello World");
		this.setBorder(border);
		this.setBounds(0,0, 150, 70);   //Set x y position and width heigh
		
		this.setHorizontalAlignment(JLabel.CENTER);
		this.setVerticalAlignment(JLabel.CENTER);
	}
	

}
