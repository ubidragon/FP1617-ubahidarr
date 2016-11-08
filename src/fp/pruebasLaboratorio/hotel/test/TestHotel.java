package fp.pruebasLaboratorio.hotel.test;

import fp.pruebasLaboratorio.hotel.CategoriaHotelera;
import fp.pruebasLaboratorio.hotel.CategoriaPrecio;
import fp.pruebasLaboratorio.hotel.Hotel;
import fp.pruebasLaboratorio.hotel.HotelImpl;
import fp.pruebasLaboratorio.hotel.TipoAlojamiento;

public class TestHotel {

	public static void main(String[] args) {

		Hotel h = new HotelImpl("Alfonso XII", "Calle Betis", "Madrid", "955612589", "NH", "Agradable",
				CategoriaHotelera.CUATRO, TipoAlojamiento.HOTEL, CategoriaPrecio.LUJO, 8.75f, 5, true, true);
		Hotel h1 = new HotelImpl("Casa Pepe", "Calle chile", "Salamanca", "16874616841", "Melia",
				CategoriaHotelera.OTROS);
		Hotel h2 = new HotelImpl("Villa Josefa", "Sitios con Encanto", CategoriaHotelera.CINCO);

		pruebaConstructores(h);
		pruebaConstructores(h1);
		pruebaConstructores(h2);
		muestraInfo(h);
		muestraInfo(h1);
		muestraInfo(h2);

	}

	private static void pruebaConstructores(Hotel h) {

		System.out.println("\n" + h);

	}

	private static void muestraInfo(Hotel h) {
		System.out.println("\nHOTEL " + h.getNombre().toUpperCase());
		System.out.println("=================================");
		System.out.println("Direccion: " + h.getDireccion());
		System.out.println("Ciudad: " + h.getCiudad());
		System.out.println("Telefono: " + h.getTelefono());
		System.out.println("Cadena Hotelera: " + h.getCadenaHotelera());
		System.out.println("Descripcion: " + h.getDescripcion());
		System.out.println("Estrellas: " + h.getCategoria());
		System.out.println("Tipo: " + h.getAlojamiento());
		System.out.println("Mascotas: " + h.getAdmMascota());
		System.out.println("Minusvalido: " + h.getMinusvalido());

	}

}
