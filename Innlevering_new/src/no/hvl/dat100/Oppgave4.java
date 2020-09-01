package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;


public class Oppgave4 {

	public static void main(String[] args) {
		// Lese inn bruttoinntekt
		int brutto = parseInt(showInputDialog("Oppgi bruttoinntekt: "));
		
		int trinnskatt = 0;
		
		if (brutto <= 164100){
			showMessageDialog(null, "Det er ingen trinnskatt");
		}
		else {
			if (brutto>=164101 && brutto <=230950){
				trinnskatt = (int)((brutto * 0.93)/100);
			}
			if (brutto>=230951 && brutto <=580650){
				trinnskatt = (int)((brutto * 2.41)/100);
			}
			if (brutto>=580651 && brutto <=934050){
				trinnskatt = (int)((brutto * 11.52)/100);
			}
			if (brutto>=934051){
				trinnskatt = (int)((brutto * 14.52)/100);
			}
		}	
		showMessageDialog(null, "Trinnskatten er " +trinnskatt + " kr");
	}
}
