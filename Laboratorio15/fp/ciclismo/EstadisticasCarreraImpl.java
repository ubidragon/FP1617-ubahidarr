package fp.ciclismo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class EstadisticasCarreraImpl implements EstadisticasCarrera {

	private String nombreCarrera;
	private List<Ganador> ganadores;

	/**
	 * @param nombre Nombre de la carrera
	 */
	public EstadisticasCarreraImpl(String nombre) {
		this.nombreCarrera = nombre;
		this.ganadores = new ArrayList<Ganador>();
	}
	
	public EstadisticasCarreraImpl(String nombre, Collection<Ganador> ganadores) {
		this (nombre);
		this.ganadores = new ArrayList<Ganador>(ganadores);
	}
	
	@Override
	public String getNombreCarrera() {
		return this.nombreCarrera;
	}
	/* (non-Javadoc)
	 * @see fp.ciclismo.EstadisticasTour#getGanadores()
	 */
	public List<Ganador> getGanadores() {
		return new ArrayList<Ganador>(ganadores);
	}


	public boolean equals(Object obj) {
	boolean res = false;
		if (obj!= null && obj instanceof EstadisticasCarrera){
			EstadisticasCarrera est= (EstadisticasCarrera) obj;
			res = getNombreCarrera().equals(est.getNombreCarrera())
					&& this.ganadores.equals(est.getGanadores());
		}
	return res;
	}

	public int hashCode() {
		return getNombreCarrera().hashCode() + 31* this.ganadores.hashCode();
	}
	
	public String toString() {
		return getNombreCarrera()+" - " + this.ganadores;
	}
	
	public List<String> getGanadoresConRecorridoInferiorA(Integer km) {
		// TODO
		return null;
	}
	
	public Long getNumeroGanadores() {
		// TODO
		return null;
	}

	public Boolean hanGanadoTodosAlgunaEtapa(){
		// TODO
		return null;
	}

	public Set<String> getEquiposGanadores() {
		// TODO
		return null;
	}
	
	public Ganador buscaGanador(String nombre) {
		// TODO
		return null;
	}

	public Ganador buscaGanador(Integer anyo) {
		// TODO
		return null;
	}
	
	public Integer getKmMenorRecorrido() {
		// TODO
		return null;
	}
	
	public String getGanadorMasRapido() {
		// TODO
		return null;
	}

	// Este no viene en el boletín
	// Igual que el anterior, pero se busca el más rápido entre los ganadores de la nacionalidad dada
	public String getGanadorMasRapido(String nacionalidad) {
		// TODO
		return null;
	}
	
	public Integer calculaDistanciaTotal() {
		// TODO
		return null;
	}
	
	public Double getMediaEtapasGanadas(String equipo) {
		// TODO
		return null;
	}
	
	public Map<String, List<Ganador>> getGanadoresPorNacionalidad() {
		// TODO
		return null;
	}

	public Map<String, Long> cuentaGanadoresPorNacionalidad() {
		// TODO
		return null;
	}

}
