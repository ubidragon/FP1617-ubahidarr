package fp.pruebasLaboratorio.universidades;

public interface Nota {

	Asignatura getAsignatura();

	String getCursoAcademico();

	Convocatoria getConvocatoria();

	Double getNota();

	Boolean getMHonor();

	Calificacion getCalificacion();

}
