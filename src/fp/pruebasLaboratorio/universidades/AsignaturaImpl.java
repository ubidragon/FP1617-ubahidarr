package fp.pruebasLaboratorio.universidades;

import fp.utiles.Checkers;

public class AsignaturaImpl implements Asignatura {

	private String nombre;
	private String codigo;
	private Double creditos;
	private TipoAsignatura tipo;
	private Integer curso;
//	private String dpto;

	public AsignaturaImpl(String nombre, String codigo, Double creditos, TipoAsignatura tipo, Integer curso) {

		Checkers.check("Creditos no validos ", checkCreditos(creditos));
		Checkers.check("Curso no valido ", checkCurso(curso));
		Checkers.check("Codigo no valido ", checkCodigo(codigo));
			
		
		
		this.nombre = nombre;
		this.codigo = codigo;
		this.creditos = creditos;
		this.tipo = tipo;
		this.curso = curso;
//		this.dpto = dpto;
	}

	private Boolean checkCreditos(Double creditos) {
		return creditos > 0;
	}

	private Boolean checkCurso(Integer curso) {
		return curso > 0;
	}

	private Boolean checkCodigo(String codigo) {

		Boolean res = codigo.length() == 7 && Character.isDigit(codigo.charAt(0)) && Character.isDigit(codigo.charAt(1))
				&& Character.isDigit(codigo.charAt(2)) && Character.isDigit(codigo.charAt(3))
				&& Character.isDigit(codigo.charAt(4)) && Character.isDigit(codigo.charAt(5))
				&& Character.isDigit(codigo.charAt(6));

		return res;
	}

	public String getNombre() {

		return nombre;
	}

	public String getCodigo() {

		return codigo;
	}

	public Double getCreditos() {

		return creditos;
	}

	public TipoAsignatura getTipoAsignatura() {

		return tipo;
	}

	public Integer getCurso() {

		return curso;
	}

//	public String getDepartamento() {
//
//		return dpto;
//	}
//
//	public void setDepartamento(String dpto) {
//
//		this.dpto = dpto;
//
//	}

	public int hashCode() {

		return codigo.hashCode() * 31;
	}

	public boolean equals(Object obj) {
		Boolean res = false;

		if (obj instanceof Asignatura) {
			Asignatura a = (Asignatura) obj;
			res = codigo.equals(a.getCodigo());
		}
		return res;

	}
	
	public int compareTo(Asignatura a){
		
		return getCodigo().compareTo(a.getCodigo());
		
	}

	public String toString() {

		return "(" + getCodigo() + ") " + getNombre();
	}

}
