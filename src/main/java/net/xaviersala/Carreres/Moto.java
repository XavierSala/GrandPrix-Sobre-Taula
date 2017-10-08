package net.xaviersala.Carreres;

public class Moto implements Comparable<Moto> {

	String nom;
	int voltes;
	int casellaOnEsta;
	int vegadesAturat;

	public Moto(String nomDeLaMoto) {
		nom = nomDeLaMoto;
		voltes = 0;
		casellaOnEsta = 0;
		vegadesAturat = 0;
	}

	public boolean mou(int casellesAMoure) {
		if (vegadesAturat == 0) {
			casellaOnEsta = casellaOnEsta + casellesAMoure;
			return true;
		} else {
			vegadesAturat--;
		}
		return false;
	}

	public int getVoltes() {
		return voltes;
	}

	public void incrementaVoltes(int posicio) {
		voltes++;
		casellaOnEsta = posicio;
	}

	public String getNom() {
		return nom;
	}

	public int getCasellaOnEsta() {
		return casellaOnEsta;
	}

	@Override
	public String toString() {
	    String sorra = "";
	    if (vegadesAturat > 0) {
	    	sorra = "SORRA";
	    }
		return nom + " està a " + casellaOnEsta + " " + sorra + "(volta " + voltes +")";
	}

	public void aturat(int i) {
		vegadesAturat = i;		
	}

	public int compareTo(Moto altre) {
		if (voltes > altre.getVoltes()) {
			return 1;
		} else if (voltes < altre.getVoltes()) {
			return -1;
		}
		
		if (casellaOnEsta > altre.getCasellaOnEsta()) {
			return 1;
			
		} else if (casellaOnEsta < altre.getCasellaOnEsta()) {
			return -1;
		}
		
		return 0;
	}
	
	

}
