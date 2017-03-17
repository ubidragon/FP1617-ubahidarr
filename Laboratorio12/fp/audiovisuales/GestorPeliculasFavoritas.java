package fp.audiovisuales;

import java.util.Collection;
import java.util.Set;

//TODO B5 Paco
public interface GestorPeliculasFavoritas {

	/**
	 * Propiedad b�sica. Solo consultable.
	 * 
	 * @return El id del gestor de peliculas
	 */
	String getId();

	/**
	 * Propiedad b�sica solo consultable.
	 * 
	 * @return Nombre del usuario que gestiona las pel�culas
	 */
	String getNombre();

	/**
	 * Propiedad b�sica. Solo consultable.
	 * 
	 * @return Conjunto de pel�culas favoritas del usuario.
	 */
	Set<Pelicula> getPeliculas();

	/**
	 * A�ade la pel�cula al conjunto de pel�culas favoritas del usuario.
	 * 
	 * @param pelicula
	 *            Pel�cula a a�adir a las favoritas.
	 */
	void nuevaPelicula(Pelicula pelicula);

	/**
	 * A�ade la colecci�n de pel�culas a la lista de pel�culas favoritas del
	 * usuario
	 * 
	 * @param peliculas
	 *            Colecci�n de pel�culas a a�adir a la colecci�n.
	 */
	void nuevasPeliculas(Collection<Pelicula> peliculas);

	/**
	 * @param pelicula
	 *            Elimina la pelicula del conjunto de favoritas;
	 */
	void eliminaPelicula(Pelicula pelicula);

	/**
	 * @param nombreActor
	 *            Nombre del un actor
	 * @return El n�mero de pel�culas en las que ha participado el actor dado
	 *         como par�metro.
	 */
	Integer cuentaPeliculas(String nombreActor);

	/**
	 * @return Devuelve el actor de que ha participado en m�s pel�culas.
	 */
	MiembroStaff getActorMasPeliculas();

	/**
	 * @param director
	 *            Nombre de director
	 * @return True si hay alguna pel�cula dirigida por el director con el
	 *         nombre que se pasa como par�metro.
	 */
	Boolean hayAlgunaPeliculaDirigidaPor(String nombreDirector);

	/**
	 * @return Devuelve la pel�cula en la que han participado m�s actores.
	 */
	Pelicula getPeliculaMasActores();
	
	/**
	 * @return Devuelve el conjunto de actores que ha participado en todas las pel�culas.
	 */
	Set<MiembroStaff> seleccionaActoresParticipantesTodas();
	
	/**
	 * @param director Nombre de director
	 * @return El conjunto de pel�culas dirigidas por el director dado como par�metro.
	 */
	Set<Pelicula> getPeliculasDirigidasPor(String nombreDirector);
	
	/**
	 * @return El conjunto de g�neros de las pel�culas del gestor.	
	 */
	Set<String> getGeneros();
	
	/**
	 * @param any A�o
	 * @return El conjunto de pel�culas estrenadas en el a�o dado como par�metro
	 */
	Set<Pelicula> getPeliculasAnyo(Integer anyo);
	
	/**
	 * @param actor Nombre de actor
	 * @return El conjunto de las pel�culas en las que trabaja el actor dado como par�metro
	 */
	Set<Pelicula> getPeliculasDeActor(String nombreActor);
	
	/**
	 * @return El conjunto de paises a los que pertenecen las peliculas del gestor.
	 */
	Set<String> getPaises();
}
