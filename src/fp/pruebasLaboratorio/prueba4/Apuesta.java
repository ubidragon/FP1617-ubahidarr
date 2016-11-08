package fp.pruebasLaboratorio.prueba4;

import java.time.LocalDateTime;

public interface Apuesta {

	String getIdUsuario();
	LocalDateTime getFechaApuesta();
	PartidoFutbol getPartido();
	Float getCantidad();
	Integer getGolesLocal();
	Integer getGolesVisitante();
	Boolean getGanadora();

}
