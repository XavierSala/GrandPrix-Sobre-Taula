package net.xaviersala.Carreres;

import java.util.List;
import java.util.Random;

public class Carrera {

	private static final Random aleatori = new Random();

	List<Casella> circuit;
	List<Moto> corredors;
	int numeroDeVoltes;
	private int midaCircuit;

	public Carrera(int numeroVoltes,
			List<Casella> caselles,
			List<Moto> motos) {
		numeroDeVoltes = numeroVoltes;
		circuit = caselles;
		corredors = motos;
		midaCircuit = caselles.size();
	}

	public void mou() {

		for(Moto corredor : corredors) {
			if (corredor.mou(aleatori.nextInt(6)+1)) {

				if (corredor.getCasellaOnEsta() >= midaCircuit) {
					corredor.incrementaVoltes(corredor.getCasellaOnEsta() % midaCircuit);
				}

				if (circuit.get(corredor.getCasellaOnEsta()).isSorra()) {
					corredor.aturat(1);
				}
			}
		}
	}

	public boolean isCarreraAcabada() {

		for(Moto corredor: corredors) {
			if (corredor.getVoltes() >= numeroDeVoltes) {
				return true;
			}
		}

		return false;
	}

	public List<Moto> getCorredors() {
		return corredors;
	}
}
