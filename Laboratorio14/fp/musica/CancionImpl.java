package fp.musica;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import fp.utiles.Checkers;

/**
 * @author reinaqu Clase que implementa al tipo canción
 */
public class CancionImpl implements Cancion {
	// Atributos
	private String id;
	private List<Artista> artistas;
	private Duration duracion;
	private String nombre;
	private Integer numeroPista;
	private Integer popularidad;
	private String urlPreescucha;

	private static final String R_ID = "El Id deben ser 22 carácteres en base 62";
	private static final String R_DURACION = "La duración debe ser positiva";
	private static final String R_NUMPISTA = "El número de pista debe ser positivo";
	private static final String R_POPULARIDAD = "La popularidad tiene que estar entre 0 y 100";
	private static final String R_URLPREESCUCHA = "La URL debe comenzar por http";

	// “1234567890abcdefABCDEF &&& 1234567890abcdefABCDEF # Dire Straits # 74 #
	// Rock, Country # http://url1, http://url2 &&& 647 &&& Sultans of Swing &&&
	// 6 &&& 60 &&& http://url”
	public CancionImpl(String s) {
		String[] trozos = s.split("&&&");
		Checkers.check("Formato incorrecto de la cadena de entrada", trozos.length == 7);

		String id = trozos[0].trim();
		Duration duracion = Duration.ofSeconds(new Integer(trozos[2].trim()));
		Integer numeroPista = new Integer(trozos[4].trim());
		Integer popularidad = new Integer(trozos[5].trim());
		String urlPreescucha = trozos[6].trim();

		Checkers.check(R_ID, restriccionId(id));
		Checkers.check(R_DURACION, restricionDuracion(duracion));
		Checkers.check(R_NUMPISTA, restriccionNumeroPista(numeroPista));
		Checkers.check(R_POPULARIDAD, restriccionPopularidad(popularidad));
		Checkers.check(R_URLPREESCUCHA, restriccionURL(urlPreescucha));

		this.id = id;
		this.artistas = new ArrayList<Artista>();
		this.artistas.add(new ArtistaImpl(trozos[1].trim()));
		this.duracion = duracion;
		this.nombre = trozos[3].trim();
		this.numeroPista = numeroPista;
		this.popularidad = popularidad;
		this.urlPreescucha = urlPreescucha;
	}

	/**
	 * @param id
	 *            Identificador de la canción. Debe ser El Id deben ser 22
	 *            carácteres en base 62
	 * @param nombre
	 *            Nombre de la canción.
	 * @param artistas
	 *            Lista con los artistas que participan en la canción.
	 * @param duracion
	 *            Duración de la canción. Debe ser positiva.
	 * @param numeroPista
	 *            Número de pista en el disco de la canción. Debe ser positiva
	 * @param popularidad
	 *            Popularidad de la canción. Debe estar entre 1 y 100.
	 * @param urlPreescucha
	 *            Dirección web para hacer una preescucha de la canción. Debe
	 *            comenzar por http.
	 * @throws IllegalArgumentException
	 *             si el id no es una cadena formada por 22 caracteres en base
	 *             62.
	 * @throws IllegalArgumentException
	 *             si la duración no es positiva.
	 * @throws IllegalArgumentException
	 *             si el número de pista no es positivo.
	 * @throws IllegalArgumentException
	 *             si la popularidad no está entre 1 y 100.
	 * @throws IllegalArgumentException
	 *             si la URL no comienza por http.
	 * @throws IllegalArgumentException
	 *             si alguno de los parámetros es nulo.
	 */
	public CancionImpl(String id, String nombre, List<Artista> artistas, Duration duracion, Integer numeroPista,
			Integer popularidad, String urlPreescucha) {
		Checkers.checkNoNull(id, artistas, duracion, nombre, numeroPista, popularidad, urlPreescucha);
		Checkers.check(R_ID, restriccionId(id));
		Checkers.check(R_DURACION, restricionDuracion(duracion));
		Checkers.check(R_NUMPISTA, restriccionNumeroPista(numeroPista));
		Checkers.check(R_POPULARIDAD, restriccionPopularidad(popularidad));
		Checkers.check(R_URLPREESCUCHA, restriccionURL(urlPreescucha));

		this.id = id;
		this.artistas = new ArrayList<Artista>(artistas); // Lo copiamos porque
															// la propeidad es
															// sólo consultable
		this.duracion = duracion;
		this.nombre = nombre;
		this.numeroPista = numeroPista;
		this.popularidad = popularidad;
		this.urlPreescucha = urlPreescucha;
	}

	private static Boolean restriccionURL(String url) {
		return url.startsWith("http");
	}

	private static Boolean restriccionPopularidad(Integer p) {
		return p >= 0 && p <= 100;
	}

	private static Boolean restriccionNumeroPista(Integer n) {
		return n > 0;
	}

	private static Boolean restricionDuracion(Duration d) {
		return d.toNanos() > 0;
	}

	private static Boolean restriccionId(String id) {
		return id.length() == 22;
	}

	// Getters and Setters
	/*
	 * (non-Javadoc)
	 * 
	 * @see fp.musica.Cancion#getPopularidad()
	 */
	public Integer getPopularidad() {
		return popularidad;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fp.musica.Cancion#setPopularidad(java.lang.Integer)
	 */
	public void setPopularidad(Integer popularidad) {
		Checkers.checkNoNull(popularidad);
		Checkers.check("La popularidad tiene que estar entre 1 y 100", restriccionPopularidad(popularidad));
		this.popularidad = popularidad;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fp.musica.Cancion#getId()
	 */
	public String getId() {
		return id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fp.musica.Cancion#getArtistas()
	 */
	public List<Artista> getArtistas() {
		return new ArrayList<Artista>(artistas);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fp.musica.Cancion#getDuracion()
	 */
	public Duration getDuracion() {
		return duracion;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fp.musica.Cancion#getNombre()
	 */
	public String getNombre() {
		return nombre;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fp.musica.Cancion#getNumeroPista()
	 */
	public Integer getNumeroPista() {
		return numeroPista;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fp.musica.Cancion#getURLPreescucha()
	 */
	public String getURLPreescucha() {
		return urlPreescucha;
	}

	// OJO: cambia la representación como cadena, ahora se muestran todos los
	// artistas
	/**
	 * @return La representación como cadena de una canción. La representación
	 *         como cadena de una canción es el nombre de la canción seguido de
	 *         un espacio en blanco y la lista de artistas separados por coma y
	 *         entre corchetes.
	 */
	public String toString() {
		return getNombre() + " " + getArtistas();
	}

	/**
	 * @return true si dos canciones son iguales. Dos canciones son iguales si
	 *         tienen el mismo id.
	 */
	public boolean equals(Object o) {
		boolean res = false;
		if (o instanceof Cancion) {
			Cancion c = (Cancion) o;
			res = this.getId().equals(c);
		}
		return res;
	}

	/**
	 * Una canción es anterior a otra si su id es anterior.
	 */
	public int compareTo(Cancion c) {
		return this.getId().compareTo(c.getId());
	}

}
