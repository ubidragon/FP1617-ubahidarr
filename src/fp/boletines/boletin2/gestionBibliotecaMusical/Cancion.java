/**
 * 
 */
package fp.boletines.boletin2.gestionBibliotecaMusical;

import java.time.Duration;

public interface Cancion {

	String getId();

	String getNombre();

	Artista getArtista();

	Duration getDuracion();

	Integer getNumeroPista();

	Integer getPopularidad();

	void setPopularidad(Integer popularidad);

}
