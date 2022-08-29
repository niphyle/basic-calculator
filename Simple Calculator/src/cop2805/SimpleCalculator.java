package cop2805;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class SimpleCalculator {

    public String first;
    public String second;
    public String operation;

    public SimpleCalculator(String firstNum, String secondNum, String choice){
        first = firstNum;
        second = secondNum;
        operation = choice;
    }
    static double calculator(String first, String second, String operation) {
		
        double result = 0;
        
       try {
    	   
    	switch(operation){
        case "add":
            result = Double.parseDouble(first) + Double.parseDouble(second);
            break;
        case "subtract":
            result = Double.parseDouble(first) - Double.parseDouble(second);
            break;
        case "multiply":
            result = Double.parseDouble(first) * Double.parseDouble(second);
            break;
        case "divide":
            result = Double.parseDouble(first) / Double.parseDouble(second);
            break;
        }
    	
       } catch (Exception e) {	// if user enters something other than a number
    	   JOptionPane.showMessageDialog(null, "Only numerical values are accepted. Please try again.",
    		        "Error", JOptionPane.ERROR_MESSAGE);
       }

       
       return result;
   }




}
