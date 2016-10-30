package fp.boletines.boletin2.gestionBibliotecaMusical.test;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import fp.boletines.boletin2.gestionBibliotecaMusical.Artista;
import fp.boletines.boletin2.gestionBibliotecaMusical.ArtistaImpl;
import fp.boletines.boletin2.gestionBibliotecaMusical.Cancion;
import fp.boletines.boletin2.gestionBibliotecaMusical.CancionImpl;

public class TestCancion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Artista art = new ArtistaImpl("15524dfrew545", "ACDC", "Rock", 82, "http://noexiste.com");

		Cancion c = new CancionImpl("15524dfrew545", "Back in Black", art, Duration.ofSeconds(255), 5, 67);

		muestraCancion(c);

	}

	private static void muestraCancion(Cancion c) {

		System.out.println("Cancion: " + c);
		System.out.println("\t =======INFO======");
		System.out.println("ID: " + c.getId());
		System.out.println("Nombre: " + c.getNombre());
		System.out.println("Artista: " + c.getArtista());
		// falta formatear la la duracion
		System.out.println("Duracion: " + c.getDuracion().get(ChronoUnit.MINUTES));
		System.out.println("Numero de pista:" + c.getNumeroPista());
		System.out.println("Popularidad: " + c.getPopularidad());

	}

}
