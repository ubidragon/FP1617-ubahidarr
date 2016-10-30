package fp.boletines.boletin2.gestionBibliotecaMusical;

import java.time.Duration;

public class CancionImpl implements Cancion {

	/* PROPIEDADES BASICAS */

	private String id;
	private String nombre;
	private Artista artista;
	private Duration duracion;
	private Integer nPista;
	private Integer popularidad;

	/* CONSTRUCTOR */

	public CancionImpl(String id, String nombre, Artista artista, Duration duracion, Integer nPista,
			Integer popularidad) {
		this.id = id;
		this.nombre = nombre;
		this.artista = artista;
		this.duracion = duracion;
		this.nPista = nPista;
		this.popularidad = popularidad;
	}

	/* GETTERS & SETTERS */

	public String getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public Artista getArtista() {
		return artista;
	}

	public Duration getDuracion() {
		return duracion;
	}

	public Integer getNumeroPista() {
		return nPista;
	}

	public Integer getPopularidad() {
		return popularidad;
	}

	public void setPopularidad(Integer popularidad) {
		this.popularidad = popularidad;
	}

	/* TO STRING */

	public String toString() {
		return getNombre() + " (" + getArtista() + ")";
	}

}
