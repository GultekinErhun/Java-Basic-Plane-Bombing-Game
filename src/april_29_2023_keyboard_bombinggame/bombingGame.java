package april_29_2023_keyboard_bombinggame;
import java.awt.*;
import java.awt.event.*;


import java.awt.*;
import java.awt.event.*;


public class bombingGame implements WindowListener
{
	private Frame Frame1;
	private kanvas06 k;
	
	private int Frame_size_x_bound=1280;
	private int Frame_size_y_bound=720;

	
	public bombingGame()
	{
		Frame1 = new Frame();
		k = new kanvas06(Frame_size_x_bound,Frame_size_y_bound);
		Frame1.addWindowListener(this);
		Frame1.add(k);
		Frame1.setSize(Frame_size_x_bound,Frame_size_y_bound);
		Frame1.setResizable(true);
		Frame1.setVisible(true);
	}
	
	public static void main(String args[])
	{
		bombingGame uygulama = new bombingGame();
	}

	public void windowOpened(WindowEvent e) {}
	public void windowClosing(WindowEvent e) 
	{
		System.exit(0);
	}
	public void windowClosed(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
}

