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
		
		// Descomentar a medida que se vayan resolviendo los distintos apartados
		
//		System.out.println((i++)+": Ganadores del tour");
//		System.out.println(est.getGanadores());
//		
//		System.out.println((i++)+": ¿Qué ciclistas han ganado recorriendo menos de 3500 km?");
//		System.out.println(est.getGanadoresConRecorridoInferiorA(3500));
//		
//		System.out.println((i++)+": ¿Cuántos ganadores ha habido?");
//		System.out.println(est.getNumeroGanadores());
//		
//		System.out.println((i++)+": ¿Han ganado todos alguna etapa?");
//		System.out.println(est.hanGanadoTodosAlgunaEtapa());
//		
//		System.out.println((i++)+":¿Cuáles son los equipos ganadores?");
//		System.out.println(est.getEquiposGanadores());
//		
//		System.out.println((i++)+":¿Ha ganado Alberto Contador?");
//		System.out.println(est.buscaGanador("Alberto Contador"));
//		
//		System.out.println((i++)+":¿Ha ganado Alberto Márquez?");
//		System.out.println(est.buscaGanador("Alberto Márquez"));
//		
//		System.out.println((i++)+":¿Quién ganó en 2009?");
//		System.out.println(est.buscaGanador(2009));
//		
//		System.out.println((i++)+":¿Quién ganó en 1999?");
//		System.out.println(est.buscaGanador(1999));
//		
//		System.out.println((i++)+":¿Cuál es el total de kilómetros recorridos en todas las ediciones del tour?");
//		System.out.println(est.calculaDistanciaTotal());
//		
//		System.out.println((i++)+":¿Cuál es la media de etapas ganadas del equipo Team Sky?");
//		System.out.println(est.getMediaEtapasGanadas("Team Sky"));
//		
//		System.out.println((i++)+":¿Cuántos kilómetros se hicieron en la edición de menor recorrido?");
//		System.out.println(est.getKmMenorRecorrido());
//
//		System.out.println((i++)+":¿Cuál es el ganador que ha alcanzado una mayor velocidad media?");
//		System.out.println(est.getGanadorMasRapido());
//
//		System.out.println((i++)+":¿Cuál es el ganador español que ha alcanzado una mayor velocidad media?");
//		System.out.println(est.getGanadorMasRapido("Spain"));
//
//		System.out.println((i++)+":¿Cuáles son los ganadores, según su nacionalidad?");
//		mostrarMapPorLinea(est.getGanadoresPorNacionalidad());
//
//		System.out.println((i++)+":¿Cuántos ganadores hay, según su nacionalidad?");
//		mostrarMapPorLinea(est.cuentaGanadoresPorNacionalidad());

	}

	private static <K,T> void mostrarMapPorLinea(Map<K, T> map) {
		map.entrySet().stream()
			.forEach(entry-> System.out.println(entry.getKey()+"-->"+entry.getValue()));
		
	}

}
