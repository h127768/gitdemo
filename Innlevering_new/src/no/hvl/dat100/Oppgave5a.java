/*
 * OPPGAVE 5/7a
 * Lag et program som leser inn en poengsum (heltall) 
 * som en student har oppnådd på en prøve, og finn og 
 * skriv ut den karakteren A-F dette tilsvarer.
 * Skriv ut feilmelding ved ugyldig poengsum (negativ verdi eller over 100).
 * 
 */
package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class Oppgave5a {

	public static void main(String[] args) {
		// Lese inn poengsum
		int poeng = parseInt(showInputDialog("Oppgi poengsum: "));
		
		if (poeng <0 || poeng>100){
			showMessageDialog(null, "Ugyldig poengsum !");
		} else {
			if (poeng>=0 && poeng<=39){
				showMessageDialog(null, "Karakter F");
			}
			else if (poeng>=40 && poeng<=49){
				showMessageDialog(null, "Karakter E");
			}
			else if (poeng>=50 && poeng<=59){
				showMessageDialog(null, "Karakter D");
			}
			else if (poeng>=60 && poeng<=79){
				showMessageDialog(null, "Karakter C");
			}
			else if (poeng>=80 && poeng<=89){
				showMessageDialog(null, "Karakter B");
			}
			else {
				showMessageDialog(null, "Karakter A");
			}
		}
			
	}

}
