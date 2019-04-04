package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String smg = JOptionPane.showInputDialog("How many of ze nikels do you have? TELL ME!!!");
		// Convert their answer to an in using Integer.parseInt()
		int nukkles = Integer.parseInt( smg );
		// Ask the user how many dimes they have, and convert their answer
		String lmg = JOptionPane.showInputDialog("How many of ze dimes do you have? TELL ME NOW!!!");
		int hobo = Integer.parseInt( lmg );
		// Ask the user how many quarters they have, and convert their answer
		String bozo = JOptionPane.showInputDialog("How many of ze quarters do you have? I Will Find You!");
		int hipi = Integer.parseInt( bozo );
		// Calculate how much money the user has and save it in a double variable 
		double bigMac = (nukkles * 5 + hobo * 10 + hipi * 25);
		bigMac = bigMac / 100 ;
		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, "Your total is $" + bigMac + " Look behind you!");
	}
}

