package fp.pruebasLaboratorio.universidades;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;

public interface Tutoria {

	DayOfWeek getDia();

	LocalTime getComienzo();

	LocalTime getFin();

	Duration getDuracion();

}
