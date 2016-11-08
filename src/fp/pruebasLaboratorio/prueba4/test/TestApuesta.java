package fp.pruebasLaboratorio.prueba4.test;

import java.time.LocalDateTime;

import fp.pruebasLaboratorio.prueba4.Apuesta;
import fp.pruebasLaboratorio.prueba4.ApuestaImpl;
import fp.pruebasLaboratorio.prueba4.PartidoFutbol;
import fp.pruebasLaboratorio.prueba4.PartidoFutbolImpl;

public class TestApuesta {

	public static void main(String[] args) {

		PartidoFutbol p = new PartidoFutbolImpl(LocalDateTime.of(2015, 6, 24, 19, 25), "Betis", "Madrid", 1, 3);

		Apuesta a = new ApuestaImpl("DemoUser", LocalDateTime.of(2016, 9, 25, 19, 35), p, 10.0f, 5, 8);
		Apuesta a1 = new ApuestaImpl("Prueba", LocalDateTime.of(2016, 12, 25, 19, 35), p.getEquipoLocal(), p.getEquipoVisitante(), 15.0f, 7, 3,
				p.getGolesLocal(), p.getGolesVisitante());

		muestraApuesta(a);
		muestraApuesta(a1);

		testConstructor("DemoUser", LocalDateTime.of(2016, 9, 25, 19, 35), p, 10.0f, 5, 8);
		testConstructor2("Prueba", LocalDateTime.of(2016, 12, 25, 19, 35), p.getEquipoLocal(), p.getEquipoVisitante(), 15.0f, 7, 3,
				p.getGolesLocal(), p.getGolesVisitante());

		muestraPropiedades(a,p);
		muestraPropiedades(a1,p);
		
		
	}

	private static void muestraApuesta(Apuesta a) {

		System.out.println(a);

	}

	private static void testConstructor(String idUsuario, LocalDateTime fechaApuesta, PartidoFutbol partido, Float cantidad,
			Integer golesLocal, Integer golesVisitante){

		Apuesta a = new ApuestaImpl(idUsuario, fechaApuesta, partido, cantidad,
			golesLocal, golesVisitante);

			System.out.println(a);



	}

	private static void testConstructor2(String idUsuario, LocalDateTime fechaApuesta, String local, String visitante, Float cantidad,
			Integer golesLocal, Integer golesVisitante, Integer golesRealesLocal, Integer golesRealesVisitante){

		Apuesta a = new ApuestaImpl(idUsuario, fechaApuesta, local, visitante, cantidad,
			golesLocal, golesVisitante, golesRealesLocal, golesRealesVisitante);

		System.out.println(a);


	}


	private static void muestraPropiedades(Apuesta a, PartidoFutbol p) {

		System.out.println("\nInformacion principal: \n \t" + a);
		System.out.println("\t<===========================>");
		System.out.println("idUsuario: " + a.getIdUsuario());
		System.out.println("Fecha Apuesta: " + a.getFechaApuesta());
		System.out.println("Partido: " + a.getPartido());
		System.out.println("Equipo Local: " + p.getEquipoLocal());
		System.out.println("Equipo Visitante: " + p.getEquipoVisitante());
		System.out.println("golesRealesLocal: " + p.getGolesLocal());
		System.out.println("golesRealesVisitante: " + p.getGolesVisitante());
		System.out.println("golesLocal Apostados:" + a.getGolesLocal());
		System.out.println("golesVisitante Apostados: " + a.getGolesVisitante());

	}


}
