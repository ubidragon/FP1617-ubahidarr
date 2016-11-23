package fp.pruebasLaboratorio.universidades;

public interface Asignatura extends Comparable<Asignatura> {

	String getNombre();

	String getCodigo();

	Double getCreditos();

	TipoAsignatura getTipoAsignatura();

	Integer getCurso();

//	String getDepartamento();
//
//	void setDepartamento(String dpto);

}
