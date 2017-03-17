package fp.universidades;

import java.util.ArrayList;
import java.util.List;

import fp.utiles.Ficheros;

public class Universidades {

	// A esta clase le faltan el resto de métodos creacionales para
	// los otros tipos del dominio universidades

	// Métodos creacionales para el tipo Asignatura
	public static Asignatura creaAsignatura(String nombre, String codigo, Double creditos, TipoAsignatura tipo,
			Integer curso) {
		return new AsignaturaImpl(nombre, codigo, creditos, tipo, curso);
	}

	public static Asignatura creaAsignatura(String s) {
		return new AsignaturaImpl(s);
	}

	public static List<Asignatura> creaAsignaturas(String path) {
		List<Asignatura> res = new ArrayList<>();
		List<String> lineas = Ficheros.leeFichero(path);
		for (String s : lineas) {
			res.add(new AsignaturaImpl(s));
		}
		return res;
	}

	public static Asignatura creaAsignatura(Asignatura a) {
		return new AsignaturaImpl(a.getNombre(), a.getCodigo(), a.getCreditos(), a.getTipo(), a.getCurso());
	}
}
