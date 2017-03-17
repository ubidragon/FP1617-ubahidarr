package fp.audiovisuales;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class BuscadorPeliculasImpl implements BuscadorPeliculas {
	// TODO: Definición de atributos, constructores y métodos de la interfaz

	private Map<String, Set<Pelicula>> indicePeliculas;

	public BuscadorPeliculasImpl() {

		indicePeliculas = new HashMap<>();

	}

	public BuscadorPeliculasImpl(Collection<Pelicula> c) {
		this();
		indexaPeliculas(c);

	}

	private void ejecutaActualizacion(Pelicula p) {

		String titulo = p.getTitulo();
		String[] palabras = extraePalabras(titulo);

		for (String key : palabras) {
			Set<Pelicula> value = new HashSet<>();
			value.add(p);
			if (indicePeliculas.containsKey(key)) {
				Set<Pelicula> current = indicePeliculas.get(key);
				value.addAll(current);
				indicePeliculas.put(key, current);
			} else {
				indicePeliculas.put(key, value);
			}

		}

	}

	public BuscadorPeliculasImpl(GestorPeliculasFavoritas gestor) {
		this(gestor.getPeliculas());

	}

	private String[] extraePalabras(String s) {
		return s.replaceAll("[^A-Za-záéíóú]+", " ").replaceAll(" +", " ").toLowerCase().split(" ");
	}

	public boolean equals(Object o) {
		boolean res = false;
		if (o instanceof BuscadorPeliculas) {
			res = ((BuscadorPeliculas) o).getPeliculas().equals(getPeliculas());
		}
		return res;
	}

	public int hashCode() {
		return getPeliculas().hashCode();
	}

	public String toString() {
		return getPeliculas().size() + " películas indexadas";
	}

	public void indexaPeliculas(Collection<Pelicula> peliculas) {

		for (Pelicula p : peliculas) {
			ejecutaActualizacion(p);
		}

	}

	public void indexaPelicula(Pelicula p) {

		ejecutaActualizacion(p);

	}

	public Map<String, Set<Pelicula>> getIndicePeliculas() {
		return new HashMap<>(indicePeliculas);
	}

	public Set<Pelicula> getPeliculas() {
		Set<Pelicula> res = new HashSet<>();
		for (String key : indicePeliculas.keySet()) {
			Set<Pelicula> value = indicePeliculas.get(key);
			res.addAll(value);
		}
		return res;
	}

	public Set<Pelicula> buscaPeliculasPorTitulo(String palabra) {

		return indicePeliculas.get(palabra);
	}

	public Set<Pelicula> buscaPeliculasPorTitulo(String[] palabras) {
		Set<Pelicula> res = new HashSet<>();
		Set<Pelicula> value = indicePeliculas.get(palabras[0]);

		res.addAll(value);

		for (String key : palabras) {
			value = indicePeliculas.get(key);
			res.retainAll(value);
		}

		return res;
	}

	public SortedMap<String, Set<Pelicula>> getPeliculasPorActor() {

		SortedMap<String, Set<Pelicula>> res = new TreeMap<>();

		for (Pelicula p : getPeliculas()) {
			res = almacenaActor(p.getActores(), p, res);
		}

		return res;
	}

	private SortedMap<String, Set<Pelicula>> almacenaActor(List<MiembroStaff> actores, Pelicula p,
			SortedMap<String, Set<Pelicula>> res) {
		Set<Pelicula> peliculas = new HashSet<Pelicula>();
		for (String s : nombreStaff(actores)) {

			if (res.containsKey(s)) {
				peliculas.addAll(res.get(s));
				peliculas.add(p);
				res.put(s, peliculas);
			} else {
				peliculas.add(p);
				res.put(s, peliculas);
			}

		}

		return res;

	}

	public Set<String> getDirectores() {

		Set<String> res = new HashSet<>();
		List<MiembroStaff> dir = new ArrayList<>();

		for (Pelicula p : getPeliculas()) {

			dir.addAll(p.getDirectores());

		}
		res.addAll(nombreStaff(dir));

		return res;
	}

	private Set<String> nombreStaff(List<MiembroStaff> directores) {

		Set<String> res = new HashSet<>();

		for (MiembroStaff d : directores) {
			res.add(d.getNombre());
		}

		return res;

	}
}
