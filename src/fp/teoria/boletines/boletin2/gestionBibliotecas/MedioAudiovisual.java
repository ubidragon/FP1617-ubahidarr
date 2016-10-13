package fp.teoria.boletines.boletin2.gestionBibliotecas;

import java.time.LocalDate;

import fp.teoria.boletines.boletin2.gestionBibliotecas.utiles.TipoAudiovisual;
import fp.teoria.boletines.boletin2.gestionBibliotecas.utiles.TipoPrestamo;

public interface MedioAudiovisual {

	String getCodigo();

	String getTitulo();

	Double getDuracion();

	LocalDate getFechaAdquisicion();

	Double getPrecio();

	Integer getDiscos();

	TipoAudiovisual getAudiovisual();

	TipoPrestamo getTipoPrestamo();

	void setPrestamo(TipoPrestamo p);

}