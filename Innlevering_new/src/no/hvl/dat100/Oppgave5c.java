/*
 * Legg inn kontroll på innlesinga i programmet i pkt. b) 
 * slik at ugyldige poengsummer (negativ verdi eller over 100) må leses inn på nytt.
 * 
 */

package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class Oppgave5c {

	public static void main(String[] args) {
	
		for (int i=1; i<=10; i++) {
			int poeng = parseInt(showInputDialog("Oppgi poengsum for student " +i));
			if (poeng <0 || poeng>100){
				showMessageDialog(null, "Ugyldig poengsum !");
				i = i-1;
			} else {
				if (poeng>=0 && poeng<=39){
					showMessageDialog(null, "Student " + i +": Karakter F");
				}
				else if (poeng>=40 && poeng<=49){
					showMessageDialog(null, "Student " + i +": Karakter E");
				}
				else if (poeng>=50 && poeng<=59){
					showMessageDialog(null, "Student " + i +": Karakter D");
				}
				else if (poeng>=60 && poeng<=79){
					showMessageDialog(null, "Student " + i +": Karakter C");
				}
				else if (poeng>=80 && poeng<=89){
					showMessageDialog(null, "Student " + i +": Karakter B");
				}
				else {
					showMessageDialog(null, "Student " + i +": Karakter A");
				}
			}
		}
	}
}
