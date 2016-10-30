package fp.boletines.boletin2.gestionBibliotecaMusical;

public class ArtistaImpl implements Artista {

	private String id;
	private String nombre;
	private String genero;
	private Integer popularidad;
	private String url;

	public ArtistaImpl(String id, String nombre, String genero, Integer popularidad, String url) {
		this.id = id;
		this.nombre = nombre;
		this.genero = genero;
		this.popularidad = popularidad;
		this.url = url;
	}

	public Integer getPopularidad() {
		return popularidad;
	}

	public void setPopularidad(Integer popularidad) {
		this.popularidad = popularidad;
	}

	public String getURL() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getID() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getGenero() {
		return genero;
	}

	public String toString() {
		return nombre + " [" + getID() + "]";
	}

}
