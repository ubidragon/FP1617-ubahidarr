package fp.musica;

import java.time.Duration;
import java.util.List;

/**
 * Tipo que representa una canci�n y que tiene criterio de orden. El criterio de
 * orden de las canciones es por el id de la canci�n.
 * 
 * @author reinaqu
 * @version 1.0.0.
 * 
 */
public interface Cancion extends Comparable<Cancion> {
	/**
	 * @return Una cadena que se usar� como identificador �nico de una canci�n.
	 *         La cadena est� formada por 22 car�cteres en base 62.
	 */
	String getId();

	/**
	 * @return Una lista con los artistas que interpretan la canci�n.
	 */
	List<Artista> getArtistas();

	/**
	 * @return La duraci�n de la canci�n. Debe ser mayor que cero.
	 */
	Duration getDuracion();

	/**
	 * @return El nombre de la canci�n.
	 */
	String getNombre();

	/**
	 * @return El n�mero de pista de la canci�n. Es un entero mayor que cero.
	 */
	Integer getNumeroPista();

	/**
	 * @return Un n�mero entero entre 1 y 100 que representa la popularidad de
	 *         la canci�n.
	 */
	Integer getPopularidad();

	/**
	 * @param popularidad
	 *            Nueva popularidad de la canci�n. Debe estar entre 1 y 100.
	 * @throws IllegalArgumentException,
	 *             si el par�metro popularidad no est� entre 1 y 100.
	 */
	void setPopularidad(Integer popularidad);

	/**
	 * @return Direcci�n web en formato URL para poder hacer una preescucha de
	 *         la canci�n. Comienza por http.
	 */
	String getURLPreescucha();
}
