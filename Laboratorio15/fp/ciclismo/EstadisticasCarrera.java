package fp.ciclismo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface EstadisticasCarrera {
	/**
	 * @return El nombre de la carrera
	 */
	String getNombreCarrera();

	/**
	 * @return Una lista con todos los ganadores del tour
	 */
	List<Ganador> getGanadores();

	/**
	 * @param km
	 *            Umbral de kilómetros recorrido por el ciclista en el tour
	 * @return Una lista con los nombres de los ganadores que han recorrido
	 *         menos kilómetros que los dados como parámetro
	 */
	List<String> getGanadoresConRecorridoInferiorA(Integer km);

	/**
	 * @return true si todos los ganadores han ganado alguna etapa en la edición
	 *         en la que ganaron el tour
	 */
	Boolean hanGanadoTodosAlgunaEtapa();

	/**
	 * @return El número de ganadores distintos del tour. Si un ciclista ha
	 *         ganado el tour en varias ediciones, solo se debe contar una vez.
	 */
	Long getNumeroGanadores();

	/**
	 * @return Un conjunto con los nombres de los equipos que han ganado la
	 *         carrera.
	 */
	Set<String> getEquiposGanadores();

	/**
	 * @param nombre
	 *            Nombre del ciclista
	 * @return El primer ganador que concuerde con el nombre dado como
	 *         parámetro. Si no se encuentra ninguno, se devuelve null
	 */
	Ganador buscaGanador(String nombre);

	/**
	 * @param anyo
	 *            Año de celebración de la carrera
	 * @return El ciclista ganador de ese año, si es que existe. Si no se
	 *         encuentra ninguno, se devuelve null.
	 */
	Ganador buscaGanador(Integer anyo);

	/**
	 * @return La suma de los kilómetros recorridos en todas las ediciones de la
	 *         carrera.
	 */
	Integer calculaDistanciaTotal();

	/**
	 * @return El número de kilómetros de la edición en la que se ha hecho el
	 *         recorrido más corto. Si no se puede calcular, devuelve cero.
	 * 
	 */
	Integer getKmMenorRecorrido();

	/**
	 * @param equipo
	 *            Nombre de un equipo.
	 * @return Número medio de etapas que han ganado los ciclistas que corren en
	 *         ese equipo. Si no se puede calcular, devuelve cero.
	 */
	Double getMediaEtapasGanadas(String equipo);

	/**
	 * @return El nombre del ganador que ha alcanzado una mayor velocidad media
	 *         en la edición en la que ha sido ganador. Si no se puede calcular
	 *         devuelve null.
	 */

	String getGanadorMasRapido();

	/**
	 * @return El nombre del ganador que ha alcanzado una mayor velocidad media
	 *         en la edición en la que ha sido ganador, de entre los de la
	 *         nacionalidad dada. Si no se puede calcular devuelve null.
	 */

	String getGanadorMasRapido(String nacionalidad);

	/**
	 * @return Map en el que las claves son las nacionalidades y los valores la
	 *         lista de ganadores de esa nacionalidad
	 */
	Map<String, List<Ganador>> getGanadoresPorNacionalidad();

	/**
	 * @return Map en el que las claves son las nacionalidades, y los valores el
	 *         número de veces que un corredor de esa nacionalidad ha ganado la
	 *         carrera
	 */
	Map<String, Long> cuentaGanadoresPorNacionalidad();

}
