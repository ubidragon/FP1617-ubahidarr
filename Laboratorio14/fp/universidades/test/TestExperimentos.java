package fp.universidades.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import fp.musica.Cancion;
import fp.universidades.Asignatura;
import fp.universidades.Universidades;

public class TestExperimentos {

	private static final Comparator<Asignatura> COMP_NOMBRE = Comparator.comparing(x -> x.getNombre());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Asignatura> lista = Universidades.creaAsignaturas("resources/asignaturas.txt");
		experimento(new ArrayList<>(lista));
	}

	private static void experimento(List<Asignatura> asignaturas) {

		Comparator<Double> cmp = Comparator.naturalOrder();
		SortedMap<Double, SortedSet<Asignatura>> map = new TreeMap<Double, SortedSet<Asignatura>>(cmp.reversed());

		for (Asignatura a : asignaturas) {
			Double key = a.getCreditos();
			SortedSet<Asignatura> value = new TreeSet<>(COMP_NOMBRE);
			value.add(a);
			if (map.containsKey(key)) {
				map.get(key).addAll(value);
			} else {
				map.put(key, value);
			}

		}

		System.out.println(map);
	}

}
