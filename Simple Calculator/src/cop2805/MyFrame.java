package cop2805;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class MyFrame extends JFrame {
	// create public variables
	public JTextField firstNum;
	public JTextField secondNum;
	public JButton calculateButton;
	public JComboBox choice;
	public JLabel result;
	
	double results;
	
	public MyFrame() {
		super();
		init();
	}

	private void init() {
		// Initialize variables
		firstNum = new JTextField();
		secondNum = new JTextField();
		calculateButton = new JButton("Calculate");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Basic Calculator");
		this.setLayout(new GridLayout(5, 2));	
		
		// Text fields
		this.add(new JLabel("First Number:"));	
		this.add(firstNum);						                
		this.add(new JLabel("Second Number:"));
		this.add(secondNum);					                
		
		
		// // JCombobox
		this.add(new JLabel("Operation:"));	 
		String[] operations = {"add", "subtract", "multiply", "divide"};
		choice = new JComboBox(operations);
        this.add(choice);

		
		// Calculate JButton
        JLabel blankSpace = new JLabel(" ");
        this.add(blankSpace);
		calculateButton.addActionListener(new MyActionListener(this));	// create ActionListener
		this.getContentPane().add(calculateButton);	
		

		
		// Results JLabel 
		result = new JLabel();	
		this.add(result);

		// Set up the frame position/size
		int frameWidth = 300;
		int frameHeight = 200;
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setBounds( 
				(int) screenSize.getWidth(), 			
				(int) screenSize.getHeight(), 	
				frameWidth, 
				frameHeight); 
		this.setLocationRelativeTo(null);	// Set to the center of the screen

		this.setVisible(true);
	}
}

class MyActionListener implements ActionListener{
    MyFrame fr;

    public MyActionListener(MyFrame frame){
        fr = frame;
    }
	
	public void actionPerformed(ActionEvent e) {		

        String firstNum = fr.firstNum.getText();                // Get values for numbers
        String secondNum = fr.secondNum.getText();      
        String choice = (String) fr.choice.getSelectedItem();	// get operation

        double results = SimpleCalculator.calculator(firstNum, secondNum, choice);
		fr.result.setText("Results: " + results);

	}

}