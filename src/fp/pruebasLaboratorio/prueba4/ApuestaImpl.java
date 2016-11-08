package fp.pruebasLaboratorio.prueba4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ApuestaImpl  implements Apuesta {
	private String idUsuario;
	private LocalDateTime fechaApuesta;
	private PartidoFutbol partido;
	private Float cantidad;
	private Integer golesLocal;
	private Integer golesVisitante;
	private Integer golesRealesLocal;
	private Integer golesRealesVisitante;
	private String local;
	private String visitante;
	

	public ApuestaImpl(String idUsuario, LocalDateTime fechaApuesta, PartidoFutbol partido, Float cantidad,
			Integer golesLocal, Integer golesVisitante) {
	
		this.idUsuario = idUsuario;
		this.fechaApuesta = fechaApuesta;
		this.partido = partido;
		this.cantidad = cantidad;
		this.golesLocal = golesLocal;
		this.golesVisitante = golesVisitante;

	}

	public ApuestaImpl(String idUsuario, LocalDateTime fechaApuesta, String local, String visitante, Float cantidad,
			Integer golesLocal, Integer golesVisitante, Integer golesRealesLocal, Integer golesRealesVisitante) {

		
		this.idUsuario = idUsuario;
		this.fechaApuesta = fechaApuesta;
		this.local=local;
		this.visitante=visitante;
		this.cantidad = cantidad;
		this.golesLocal = golesLocal;
		this.golesVisitante = golesVisitante;
		this.golesRealesLocal =golesRealesLocal;
		this.golesRealesVisitante = golesRealesVisitante;

	}
	


	public String getIdUsuario() {
		return idUsuario;
	}

	public LocalDateTime getFechaApuesta() {
		return fechaApuesta;
	}

	public PartidoFutbol getPartido() {
		return partido;
	}

	public Float getCantidad() {
		return cantidad;
	}

	public Integer getGolesLocal() {
		return golesLocal;
	}

	public Integer getGolesVisitante() {
		return golesVisitante;
	}

	public Boolean getGanadora() {
		return getGolesLocal().equals(this.golesRealesLocal) 
				&& getGolesVisitante().equals(this.golesRealesVisitante);
	}

	

	
	public String toString() {
		return fechaApuesta.format(DateTimeFormatter.ofPattern("yyyy-mm-dd hh:mm:ss")) +", "+ idUsuario+", " +local+  "-"+ visitante + ", "+ cantidad;
				
	}

}
