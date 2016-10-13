package fp.teoria.boletines.boletin2.gestionBibliotecas;

import java.time.LocalDate;

import fp.teoria.boletines.boletin2.gestionBibliotecas.utiles.TipoPrestamo;

public interface Libro {
	String getIsbn();

	String getTitulo();

	String getAutor();

	Integer getPaginas();

	LocalDate getAdquisicion();

	Double getPrecio();

	Integer getCopias();

	Boolean getBestSeller();

	TipoPrestamo getPrestamo();

}