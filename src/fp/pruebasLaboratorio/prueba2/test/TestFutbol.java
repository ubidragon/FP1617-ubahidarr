package fp.pruebasLaboratorio.prueba2.test;

import java.time.LocalDateTime;

import fp.pruebasLaboratorio.prueba2.PartidoFutbol;
import fp.pruebasLaboratorio.prueba2.PartidoFutbolImpl;

public class TestFutbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PartidoFutbol p = new PartidoFutbolImpl(LocalDateTime.of(2015, 6, 24, 19, 25), "Betis", "Madrid", 1, 3);
		muestraPartido(p);
	}

	private static void muestraPartido(PartidoFutbol f) {

		System.out.println(f);

	}

}
