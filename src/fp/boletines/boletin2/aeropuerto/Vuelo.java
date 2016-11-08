package fp.boletines.boletin2.aeropuerto;

import java.time.Duration;
import java.time.LocalDateTime;

public interface Vuelo {

	String getCodigo();
	String getOrigen();
	String getDestino();
	LocalDateTime getFechaSalida();
	LocalDateTime getFechaLlegada();
	Duration getDuracion();
	Integer getNumeroPlazas();	
	Integer getNumeroPasajeros();
	Boolean getCompleto();

	void setFechaSalida(LocalDateTime salida);
	void setFechaLlegada(LocalDateTime llegada);
	void setNumeroPasajeros(Integer pasajeros);


}
