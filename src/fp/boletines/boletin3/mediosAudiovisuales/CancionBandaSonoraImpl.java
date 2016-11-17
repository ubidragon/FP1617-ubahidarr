package fp.boletines.boletin3.mediosAudiovisuales;

import java.time.Duration;
import fp.musica.Artista;
import fp.musica.CancionImpl;
import fp.audiovisuales.Pelicula;

public class CancionBandaSonoraImpl extends CancionImpl implements CancionBandaSonora {

	private Pelicula pelicula;

	public CancionBandaSonoraImpl(String id, Artista artista, Duration duracion, String nombre, Integer numeroPista,
			Integer popularidad, Pelicula pelicula) {
		super(nombre, nombre, artista, duracion, popularidad, popularidad);
		this.pelicula = pelicula;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public String toString(){
		String res = super.toString();
		res += "- película: " + getPelicula();
		return res;
				
	}

}
