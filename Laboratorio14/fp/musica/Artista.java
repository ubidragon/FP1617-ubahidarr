package fp.musica;

import java.util.List;

/**
 * Tipo que representa un artista. Los artistas se ordenan por su id.
 * 
 * @author reinaqu
 *
 */
public interface Artista extends Comparable<Artista> {
	/**
	 * @return El id del artista. Es una cadena de 22 car�cteres en base 62
	 */
	String getId();

	/**
	 * @return El nombre del artista.
	 */
	String getNombre();

	/**
	 * @return Una lista con los g�neros musicales que interpreta el artisa.
	 */
	List<String> getGeneros();

	/**
	 * @return La popularidad del artista como un entero entre 1 y 100.
	 */
	Integer getPopularidad();

	/**
	 * @return Una lista con URLs de im�genes del artisa.
	 */
	List<String> getURLImagenes();

	/**
	 * @param urlImagenes
	 *            Nueva lista con urls de im�genes del artista. Todas las urls
	 *            deben comenzar por http.
	 * @throws IllegalArgumentException
	 *             si la lista es nula.
	 * @throws IllegalArgumentException
	 *             si hay alguna url de la lista que no comience por http
	 */
	void setURLImagenes(List<String> urlImagenes);

	/**
	 * @param popularidad
	 *            Nueva popularidad del artista. Debe estar entre 1 y 100.
	 * @throws IllegalArgumentException
	 *             si el par�metro popularidad no est� entre 1 y 100.
	 * @throws IllegalArgumentException
	 *             si la popularidad es nula.
	 */
	void setPopularidad(Integer popularidad);
}
