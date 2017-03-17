package fp.musica;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import fp.utiles.Ficheros;

public class Musica {

	/** Constructores de String **/
	public static Artista createArtista(String s) {
		return new ArtistaImpl(s);
	}

	public static Cancion createCancion(String s) {
		return new CancionImpl(s);
	}

	/** Constructores por parametros **/
	public static Cancion createCancion(String id, String nombre, List<Artista> artistas, Duration duracion,
			Integer numeroPista, Integer popularidad, String urlPreescucha) {
		return new CancionImpl(id, nombre, artistas, duracion, numeroPista, popularidad, urlPreescucha);
	}

	public static Artista createArtista(String id, String nombre, List<String> generos, Integer popularidad,
			List<String> urlImagenes) {
		return new ArtistaImpl(id, nombre, generos, popularidad, urlImagenes);
	}

	/** Constructores de Copia **/
	public static Cancion createCancion(Cancion c) {
		return createCancion(c.getId(), c.getNombre(), c.getArtistas(), c.getDuracion(), c.getNumeroPista(),
				c.getPopularidad(), c.getURLPreescucha());

	}

	public static Artista createArtista(Artista a) {
		return createArtista(a.getId(), a.getNombre(), a.getGeneros(), a.getPopularidad(), a.getURLImagenes());
	}

	/** Constructores a partir de Fichero **/
	public static List<Cancion> createCanciones(String path) {
		List<Cancion> res = new ArrayList<Cancion>();
		List<String> lineas = Ficheros.leeFichero(path);

		for (String linea : lineas) {
			res.add(createCancion(linea));
		}

		return res;
	}

	public static List<Artista> createArtistas(String path) {
		List<Artista> res = new ArrayList<Artista>();
		List<String> lineas = Ficheros.leeFichero(path);

		for (String linea : lineas) {
			res.add(createArtista(linea));
		}

		return res;

	}

}
