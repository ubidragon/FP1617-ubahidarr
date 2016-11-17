package fp.boletines.boletin3.mediosAudiovisuales;
/*
 * Por último, implemente un tipo CancionBandaSonora, subtipo de Cancion que añade la siguiente propiedad:
• Película, de tipo Pelicula. Consultable. Indica la película en la que ha sido utilizada la canción como
parte de su banda sonora. El tipo Pelicula se definió en el problema 6 del boletín 2 (Introducción al
diseño de tipos).
Incluya en la clase CancionBandaSonoraImpl un constructor que reciba por parámetros valores para todas
las propiedades básicas del tipo.
La representación como cadena de una canción banda sonora será igual que la de una canción, pero
añadiendo al final “- película: “, y la representación como cadena de la película.
Deberá también implementar una clase TestCancionBandaSonora que incluya un método main en el que se
cree un objeto del tipo y se muestre por la consola tanto la representación como cadena del mismo, com
 */

import fp.musica.Cancion;
import fp.audiovisuales.Pelicula;

public interface CancionBandaSonora extends Cancion{
	
	Pelicula getPelicula();

}
