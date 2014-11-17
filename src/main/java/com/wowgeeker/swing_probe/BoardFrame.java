package com.wowgeeker.swing_probe;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BoardFrame  extends Frame{

	public BoardFrame(){
		super("demo");
	    super.setSize(420, 250);
	    super.setBackground(Color.white);
	    super.addWindowListener(new WindowAdapter(){
	    	public void windowClosing(WindowEvent e){
	    		System.exit(0);
	    	}
	    });	    
	    this.addButtons();
	}	
	
	private void addButtons(){		
		InputStream is = this.getClass().getResourceAsStream("/fontawesome-webfont.ttf");
		Font font=null;
		try {
			font = Font.createFont(Font.TRUETYPE_FONT, is);
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        font = font.deriveFont(Font.PLAIN, 24f);
		
		JPanel toolbar = new JPanel( );
		toolbar.setBackground(Color.white);
		toolbar.setLayout(new FlowLayout(FlowLayout.LEFT));

		JButton btn = new JButton("ANNA");
		btn.setSize(300, 30);
		toolbar.add(btn);
		
        JLabel label = new JLabel(" \uf0c0");
        label.setFont(font);
        label.setForeground(Color.red);
        

		
		super.add(toolbar);
		
		super.add(label);
		
		
	}
	
	
	
}
