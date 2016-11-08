package fp.boletines.boletin2.gestionBibliotecas;

import java.time.LocalDate;

import fp.boletines.boletin2.gestionBibliotecas.utiles.TipoPrestamo;

public class LibroImpl implements Libro {

	private String isbn;
	private String titulo;
	private String autor;
	private Integer numPaginas;
	private LocalDate fechaAdquisicion;
	private Double precio;
	private Integer copias;
	private TipoPrestamo prestamo;

	/*CONSTRUCTOR*/

	public LibroImpl(String isbn, String titulo, String autor, Integer numPaginas, LocalDate fechaAdquisicion,
			Double precio, Integer copias, TipoPrestamo prestamo) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
		this.fechaAdquisicion = fechaAdquisicion;
		this.precio = precio;
		this.copias = copias;
		this.prestamo = prestamo;
	}
//TODO Excepciones
	/*
	restriccion (todas lanzan IllegalArgumentException:
	1.-numero paginas mayor que 0
	2.-la fecha debe ser igual a ala actual o anterior a la actual
	3.-la estimacion debe ser un valor mayor estrico que 0
	4.- el isbn debe tener 10 o 13
	5.- precio mayor o igual que cero
	*/

/*GETTERS Y SETTERS*/

	public String getIsbn() {

		return isbn;
	}

	public String getTitulo() {

		return titulo;
	}

	public String getAutor() {

		return autor;
	}

	public Integer getPaginas() {

		return numPaginas;
	}

	public LocalDate getAdquisicion() {

		return fechaAdquisicion;
	}

	public Double getPrecio() {

		return precio;
	}

	public Integer getCopias() {

		return copias;
	}

	public Boolean getBestSeller() {

		return null;
	}

	public TipoPrestamo getPrestamo() {

		return prestamo;
	}


/*TOSTRING*/

	public String toString() {

		return null;

	}

}
