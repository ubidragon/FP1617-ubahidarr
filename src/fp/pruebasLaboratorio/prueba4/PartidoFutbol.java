package fp.pruebasLaboratorio.prueba4;

import java.time.LocalDateTime;

public interface PartidoFutbol {

	LocalDateTime getFecha();

	String getEquipoLocal();

	String getEquipoVisitante();

	Integer getGolesLocal();

	Integer getGolesVisitante();

	Resultado getResultadoQuiniela();

}
