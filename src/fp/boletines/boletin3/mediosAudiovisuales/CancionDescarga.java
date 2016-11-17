package fp.boletines.boletin3.mediosAudiovisuales;

import fp.musica.Cancion;

public interface CancionDescarga extends Cancion{
	
	Double getTamanyo();
	FormatoCancion getFormato();
	
	void setTamanyo(Double tam);

}
