/*
 * Lag et program for å finne alle oddetallene 
 * fra og med en nedre grense til og med en øvre grense.
 * 
 */
package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave2 {

	public static void main(String[] args) {
		
		int x1 = parseInt(showInputDialog("Oppgi tall 1: "));
		int x2 = parseInt(showInputDialog("Oppgi tall 2: "));
		
		int nedreGrense = 0;
		int ovreGrense = 0;
		
		if(x1 > x2) {
			nedreGrense = x2;
			ovreGrense = x1;
		}else {
			nedreGrense = x1;
			ovreGrense = x2;
		}
		
		System.out.println("Alle oddetallene mellom " + nedreGrense +" og " +ovreGrense);
		System.out.println();
		
		for(int tall = nedreGrense; tall <= ovreGrense; tall++){
			if(tall % 2 != 0) {
				System.out.print(tall + " ");
			}
			
		}
		
		showMessageDialog(null,"Nedre grense " +nedreGrense +"\n" + "Øvre grense " +ovreGrense);
		
	}
}
