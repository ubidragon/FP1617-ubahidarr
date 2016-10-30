package fp.pruebasLaboratorio.hotel;

public class HotelImpl implements Hotel {


	private String nombre;
	private String direccion;
	private String ciudad;
	private String telefono;
	private String cadenaHotelera;
	private String descripcion;
	private CategoriaHotelera categoria;
	private TipoAlojamiento alojamiento;
	private Boolean admMascota;
	private Boolean minusvalido;
	
	
	public HotelImpl(String nombre, String direccion, String ciudad, String telefono, String cadenaHotelera,
			String descripcion, CategoriaHotelera categoria, TipoAlojamiento alojamiento, Boolean admMascota,
			Boolean minusvalido) {
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.telefono = telefono;
		this.cadenaHotelera = cadenaHotelera;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.alojamiento = alojamiento;
		this.admMascota = admMascota;
		this.minusvalido = minusvalido;
		
	}

public HotelImpl(String nombre, String direccion, String ciudad, String telefono, String cadenaHotelera,
			CategoriaHotelera categoria) {
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.telefono = telefono;
		this.cadenaHotelera = cadenaHotelera;
		this.descripcion = null;
		this.categoria = categoria;
		categoriaPrecio = CategoriaPrecio.MEDIA;
		this.alojamiento = alojamiento;
		this.admMascota = false;
		this.minusvalido = false;
		
	}



public HotelImpl(String nombre, String cadenaHotelera, CategoriaHotelera categoria) {
		
		this.nombre = nombre;
		this.direccion = null;
		this.ciudad = null;
		this.telefono = null;
		this.cadenaHotelera = cadenaHotelera;
		this.descripcion = null;
		this.categoria = categoria;
		categoriaPrecio = CategoriaPrecio.MEDIA;
		this.alojamiento = null;
		this.admMascota = false;
		this.minusvalido = false;
		
	}



}
