package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;


public class Oppgave3 {

	public static void main(String[] args) {
		
		System.out.println("Bruk Math.pow og while-setning for å beregne x^n");
		
		// Lese inn x og n
		double x = parseDouble(showInputDialog("Oppgi verdi av x: "));
		int n = parseInt(showInputDialog("Oppgi n: "));
		
		// Vis resultatet 
		showMessageDialog(null, "(Bruk Math) " +x + "^" + n + " = " +pow(x,n));
		
		// Bruk WHILE-SETNING
		double t = 1;
		int k = 1;
		
		while (k <= n) {
			if (n == 0){
				t =+ x;
			} else {
				t = t*x;
			}
			k = k+1;
		}
		showMessageDialog(null, "(Bruk while-setning)  " +x + "^" +n + " = " + t);
	}

}
