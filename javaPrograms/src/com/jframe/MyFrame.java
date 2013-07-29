package com.jframe;

import java.awt.Container;
import java.awt.event.*;

import javax.swing.JFrame;

import com.jframe.jpanel.MyPanel;

public class MyFrame extends JFrame{

	public MyFrame(){
		setTitle("JFrame: This is my first JFrame program");
		setSize(500, 400);
		setLocation(10, 200);
		
		// windows listeners
		addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("windowOpened: "+arg0.toString());
			}
			
			@Override
			public void windowIconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("windowIconified: "+arg0.toString());
			}
			
			@Override
			public void windowDeiconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("windowDeiconified: "+arg0.toString());
			}
			
			@Override
			public void windowDeactivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("windowDeactivated: "+arg0.toString());
			}
			
			@Override
			public void windowClosing(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("windowClosing: "+arg0.toString());
			}
			
			@Override
			public void windowClosed(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("windowClosed: "+arg0.toString());
				System.exit(0);
			}
			
			@Override
			public void windowActivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("windowActivated: "+arg0.toString());
			}
		});
		
	}
	
	public MyFrame(String getTitle){
		setTitle(getTitle);
		setSize(500, 400);
		setLocation(10, 200);
		// Add Windows Listeners		
		addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("windowClosing: "+arg0);
				System.exit(0);
			}
			
			@Override
			public void windowClosed(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		// Add Panels
		Container contentPane = getContentPane();
		contentPane.add(new MyPanel());
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame mf = new MyFrame();
		mf.show();
	}

}
