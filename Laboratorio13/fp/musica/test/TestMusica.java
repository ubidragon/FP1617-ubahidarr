package fp.musica.test;

import java.util.List;

import fp.musica.Cancion;
import fp.musica.Musica;

public class TestMusica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Cancion> canciones = Musica.createCanciones("resources/canciones.txt");
		System.out.println(canciones);
	}

}
