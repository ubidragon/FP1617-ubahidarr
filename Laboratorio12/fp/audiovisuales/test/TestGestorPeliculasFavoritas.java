package fp.audiovisuales.test;

import fp.audiovisuales.ClienteTMDB;
import fp.audiovisuales.GestorPeliculasFavoritas;
import fp.audiovisuales.Pelicula;
import fp.audiovisuales.UtilesAudiovisuales;
import fp.utiles.Imagenes;

public class TestGestorPeliculasFavoritas {

	public static void main(String[] args) {

		ClienteTMDB cliente = new ClienteTMDB();
		
		System.out.println("Creando gestor pel�culas con filmograf�a de Brad Pitt");
		System.out.println("=====================================================");
		GestorPeliculasFavoritas gestor1 = UtilesAudiovisuales.generaPeliculasActor("Brad Pitt", cliente);
		testGestor(gestor1, "Angelina Jolie","George Clooney", 2012, "RidleyScott", "Joel Coen");

		System.out.println("Creando gestor pel�culas con pel�culas top de 2015");
		System.out.println("==================================================");
		GestorPeliculasFavoritas gestor2 = UtilesAudiovisuales.generaPeliculasTopAnyo(2015, cliente);
		testGestor(gestor2, "Jennifer Lawrence", "Matt Damon", 2015, "RidleyScott", "Joel Coen");
		cliente.close();
		
	}

	public static void testGestor(GestorPeliculasFavoritas gestor, String actor1, String actor2, Integer anyo,
			String director1, String director2){

		System.out.println("�Cuantas peliculas de " + actor1 +" hay en el gestor?");
		System.out.println("Respuesta: " + gestor.cuentaPeliculas(actor1));
		
		System.out.println("�Cu�les son los g�neros de pelis que hay en el gestor");
		System.out.println("Respuesta: " + gestor.getGeneros());
			
		System.out.println("�Qu� pel�culas de " + actor2 + "hay en el gestor?");
		System.out.println("Respuesta: " + gestor.getPeliculasDeActor(actor2));

		System.out.println("�Cu�l es el actor o actriz que ha trabajado en m�s pel�culas del gestor?");
		System.out.println("Respuesta:" + gestor.getActorMasPeliculas());

		System.out.println("�Cu�l la pel�cula del gestor en la que trabajan m�s actores?");
		Pelicula peliMasActores =  gestor.getPeliculaMasActores();
		System.out.println("Respuesta:" +peliMasActores);
		muestraPoster(gestor.getNombre()+ "==> Peli con m�s actores", peliMasActores);
		
		System.out.println("�Qu� pel�culas hay en el gestor del a�o "+ anyo +"?");
		System.out.println("Respuesta:" + gestor.getPeliculasAnyo(anyo));

		System.out.println("�Cuales de las pel�culas del gestor han sido dirigidas por "+ director1 +"?");
		System.out.println("Respuesta:" + gestor.getPeliculasDirigidasPor("Ridley Scott"));
		
		System.out.println("�Hay alguna pel�cula en el gestor dirigida por " + director2+ "?");
		System.out.println("Respuesta:" + gestor.hayAlgunaPeliculaDirigidaPor(director2));
		
		System.out.println("�Cu�les son los pa�ses de las pel�culas del gestor? ");
		System.out.println("Respuesta:" + gestor.getPaises());

		System.out.println("�Cu�les son los actores que trabajan en todas las peliculas del gestor? ");
		System.out.println("Respuesta: " + gestor.seleccionaActoresParticipantesTodas());
	}
	
	private static void muestraPoster(String msg, Pelicula peli){
		if(peli!=null){
			Imagenes.show(msg, peli.getURLPoster() );
		}
	}
}
