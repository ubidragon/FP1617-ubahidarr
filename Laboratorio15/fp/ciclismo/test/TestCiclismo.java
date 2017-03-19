package fp.ciclismo.test;

import java.util.Map;

import fp.ciclismo.EstadisticasCarrera;
import fp.ciclismo.FactoriaCiclismo;

public class TestCiclismo {
	public static void main(String[] args) {
		EstadisticasCarrera est = FactoriaCiclismo.creaEstadisticas2006_16();
		mostrarEstadisticas(est);
	}

	private static void mostrarEstadisticas(EstadisticasCarrera est) {
		int i =0;
//		System.out.println((i++)+": Numero de Ganadores del tour");
		System.out.print("Numero de ganadores -> ");
		System.out.println(est.getNumeroGanadores());
		
		
		
		
		System.out.print("¿Todos los ganadores han ganado alguna etapa? -> ");
		System.out.println(est.hanGanadoTodosAlgunaEtapa());
		
		System.out.print("Hay algun ganador de España -> ");
		System.out.println(est.hayAlgunGanador("Spain"));
		System.out.print("Hay algun ganador de India -> ");
		System.out.println(est.hayAlgunGanador("India"));
		System.out.print("Hay algun ganador de Italy -> ");
		System.out.println(est.hayAlgunGanador("Italy"));
		System.out.print("Hay algun ganador de France -> ");
		System.out.println(est.hayAlgunGanador("France"));
		
		
		
		// Descomentar a medida que se vayan resolviendo los distintos apartados
		
//		System.out.println((i++)+": Ganadores del tour");
//		System.out.println(est.getGanadores());
//		
//		System.out.println((i++)+": �Qu� ciclistas han ganado recorriendo menos de 3500 km?");
//		System.out.println(est.getGanadoresConRecorridoInferiorA(3500));
//		
//		System.out.println((i++)+": �Cu�ntos ganadores ha habido?");
//		System.out.println(est.getNumeroGanadores());
//		
//		System.out.println((i++)+": �Han ganado todos alguna etapa?");
//		System.out.println(est.hanGanadoTodosAlgunaEtapa());
//		
//		System.out.println((i++)+":�Cu�les son los equipos ganadores?");
//		System.out.println(est.getEquiposGanadores());
//		
//		System.out.println((i++)+":�Ha ganado Alberto Contador?");
//		System.out.println(est.buscaGanador("Alberto Contador"));
//		
//		System.out.println((i++)+":�Ha ganado Alberto M�rquez?");
//		System.out.println(est.buscaGanador("Alberto M�rquez"));
//		
//		System.out.println((i++)+":�Qui�n gan� en 2009?");
//		System.out.println(est.buscaGanador(2009));
//		
//		System.out.println((i++)+":�Qui�n gan� en 1999?");
//		System.out.println(est.buscaGanador(1999));
//		
//		System.out.println((i++)+":�Cu�l es el total de kil�metros recorridos en todas las ediciones del tour?");
//		System.out.println(est.calculaDistanciaTotal());
//		
//		System.out.println((i++)+":�Cu�l es la media de etapas ganadas del equipo Team Sky?");
//		System.out.println(est.getMediaEtapasGanadas("Team Sky"));
//		
//		System.out.println((i++)+":�Cu�ntos kil�metros se hicieron en la edici�n de menor recorrido?");
//		System.out.println(est.getKmMenorRecorrido());
//
//		System.out.println((i++)+":�Cu�l es el ganador que ha alcanzado una mayor velocidad media?");
//		System.out.println(est.getGanadorMasRapido());
//
//		System.out.println((i++)+":�Cu�l es el ganador espa�ol que ha alcanzado una mayor velocidad media?");
//		System.out.println(est.getGanadorMasRapido("Spain"));
//
//		System.out.println((i++)+":�Cu�les son los ganadores, seg�n su nacionalidad?");
//		mostrarMapPorLinea(est.getGanadoresPorNacionalidad());
//
//		System.out.println((i++)+":�Cu�ntos ganadores hay, seg�n su nacionalidad?");
//		mostrarMapPorLinea(est.cuentaGanadoresPorNacionalidad());

	}

	private static <K,T> void mostrarMapPorLinea(Map<K, T> map) {
		map.entrySet().stream()
			.forEach(entry-> System.out.println(entry.getKey()+"-->"+entry.getValue()));
		
	}

}
