/*
 * Lag et program for å finne alle oddetallene 
 * fra og med en nedre grense til og med en øvre grense.
 * 
 * Hint Avgjør først om den nedre grensen er et oddetall (bruk operatoren %).
 * 
 */
package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave2 {

	public static void main(String[] args) {
		
		System.out.println("Finn alle oddetallene");
		
		int nedreGrense = 0;
		int ovreGrense = 0;
		int resultat = 0;
		
		for(int i = 1; i <= 5; i++) {
			int tall = parseInt(showInputDialog("Oppgi tall nr " +i));
		
			if(i == 1) {
				nedreGrense = tall;
			}
			
			if(i == 5) {
				ovreGrense = tall;
			}
			
			if(tall % 2 != 0) {
				resultat = tall;
				System.out.print(false);
				
			}
		}
		
		showMessageDialog(null, "Nedre grense " + nedreGrense +"\n" 
		+ "Øvre grense "+ ovreGrense);
		
	}

}
