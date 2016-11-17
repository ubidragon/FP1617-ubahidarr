package fp.pruebasLaboratorio.universidades;

import java.time.Duration;

public interface Beca {

	String getCodigo();

	Double getCuantiaTotal();

	Double getCuantiaMensual();

	Duration getDuracion();

	TipoBeca getTipoBeca();

	void setCuantiaTotal(Double cuantia);

	void setDuracion(Duration duracion);

}
