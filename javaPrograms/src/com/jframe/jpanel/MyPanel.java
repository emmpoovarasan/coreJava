package com.jframe.jpanel;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.jframe.MyFrame;

public class MyPanel extends JPanel {
	
	public void paintComponent(Graphics g){  
		super.paintComponent(g);
		
		//g.drawRect(0, 0, 200, 150);
		//g.fillRect(0, 0, 200, 150);
		g.fillRoundRect(20, 100, 200, 150, 5, 5);
		
		Font f = new Font("SansSerif", Font.BOLD, 14);
		Font fi = new Font("SansSerif", Font.BOLD+Font.ITALIC,14);
		
		FontMetrics fm = g.getFontMetrics(f);
		FontMetrics fim = g.getFontMetrics(fi);
		
		int cx=75; int cy=100;
		
		g.setFont(f);

		g.drawString("Hello, ", cx, cy);
		
		
		cx += fm.stringWidth("Hello, ");
		
		g.setFont(fi);
		g.drawString("World!", cx, cy);
		//cy += fm.stringWidth("World!");
		
		
	}
	public static void main (String[] args){
		JFrame jfp = new MyFrame("My Hello World Frame");
		jfp.show();
		
		/*JFrame jf = new MyFrame();
		jf.show();*/
		
	}
}
