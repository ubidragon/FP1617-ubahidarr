package fp.pruebasLaboratorio.hotel;



public class HotelImpl implements Hotel {

	/*****Propiedades basicas*****/
	private String nombre;
	private String direccion;
	private String ciudad;
	private String telefono;
	private String cadenaHotelera;
	private String descripcion;
	private CategoriaHotelera categoria;
	private TipoAlojamiento alojamiento;
	private CategoriaPrecio precio;
	private Float puntuacion;
	private Integer nComentarios;
	private Boolean admMascota;
	private Boolean minusvalido;
	

	/*****Constructor 1******/
	
	public HotelImpl(String nombre, String direccion, String ciudad, String telefono, String cadenaHotelera,
			String descripcion, CategoriaHotelera categoria, TipoAlojamiento alojamiento, CategoriaPrecio precio,
			Float puntuacion, Integer nComentarios, Boolean admMascota, Boolean minusvalido) {
	
		this.nombre = nombre;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.telefono = telefono;
		this.cadenaHotelera = cadenaHotelera;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.alojamiento = alojamiento;
		this.precio = precio;
		this.puntuacion = puntuacion;
		this.nComentarios = nComentarios;
		this.admMascota = admMascota;
		this.minusvalido = minusvalido;
	}

	
	/*****Constructor 2******/

	public HotelImpl(String nombre, String direccion, String ciudad, String telefono, String cadenaHotelera,
			CategoriaHotelera categoria) {

		this.nombre = nombre;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.telefono = telefono;
		this.cadenaHotelera = cadenaHotelera;
		this.categoria = categoria;
		this.precio = CategoriaPrecio.MEDIA;	
		this.nComentarios = 0;
		this.admMascota = false;
		this.minusvalido = false;

	}
	

	/*****Constructor 3******/

	public HotelImpl(String nombre, String cadenaHotelera, CategoriaHotelera categoria) {

		this.nombre = nombre;
		this.direccion = null;
		this.ciudad = null;
		this.telefono = null;
		this.cadenaHotelera = cadenaHotelera;
		this.descripcion = null;
		this.categoria = categoria;
		this.precio = CategoriaPrecio.MEDIA;
		this.nComentarios = 0;
		this.alojamiento = null;
		this.admMascota = false;
		this.minusvalido = false;

	}

	

	public String getNombre() {
		return nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public String getCiudad() {
		return ciudad;
	}


	public String getTelefono() {
		return telefono;
	}


	public String getCadenaHotelera() {
		return cadenaHotelera;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public CategoriaHotelera getCategoria() {
		return categoria;
	}


	public TipoAlojamiento getAlojamiento() {
		return alojamiento;
	}


	public CategoriaPrecio getPrecio() {
		return precio;
	}


	public Float getPuntuacion() {
		return puntuacion;
	}


	public Integer getNComentarios() {
		return nComentarios;
	}


	public Boolean getAdmMascota() {
		return admMascota;
	}


	public Boolean getMinusvalido() {
		return minusvalido;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public void setCadenaHotelera(String cadenaHotelera) {
		this.cadenaHotelera = cadenaHotelera;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public void setCategoria(CategoriaHotelera categoria) {
		this.categoria = categoria;
	}


	public void setAlojamiento(TipoAlojamiento alojamiento) {
		this.alojamiento = alojamiento;
	}


	public void setPrecio(CategoriaPrecio precio) {
		this.precio = precio;
	}


	public void setPuntuacion(Float puntuacion) {
		this.puntuacion = puntuacion;
	}


	public void setNComentarios(Integer nComentarios) {
		this.nComentarios = nComentarios;
	}


	public void setAdmMascota(Boolean admMascota) {
		this.admMascota = admMascota;
	}


	public void setMinusvalido(Boolean minusvalido) {
		this.minusvalido = minusvalido;
	}


	private static String estrellasAlojamiento(CategoriaHotelera t) {
		String res = "N/A";

		switch (t) {
		case UNO:
			res = "*";
			break;
		case DOS:
			res = "**";
			break;
		case TRES:
			res = "***";
			break;
		case CUATRO:
			res = "****";
			break;
		case CINCO:
			res = "*****";
			break;

		}

		return res;
	}

	@Override
	public String toString() {
		return getNombre() + " (" + estrellasAlojamiento(getCategoria()) + ")";
	}

}
