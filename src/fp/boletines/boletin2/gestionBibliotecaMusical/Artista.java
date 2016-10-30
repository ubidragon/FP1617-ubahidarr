package fp.boletines.boletin2.gestionBibliotecaMusical;

public interface Artista {

	String getID();

	String getNombre();

	String getGenero();

	Integer getPopularidad();

	String getURL();

	void setPopularidad(Integer popularidad);

	void setUrl(String url);

}
