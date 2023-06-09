package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;

public class MainFrame implements ActionListener{
	
	
	JFrame frame = new JFrame();

	JButton loadButton = new JButton("Load Graph");
	JButton createButton = new JButton("Create Graph");
	
	public MainFrame()
	{
		createButton.setPreferredSize(new Dimension(400,50));
		loadButton.setPreferredSize(new Dimension(400,50));
		
		createButton.setFocusable(false);
		loadButton.setFocusable(false);
		
		createButton.setBackground(new Color(255,250,250));
		loadButton.setBackground(new Color(250,250,255));
		
		
		
		//Action Listener
		
		createButton.addActionListener(this);
		loadButton.addActionListener(this);
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(900,700);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 300));
		
		
		//Components
		frame.add(createButton);
		frame.add(loadButton);
		
		
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == createButton)
		{
			frame.dispose();
			new Frame();
		}
		
	}

}
