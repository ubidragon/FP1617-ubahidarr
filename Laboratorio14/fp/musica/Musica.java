package fp.musica;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import fp.utiles.Ficheros;

public class Musica {
	// En esta clase faltan los métodos creacionales de Album y
	// ListaReproduccion

	// Métodos creacionales para el tipo Artista

	public static Artista creaArtista(String id, String nombre, List<String> generos, Integer popularidad,
			List<String> urlImagenes) {
		return new ArtistaImpl(id, nombre, generos, popularidad, urlImagenes);
	}

	public static Artista creaArtista(String s) {
		return new ArtistaImpl(s);
	}

	public static List<Artista> creaArtistas(String path) {
		List<Artista> res = new ArrayList<>();
		List<String> lineas = Ficheros.leeFichero(path);
		for (String s : lineas) {
			res.add(new ArtistaImpl(s));
		}
		return res;
	}

	public static Artista creaArtista(Artista a) {
		return new ArtistaImpl(a.getId(), a.getNombre(), a.getGeneros(), a.getPopularidad(), a.getURLImagenes());
	}

	// Métodos creacionales para el tipo Cancion

	public static Cancion creaCancion(String id, String nombre, List<Artista> artistas, Duration duracion,
			Integer numeroPista, Integer popularidad, String urlPreescucha) {
		return new CancionImpl(id, nombre, artistas, duracion, numeroPista, popularidad, urlPreescucha);
	}

	public static Cancion creaCancion(String s) {
		return new CancionImpl(s);
	}

	public static List<Cancion> creaCanciones(String path) {
		List<Cancion> res = new ArrayList<>();
		List<String> lineas = Ficheros.leeFichero(path);
		for (String s : lineas) {
			res.add(new CancionImpl(s));
		}
		return res;
	}

	public static Cancion creaCancion(Cancion c) {
		return new CancionImpl(c.getId(), c.getNombre(), c.getArtistas(), c.getDuracion(), c.getNumeroPista(),
				c.getPopularidad(), c.getURLPreescucha());
	}

}
