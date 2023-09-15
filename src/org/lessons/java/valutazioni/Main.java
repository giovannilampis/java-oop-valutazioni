package org.lessons.java.valutazioni;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		// Creazione di un array di 20 studenti con dati casuali
        Studente[] studenti = new Studente[20];
        Random random = new Random();

        for (int i = 0; i < studenti.length; i++) {
            int id = i + 1;
            int percentualeAssenze = random.nextInt(101); // Valore casuale da 0 a 100
            double mediaVoti = random.nextDouble() * 5.0; // Valore casuale da 0.0 a 5.0
            studenti[i] = new Studente(id, percentualeAssenze, mediaVoti);
        }
        
     // Contatore per studenti promossi
        int studentiPromossi = 0;
        
        // Stampare le informazioni di ciascuno studente e determinare se è promosso o bocciato
        for (Studente studente : studenti) {
            System.out.println("ID: " + studente.getId());
            System.out.println("Percentuale Assenze: " + studente.getPercentualeAssenze());
            System.out.println("Media Voti: " + studente.getMediaVoti());

            if (!studente.isBocciato()) {
                System.out.println("Lo studente è promosso.");
                studentiPromossi++;
            } else {
                System.out.println("Lo studente è bocciato.");
            }

            System.out.println("----------------------------------------");
        }
        
        // Stampare il numero totale di studenti promossi
        System.out.println("Numero totale di studenti promossi: " + studentiPromossi);
	}
}
