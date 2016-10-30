package fp.pruebasLaboratorio.prueba2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class PartidoFutbolImpl implements PartidoFutbol {

	/*
	 * Fecha, de tipo LocalDateTime, consultable. Fecha de cel ebraci�n y hora
	 * de comienzo del partido. o Equipo local, de tipo String, consultable.
	 * Nombre del equipo local. o Equipo vis itante, de tipo String,
	 * consultable. Nombre del equipo visitante. o Goles local, de tipo Integer,
	 * consultable. N�mero de goles del equipo local. o Goles visitante, de tipo
	 * Integer, consultable. N�mero de goles del equipo visitante. o Resultado,
	 * de tipo Resultado Quiniela, consultable. Puede tomar los valores UNO,
	 * EQUIS, DOS. El resultado ser� UNO, si el equipo local tiene m�s goles que
	 * el equipo visitante; ser� EQUIS, si los dos equipos han marcado el mismo
	 * n�mero de goles, y DOS, si el equipo visitante ha marcado m�s goles que
	 * el local.
	 */

	private LocalDateTime fecha;
	private String local;
	private String visitante;
	private Integer gLocal;
	private Integer gVisitante;
	// private Resultado res;

	/* CONSTRUCTOR */

	public PartidoFutbolImpl(LocalDateTime fecha, String local, String visitante, Integer gLocal, Integer gVisitante) {
		this.fecha = fecha;
		this.local = local;
		this.visitante = visitante;
		this.gLocal = gLocal;
		this.gVisitante = gVisitante;

	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public String getEquipoLocal() {
		return local;
	}

	public String getEquipoVisitante() {
		return visitante;
	}

	public Integer getGolesLocal() {
		return gLocal;
	}

	public Integer getGolesVisitante() {
		return gVisitante;
	}

	public Resultado getResultadoQuiniela() {
		Resultado res = null;

		if (gLocal > gVisitante) {
			res = Resultado.UNO;
		} else if (gLocal == gVisitante) {
			res = Resultado.EQUIS;

		} else {
			res = Resultado.DOS;
		}

		return res;
	}
	/*
	 * 24-09-16-> Sporting Gij�n vs Barcelona:0-5 (2)
	 */

	private static String resultadoNum(Resultado r) {
		String res = null;

		switch (r) {
		case UNO:
			res = "1";
			break;
		case DOS:
			res = "2";
			break;
		default:
			res = "X";
			break;
		}

		return res;

	}

	public String toString() {

		String f = fecha.format(DateTimeFormatter.ofPattern("dd-MM-yy"));

		return f + " -> " + local + " vs " + visitante + ": " + gLocal + "-" + gVisitante + " ("
				+ resultadoNum(getResultadoQuiniela()) + ")";
	}

}
