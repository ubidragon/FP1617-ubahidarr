package fp.teoria.boletines.boletin2.gestionBibliotecas;

import java.time.LocalDate;

public interface Prestamo extends Libro{
	
	String getUsuario();
	LocalDate getFechaPrestamo();
	
	
	
}
