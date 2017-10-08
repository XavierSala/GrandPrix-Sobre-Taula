package net.xaviersala.Carreres;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App
{
    private static final int NUMERODEVOLTES = 12;
	private static final int LLARGADACIRCUIT = 50;
    private static String[] CORREDORS = { "vermell", "blau", "verd", "rosa", "lila" };

	public static void main( String[] args )
    {
    	// Generar el circuit
    	List<Casella> circuit = new ArrayList<Casella>();
        for(int i=0; i < LLARGADACIRCUIT; i++) {
        	circuit.add(new Casella());
        }

        // crear corredors
        List<Moto> corredors = new ArrayList<Moto>();
        for(String nom: CORREDORS) {
        	corredors.add(new Moto(nom));
        }

        Carrera carrera = new Carrera(NUMERODEVOLTES, circuit, corredors);

        int ronda = 1;
        while(!carrera.isCarreraAcabada()) {
        	System.out.println("RONDA " + ronda);
        	carrera.mou();
        	System.out.println(carrera.getCorredors());
        	ronda++;
        }

        System.out.println("----------------------");
        Collections.sort(carrera.getCorredors(), Collections.reverseOrder());
        System.out.println(carrera.getCorredors());

    }
}
