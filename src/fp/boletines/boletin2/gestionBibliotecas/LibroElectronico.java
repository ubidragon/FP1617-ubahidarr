package fp.boletines.boletin2.gestionBibliotecas;

public interface LibroElectronico extends Libro {
	String getEISBN();
	Formato getFormato();
	
}
