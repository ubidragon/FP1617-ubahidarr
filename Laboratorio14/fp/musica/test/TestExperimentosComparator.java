package fp.musica.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import fp.musica.Cancion;
import fp.musica.Musica;

public class TestExperimentosComparator {

	private static final Comparator<Cancion> COMP_DURACION = Comparator.comparing(x -> x.getDuracion());
	private static final Comparator<Cancion> COMP_TITULO = Comparator.comparing(x -> x.getNombre());
	private static final Comparator<Cancion> COMP_POPULARIDAD = Comparator.comparing(x -> x.getPopularidad());
	private static final Comparator<Cancion> COMP_PRIMER_ARTISTA = Comparator
			.comparing((Cancion x) -> x.getArtistas().get(0).getNombre()).thenComparing(x -> x.getNombre());
	private static final Comparator<Cancion> COMP_NATURAL_ORDER = Comparator.naturalOrder();

	public static void main(String[] args) {
		List<Cancion> lista = Musica.creaCanciones("resources/canciones.txt");

		muestraList(lista);

		experimento1(new ArrayList<>(lista));
		experimento2(new ArrayList<>(lista));
		experimento3(new ArrayList<>(lista));
		experimento4(new ArrayList<>(lista));
		experimento5(new ArrayList<>(lista));
		experimento6(new ArrayList<>(lista));
		experimento7(new ArrayList<>(lista));
	}

	private static void experimento7(List<Cancion> canciones) {

		Comparator<Integer> cmp = Comparator.naturalOrder();
		SortedMap<Integer, SortedSet<Cancion>> map = new TreeMap<Integer, SortedSet<Cancion>>(cmp.reversed());

		for (Cancion c : canciones) {
			Integer key = c.getPopularidad();
			SortedSet<Cancion> value = new TreeSet<>(COMP_PRIMER_ARTISTA);
			value.add(c);
			if (map.containsKey(key)) {
				map.get(key).addAll(value);
				// SortedSet<Cancion> current = map.get(key);
				// value.addAll(current);
				// map.put(key, value);
			} else {
				map.put(key, value);
			}

			System.out.println();
		}
	}

	private static void experimento6(List<Cancion> canciones) {

		SortedSet<Cancion> set1 = new TreeSet<>(COMP_DURACION);
		set1.addAll(canciones);
		System.out.println(set1);
		System.out.println(set1.size());

		SortedSet<Cancion> set2 = new TreeSet<>(COMP_DURACION.thenComparing(COMP_NATURAL_ORDER));
		set2.addAll(canciones);
		System.out.println(set2);
		System.out.println(set2.size());

	}

	private static void experimento5(List<Cancion> canciones) {

		Cancion c = Collections.max(canciones, COMP_POPULARIDAD.reversed().thenComparing(COMP_DURACION));

		System.out.println("Cancion menos popular y a igualdad por maxima duracion: " + c);
	}

	private static void experimento4(List<Cancion> canciones) {

		Cancion c = Collections.max(canciones, COMP_POPULARIDAD.thenComparing(COMP_DURACION));

		System.out.println("Cancion mas popular y a igualdad por maxima duracion: " + c);

	}

	private static void experimento3(List<Cancion> canciones) {

		Collections.sort(canciones, COMP_PRIMER_ARTISTA);
		muestraList(canciones);

	}

	private static void experimento2(List<Cancion> canciones) {

		Collections.sort(canciones, COMP_TITULO);
		muestraList(canciones);

	}

	private static void experimento1(List<Cancion> canciones) {

		// Comparator<Cancion> cmp = Comparator.comparing(Cancion ::
		// getDuracion);

		Cancion maximo = Collections.max(canciones, COMP_DURACION);
		Cancion minimo = Collections.min(canciones, COMP_DURACION);

		System.out.println("Minimo: " + minimo.getDuracion());
		System.out.println("Maximo: " + maximo.getDuracion());
	}

	private static void muestraList(List<Cancion> lista) {
		for (Cancion c : lista) {
			System.out.println(c);
		}

	}

}
