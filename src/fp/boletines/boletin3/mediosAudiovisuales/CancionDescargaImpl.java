package fp.boletines.boletin3.mediosAudiovisuales;

import java.time.Duration;

import fp.musica.Artista;
import fp.musica.CancionImpl;

public class CancionDescargaImpl extends CancionImpl implements CancionDescarga {

	private Double tamanyo;
	private FormatoCancion formato;

	public CancionDescargaImpl(String id, Artista artista, Duration duracion, String nombre, Integer numeroPista,
			Integer popularidad, Double tamanyo, FormatoCancion formato) {
		super(nombre, nombre, artista, duracion, popularidad, popularidad);
		this.tamanyo = tamanyo;
		this.formato = formato;
	}

	public Double getTamanyo() {
		return tamanyo;
	}

	public void setTamanyo(Double tamanyo) {
		this.tamanyo = tamanyo;
	}

	public FormatoCancion getFormato() {
		return formato;
	}

	public String toString() {
		String res = super.toString();
		res += " - tamaño del fichero: " + getTamanyo();
		return res;

	}

}
