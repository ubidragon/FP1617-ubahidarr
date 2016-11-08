package fp.boletines.boletin2.aeropuerto;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class VueloImpl implements Vuelo {

	private String codigo;
	private String origen;
	private String destino;
	private LocalDateTime fechaSalida;
	private LocalDateTime fechaLlegada;
	private Integer numeroPlazas;
	private Integer numeroPasajeros;

	public VueloImpl(String codigo, String origen, String destino, LocalDateTime fechaSalida,
			LocalDateTime fechaLlegada, Integer numeroPlazas, Integer numeroPasajeros) {

		this.codigo = codigo;
		this.origen = origen;
		this.destino = destino;
		this.fechaSalida = fechaSalida;
		this.fechaLlegada = fechaLlegada;
		this.numeroPlazas = numeroPlazas;
		this.numeroPasajeros = numeroPasajeros;

	}

	public VueloImpl(String codigo, String origen, String destino, LocalDateTime fechaSalida,
			LocalDateTime fechaLlegada, Integer numeroPlazas) {

		this.codigo = codigo;
		this.origen = origen;
		this.destino = destino;
		this.fechaSalida = fechaSalida;
		this.fechaLlegada = fechaLlegada;
		this.numeroPlazas = numeroPlazas;
		this.numeroPasajeros = 0;

	}

	public String getCodigo() {
		return codigo;
	}

	public String getOrigen() {
		return origen;
	}

	public String getDestino() {
		return destino;
	}

	public LocalDateTime getFechaSalida() {
		return fechaSalida;
	}

	public LocalDateTime getFechaLlegada() {
		return fechaLlegada;
	}

	public Integer getNumeroPlazas() {
		return numeroPlazas;
	}

	public Integer getNumeroPasajeros() {
		return numeroPasajeros;
	}

	public Duration getDuracion() {
		// Duration res=Duration.between(fechaLlegada, fechaSalida);
		// return res.;
		Long res = getFechaLlegada().until(getFechaSalida(), ChronoUnit.MINUTES);
		return Duration.ofMinutes(res);

	}

	public Boolean getCompleto() {

		return getNumeroPlazas().equals(getNumeroPasajeros());

	}

	public void setFechaSalida(LocalDateTime salida) {
		this.fechaSalida = salida;
	}

	public void setFechaLlegada(LocalDateTime llegada) {
		this.fechaLlegada = llegada;
	}

	public void setNumeroPasajeros(Integer pasajeros) {
		this.numeroPasajeros = pasajeros;

	}

	public String toString() {
		return "(" + getCodigo() + ") " + getOrigen() + "-" + getDestino() + " "
				+ getFechaSalida().format(DateTimeFormatter.ofPattern("dd/mm/yyyy hh:mm"));
	}

}
