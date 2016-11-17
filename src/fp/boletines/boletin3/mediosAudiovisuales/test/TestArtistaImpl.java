package fp.boletines.boletin3.mediosAudiovisuales.test;

import fp.boletines.boletin3.mediosAudiovisuales.ArtistaPerfil;
import fp.boletines.boletin3.mediosAudiovisuales.ArtistaPerfilImpl;
import fp.boletines.boletin3.mediosAudiovisuales.RedSocial;

public class TestArtistaImpl {

	public static void main(String[] args) {
		ArtistaPerfil a = new ArtistaPerfilImpl("X49", "ACDC", "Rock", 9, null, "ACDC", RedSocial.TELEGRAM);
		
		System.out.println(a);
	}

}
