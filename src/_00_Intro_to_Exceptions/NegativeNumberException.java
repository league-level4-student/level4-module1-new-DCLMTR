package _00_Intro_to_Exceptions;

import javax.swing.JOptionPane;

public class NegativeNumberException extends Exception{
	public void scarpPopup() {
		JOptionPane.showMessageDialog(null, "You have triggered a critical error on your computer.");
	}
}