package fp.pruebasLaboratorio.hotel;

public interface Hotel {

	String getNombre();
	String getDireccion();
	String getCiudad();
	String getTelefono();
	String getCadenaHotelera();
	String getDescripcion();
	CategoriaHotelera getCategoria();
	TipoAlojamiento getAlojamiento();
	CategoriaPrecio getPrecio();
	Float getPuntuacion();
	Integer getNComentarios();
	Boolean getAdmMascota();
	Boolean getMinusvalido();

	void setNombre(String nombre);
	void setDireccion(String direccion);
	void setCiudad(String ciudad);
	void setTelefono(String telefono);
	void setCadenaHotelera(String hoteles);
	void setDescripcion(String descripcion);
	void setCategoria(CategoriaHotelera categoria);
	void setAlojamiento(TipoAlojamiento alojamiento);
	void setPrecio(CategoriaPrecio precio);
	void setPuntuacion(Float puntuacion);
	void setNComentarios(Integer comentarios);
	void setAdmMascota(Boolean mascota);
	void setMinusvalido(Boolean minusvalido);


}

