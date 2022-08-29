package cop2805;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class MathGUI {
    public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() 
		{
			public void run()
			{
				constructGUI();
			}
		});

	}
	
	private static void constructGUI() {
		
		JFrame.setDefaultLookAndFeelDecorated(true);	
		MyFrame frame = new MyFrame();					
		frame.setVisible(true);						

	}
}


