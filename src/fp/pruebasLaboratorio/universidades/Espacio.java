package fp.pruebasLaboratorio.universidades;

public interface Espacio {

	TipoEspacio getTipoEspacio();

	String getNombre();

	Integer getCapacidad();

	String getPlanta();

	void setTipo(TipoEspacio tipoEspacio);

	void setNombre(String nombre);

	void setCapacidad(Integer capacidad);

}
