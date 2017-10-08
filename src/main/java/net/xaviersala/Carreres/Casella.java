package net.xaviersala.Carreres;

import java.util.Random;

public class Casella {

	private static final Random aleatori = new Random();
	private boolean sorra;


	public Casella() {
		sorra = (aleatori.nextInt(100) < 10);
	}


	public Casella(boolean teSorra) {
		sorra = teSorra;
	}

	public boolean isSorra() {
		return sorra;
	}

}
