package fp.audiovisuales;
import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
/**
 * @author Toñi Reina
 * 
 */
public interface Pelicula extends Comparable<Pelicula> {
	Integer getId(); 
	String getTitulo();
	String getTituloOriginal();
	String getIdiomaOriginal();
	LocalDate getFechaEstreno();
	Duration getDuracion();
	TipoMetraje getTipoMetraje();
	List<String> getGeneros(); // antes era String 
	List<String> getProductoras(); // antes era String
	List<String> getPaises(); // antes era String
	List<MiembroStaff> getDirectores(); // antes era MiembroStaff
	List<MiembroStaff> getActores(); // nueva propiedad
	List<MiembroStaff> getGuionistas(); // nueva propiedad
	String getURLPoster(); //Poster de la película

	void setTituloOriginal(String titulo);
	void setIdiomaOriginal(String idioma);
	void setFechaEstreno(LocalDate fecha);
	void setDuracion(Duration duracion);
	void setGeneros(List<String> generos); // antes era String 
	void setProductoras(List<String> productoras); // antes era String 
	void setPaises(List<String> paises); // antes era String 
	void setDirectores(List<MiembroStaff> director); // antes era MiembroStaff
	void setActores(List<MiembroStaff> actores); // nueva propiedad
	void setGuionistas(List<MiembroStaff> guionistas); // nueva propiedad
	void setURLPoster(String poster);
	
	/**
	 * @param actor Nombre de actor
	 * @return True si el actor con el nombre dado como parámetro participa en la pelicula
	 */
	Boolean esActor (String nombreActor);
	/**
	 * @param director Nombre de director.
	 * @return True si el director con el nombre dado como parámetro participa en la película.
	 */
	Boolean esDirector(String nombreDirector);
	
}
