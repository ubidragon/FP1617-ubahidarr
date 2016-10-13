package fp.teoria.boletines.boletin2.gestionBibliotecas;

import java.time.LocalDate;

public interface Persona {

	String getDNI();

	String getNombre();

	String getApellidos();

	LocalDate getFechaNacimiento();

	String getEmail();

	Integer getEdad();

	void setNombre(String nombre);

	void setApellidos(String apellidos);

	void setDNI(String dni);

	void setFechaNacimiento(LocalDate fecha);

	void setEmail(String email);

	void setEdad(Integer edad);

}