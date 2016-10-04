package fp.teoria.boletines.boletin2.gestionBibliotecas;

import java.time.LocalDate;

public interface Libro{
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