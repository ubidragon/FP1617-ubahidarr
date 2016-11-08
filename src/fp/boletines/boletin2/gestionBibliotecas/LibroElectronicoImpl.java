package fp.boletines.boletin2.gestionBibliotecas;

import java.time.LocalDate;

import fp.bibliotecas.TipoPrestamo;

public class LibroElectronicoImpl extends LibroImpl implements Libro {

/*Atirbutos*/
	private String eISBN;
	private Formato formato;
/*constructor*/
	public LibroElectronicoImpl(String isbn, String titulo, String autor, Integer numPaginas,
			LocalDate fechaAdquisicion, Double precio, Long estimacionVentas, TipoPrestamo tipoPrestamo, String eISBN,
			Formato formato) {
		// TODO implementar clase LibroImpl de clase y no de la libreria
		// "bibliotecas"
		super(isbn, titulo, autor, numPaginas, fechaAdquisicion, precio, estimacionVentas, tipoPrestamo);
		this.eISBN = eISBN;
		this.formato = formato;

	}
/*GETTERS & SETTERS*/
	public String getEISBN() {
		return eISBN;
	}

	public Formato getFormato() {
		return formato;
	}

	/*TOSTRING*/

	public String toString() {
		// TODO: mirar boletin 2 y 3
		return null;
	}

}
