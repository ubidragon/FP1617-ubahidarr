package fp.musica;

import java.util.ArrayList;
import java.util.List;

import fp.utiles.Checkers;

/**
 * Clase que implementa al tipo artista.
 * 
 * @author reinaqu
 *
 */
public class ArtistaImpl implements Artista {
	// Atributos
	private String id;
	private String nombre;
	private List<String> generos;
	private Integer popularidad;
	private List<String> urlImagenes;

	private static final String R_ID = "El Id deben ser 22 carácteres en base 62";
	private static final String R_POPULARIDAD = "La popularidad tiene que estar entre 1 y 100";
	private static final String R_URLIMAGEN = "La URL debe comenzar por http";

	// “1234567890abcdefABCDEF # Dire Straits # 74 # Rock, Country #
	// http://url1, http://url2”
	public ArtistaImpl(String s) {
		String[] trozos = s.split("#");
		Checkers.check("Formato incorrecto de la cadena de entrada", trozos.length == 5);

		String id = trozos[0].trim();
		Integer popularidad = new Integer(trozos[2].trim());
		List<String> urlImagenes = parseaElementos(trozos[4].trim());
		Checkers.check(R_ID, restriccionId(id));
		Checkers.check(R_POPULARIDAD, restriccionPopularidad(popularidad));
		Checkers.check(R_URLIMAGEN, restriccionURLImagenes(urlImagenes));

		this.id = id;
		this.nombre = trozos[1].trim();
		this.generos = parseaElementos(trozos[3].trim());
		this.popularidad = popularidad;
		this.urlImagenes = urlImagenes;
	}

	private List<String> parseaElementos(String s) {
		List<String> res = new ArrayList<>();
		String[] elementos = s.split(",");
		for (String elemento : elementos) {
			res.add(elemento.trim());
		}
		return res;
	}

	/**
	 * @param id
	 *            Identificador del artista. Debe ser El Id deben ser 22
	 *            carácteres en base 62.
	 * @param nombre
	 *            Nombre del artista.
	 * @param generos
	 *            Lista con los géneros musicales del artista.
	 * @param popularidad
	 *            Popularidad del artista. Debe estar entre 1 y 100.
	 * @param urlImagenes
	 *            Lista con urls de imágenes del artista. Todas las urls deben
	 *            comenzar por http.
	 * @throws IllegalArgumentException
	 *             si alguno de los parámetros es nulo.
	 * @throws IllegalArgumentException
	 *             si el id no es una cadena de 22 caracteres en base 62
	 * @throws IllegalArgumentException
	 *             si la popularidad no está entre 1 y 100
	 * @throws IllegalArgumentException
	 *             si alguna de las urls de la lista no comienza por http.
	 */
	public ArtistaImpl(String id, String nombre, List<String> generos, Integer popularidad, List<String> urlImagenes) {
		Checkers.checkNoNull(id, nombre, generos, popularidad, urlImagenes);

		// Las restricciones se pueden encapsular en métodos privados o poner
		// directamente la expresion las siguientes dos líneas hacen los mismo
		Checkers.check(R_ID, restriccionId(id));

		Checkers.check(R_POPULARIDAD, restriccionPopularidad(popularidad));
		Checkers.check(R_URLIMAGEN, restriccionURLImagenes(urlImagenes));
		this.id = id;
		this.nombre = nombre;
		this.generos = new ArrayList<String>(generos); // Lo copiamos porque
														// esta propiedad es
														// sólo consultable
		this.popularidad = popularidad;
		this.urlImagenes = new ArrayList<String>(urlImagenes); // Lo copiamos
																// porque esta
																// propiedad
																// tiene
																// restricciones
	}

	private static Boolean restriccionId(String id) {
		return id.length() == 22;
	}

	private static Boolean restriccionPopularidad(Integer p) {
		return p >= 1 && p <= 100;
	}

	/* Requiere un tratamiento secuencial */
	private static Boolean restriccionURLImagenes(List<String> urlImagenes) {
		Boolean res = true;
		for (String url : urlImagenes) {
			if (!url.startsWith("http")) {
				res = false;
				break;
			}
		}
		return res;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fp.musica.Artista#getPopularidad()
	 */
	public Integer getPopularidad() {
		return popularidad;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fp.musica.Artista#setPopularidad(java.lang.Integer)
	 */
	public void setPopularidad(Integer popularidad) {
		Checkers.checkNoNull(popularidad);
		Checkers.check(R_POPULARIDAD, restriccionPopularidad(popularidad));
		this.popularidad = popularidad;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fp.musica.Artista#getURLImagenes()
	 */
	public List<String> getURLImagenes() {
		return new ArrayList<String>(urlImagenes);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fp.musica.Artista#setURLImagenes(java.util.List)
	 */
	public void setURLImagenes(List<String> urlImagenes) {
		Checkers.checkNoNull(urlImagenes);
		Checkers.check(R_URLIMAGEN, restriccionURLImagenes(urlImagenes));
		this.urlImagenes.clear();
		this.urlImagenes.addAll(urlImagenes);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fp.musica.Artista#getId()
	 */
	public String getId() {
		return id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fp.musica.Artista#getNombre()
	 */
	public String getNombre() {
		return nombre;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fp.musica.Artista#getGeneros()
	 */
	public List<String> getGeneros() {
		return new ArrayList<String>(generos);
	}

	/**
	 * @return La representación como cadena del artista. La representación como
	 *         cadena de un artista es su nombre, seguido de su id entre
	 *         corchetes.
	 */
	public String toString() {
		return getNombre() + " [" + getId() + "]";
	}

	/**
	 * @return true si los artistas son iguales. Dos artistas son iguales si
	 *         tienen el mismo id.
	 */
	public boolean equals(Object o) {
		boolean res = false;
		if (o instanceof Artista) {
			Artista a = (Artista) o;
			res = this.getId().equals(a.getId());
		}
		return res;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		return getId().hashCode();
	}

	/**
	 * Un artista es anterior a otro si su id es anterior.
	 */
	public int compareTo(Artista a) {
		return this.getId().compareTo(a.getId());
	}

}
