package org.lessons.java.valutazioni;


public class Studente {

	public int id;
	
	public int percentualeAssenze;
	
	public double mediaVoti;
	
	public Studente(int id, int percentualeAssenze, double mediaVoti) {
	     this.id = id;
	     this.percentualeAssenze = percentualeAssenze;
	     this.mediaVoti = mediaVoti;
	}
	
    public boolean isBocciato() {
        if (percentualeAssenze > 50) {
            return true; // Più del 50% di assenze, bocciato
        } else if (percentualeAssenze >= 25 && percentualeAssenze <= 50 && mediaVoti > 2) {
            return false; // Tra il 25% e il 50% di assenze, ma media voti > 2, promosso
        } else if (percentualeAssenze < 25 && mediaVoti >= 2) {
            return false; // Meno del 25% di assenze e media voti >= 2, promosso
        } else {
            return true; // Altrimenti, bocciato
        }
    }
    
    public int getId() {
        return id;
    }

    public int getPercentualeAssenze() {
        return percentualeAssenze;
    }

    public double getMediaVoti() {
        return mediaVoti;
    }
}
