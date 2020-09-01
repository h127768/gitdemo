/*
 * Lag et program som leser inn et heltall n > 0, beregner verdien n! 
 * (n fakultet) og skriver verdien til n! der n! = 1\*2\*3\*…\*(n-1)\*n.
 * 
 */

package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave6 {

	public static void main(String[] args) {
		System.out.println("Bregner verdien n!");
		
		int n = parseInt(showInputDialog("Oppgi et tall: "));
		int k = 1;
		long fakultet = 1;
		
		if (n == 0 || n == 1){
			showMessageDialog(null, n + "! = " +fakultet);
		} else {
			while(k <= n) {
				fakultet = fakultet * k;
				k++;
			}
			showMessageDialog(null, n + "! = " +fakultet);
		}
		
	}

}
