package fp.audiovisuales;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

import fp.utiles.Checkers;

/**
 * @author Toñi Reina
 * 
 */
public class PeliculaImpl implements Pelicula {

	private Integer id; 
	private String titulo;
	private String tituloOriginal;
	private String idiomaOriginal;
	private LocalDate fechaEstreno;
	private Duration duracion;
	private List<String> generos, productoras, paises;
	private List<MiembroStaff> directores, actores, guionistas;
	private String urlPoster;
	
	private static final String R_DURACION = "UNA PELICULA DEBE DURAR AL MENOS UN SEGUNDO";

	public PeliculaImpl(Integer id, String titulo, String tituloOriginal, String idiomaOriginal, LocalDate fechaEstreno, Duration duracion, 
			List<String> generos, List<String> productoras, List<String> paises, List<MiembroStaff> directores, List<MiembroStaff> actores, 
			List<MiembroStaff> guionistas) {
		Checkers.checkNoNull(id, titulo);
		Checkers.check(R_DURACION, restriccionDuracion(duracion));

		this.id = id;
		this.titulo = titulo;
		this.tituloOriginal = tituloOriginal;
		this.idiomaOriginal = idiomaOriginal;
		this.fechaEstreno = fechaEstreno;
		this.duracion = duracion;
		this.urlPoster = null;		
		
		this.generos = generos; 
		this.productoras = productoras; 
		this.paises = paises;
		this.directores = directores; 
		this.actores = actores;
		this.guionistas = guionistas; 
	}

	private static Boolean restriccionDuracion(Duration duracion) {
		return duracion==null || duracion.compareTo(Duration.ofMinutes(0)) > 0;
	}

	public PeliculaImpl(Integer id, String titulo) {
		Checkers.checkNoNull(id, titulo);
		this.id = id;
		this.titulo = titulo;
		this.tituloOriginal = null;
		this.idiomaOriginal = null;
		this.fechaEstreno = null;
		this.duracion = null;
		this.generos = null; 
		this.productoras = null; 
		this.paises = null; 
		this.directores = null; 
		this.actores = null; 
		this.guionistas = null; 
	}

	public Integer getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getTituloOriginal() {
		return tituloOriginal;
	}

	public String getIdiomaOriginal() {
		return idiomaOriginal;
	}

	public LocalDate getFechaEstreno() {
		return fechaEstreno;
	}

	public Duration getDuracion() {
		return duracion;
	}

	public TipoMetraje getTipoMetraje() {
		TipoMetraje res = null;
		if (getDuracion() != null) {
			res = TipoMetraje.LARGOMETRAJE;
			Integer minutos = (int) getDuracion().toMinutes();
			if (minutos < 30) {
				res = TipoMetraje.CORTOMETRAJE;
			} else if (minutos <= 60) {
				res = TipoMetraje.MEDIOMETRAJE;
			}
		}
		return res;
	}

	public List<String> getGeneros() {
		return generos; 
	}

	public List<String> getProductoras() {
		return productoras; 
	}

	public List<String> getPaises() {
		return paises;
	}

	public List<MiembroStaff> getDirectores() {
		return directores; 
	}

	public List<MiembroStaff> getActores() {
		return actores; 
	}

	public List<MiembroStaff> getGuionistas() {
		return guionistas; 
	}

	public void setTituloOriginal(String tituloOriginal) {
		Checkers.checkNoNull(titulo);
		this.tituloOriginal = tituloOriginal;
	}

	public void setIdiomaOriginal(String idiomaOriginal) {
		this.idiomaOriginal = idiomaOriginal;
	}

	public void setFechaEstreno(LocalDate fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}

	public void setDuracion(Duration duracion) {
		Checkers.check(R_DURACION, restriccionDuracion(duracion));
		this.duracion = duracion;
	}

	public void setGeneros(List<String> generos) {
		this.generos = generos;
	}

	public void setProductoras(List<String> productoras) {
		this.productoras = productoras;
	}

	public void setPaises(List<String> paises) {
		this.paises = paises;
	}

	public void setDirectores(List<MiembroStaff> directores) {
		this.directores = directores;
	}

	public void setActores(List<MiembroStaff> actores) {
		this.actores = actores;
	}

	public void setGuionistas(List<MiembroStaff> guionistas) {
		this.guionistas = guionistas;
	}

	public int compareTo(Pelicula p) {
		return this.getId().compareTo(p.getId());
	}

	@Override
	public int hashCode() {
		return getId().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		boolean res = (obj==this); 
		if(!res && obj instanceof Pelicula) {  
			Pelicula p = (Pelicula) obj;
			res = this.getId().equals(p.getId());
		}
		return true;
	}

	public String toString() {
		String res = getId() + " - " + getTitulo() + " ";
		if (getFechaEstreno() != null) {
			res += "(" + getFechaEstreno().getYear() + ") ";

		}
		return res;
	}

	public String getURLPoster() {
		return urlPoster;
	}

	@Override
	public void setURLPoster(String poster) {
		this.urlPoster = poster;
	}
	@Override
	public Boolean esActor(String nombreActor) {
		Checkers.checkNoNull(nombreActor);
		Boolean res = false;
		for(MiembroStaff staff: this.getActores()) {
			res = nombreActor.equals(staff.getNombre());
			if(res) {
				break;
			}
		}
		return res;
	}

	@Override
	public Boolean esDirector(String nombreDirector) {
		Checkers.checkNoNull(nombreDirector);
		Boolean res = false;
		for(MiembroStaff staff: this.getDirectores()) {
			res = nombreDirector.equals(staff.getNombre());
			if(res) {
				break;
			}
		}
		return res;
	}

}
