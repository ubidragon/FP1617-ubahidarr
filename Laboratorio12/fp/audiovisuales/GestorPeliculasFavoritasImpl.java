package fp.audiovisuales;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import fp.utiles.Checkers;

public class GestorPeliculasFavoritasImpl implements GestorPeliculasFavoritas {
	private String id, nombre;
	private Set<Pelicula> peliculas;
	
	public GestorPeliculasFavoritasImpl(String id, String nombre) {
		this.id = id;
		this.nombre = nombre;
		this.peliculas = new HashSet<>();
	}
	public GestorPeliculasFavoritasImpl(String id, String nombre, Set<Pelicula> peliculas) {
		this.id = id;
		this.nombre = nombre;
		this.peliculas = new HashSet<>(peliculas);
	}

	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public Set<Pelicula> getPeliculas() {
		return new HashSet<>(this.peliculas);
	}

	@Override
	public void nuevaPelicula(Pelicula pelicula) {
		Checkers.checkNoNull(pelicula);
		this.peliculas.add(pelicula);
	}

	@Override
	public void nuevasPeliculas(Collection<Pelicula> peliculas) {
		Checkers.checkNoNull(peliculas);
		this.peliculas.addAll(peliculas);
}

	@Override
	public void eliminaPelicula(Pelicula pelicula) {
		Checkers.checkNoNull(pelicula);
		this.peliculas.remove(pelicula);
	}

	@Override
	public Integer cuentaPeliculas(String nombreActor) {
		// TODO: Se resolvió en clase
		return null;
	}

	@Override
	public MiembroStaff getActorMasPeliculas() {
		// TODO: Se resolvió en clase
		return null;
	}


	@Override
	public Boolean hayAlgunaPeliculaDirigidaPor(String nombreDirector) {
		// TODO: Se resolvió en clase
		return null;
	}

	@Override
	public Pelicula getPeliculaMasActores() {
		// TODO: Se resolvió en clase
		return null;
	}
	
	@Override
	public Set<String> getGeneros() {
		// TODO: Se resolvió en clase
		return null;
	}


	// A partir de aquí, para resolver en casa
	
	@Override
	public Set<MiembroStaff> seleccionaActoresParticipantesTodas() {
		// TODO: Hacer en casa
		return null;
	}

	@Override
	public Set<Pelicula> getPeliculasDirigidasPor(String nombreDirector) {
		// TODO: Hacer en casa 	
		return null;
	}

	@Override
	public Set<Pelicula> getPeliculasAnyo(Integer anyo) {
		// TODO: Hacer en casa
		return null;
	}

	@Override
	public Set<Pelicula> getPeliculasDeActor(String nombreActor) {
		// TODO: Hacer en casa
		return null;
	}

	@Override
	public Set<String> getPaises() {
		// TODO: Hacer en casa
		return null;
	}

	@Override
	public boolean equals(Object obj) {
		boolean res = false;
		if(obj instanceof GestorPeliculasFavoritas) {
			GestorPeliculasFavoritas gestor = (GestorPeliculasFavoritas) obj;
			res = this.getId().equals(gestor.getId());
		}
		return res;
	}
	
	@Override
	public int hashCode() {
		return this.getId().hashCode();
	}

	@Override
	public String toString() {
		return getNombre() + " [" + getId() + "]";
	}

	
	
}
