package fp.audiovisuales;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

import fp.utiles.Checkers;
/**
 * @author Toñi Reina
 * 
 */
public class MiembroStaffImpl implements MiembroStaff {

	private Integer id; 
	private String nombre;
	private LocalDate fechaNacimiento;
	private LocalDate fechaDefuncion;
	private String lugarNacimiento;
	private List<String> alias;
	
	private static final String R_FECHA_DEFUNCION = "LA FECHA DE DEFUNCION DEBE ANTERIOR A LA FECHA DE NACIMIENTO";

	public MiembroStaffImpl(Integer id, String nombre, LocalDate fechaNacimiento, LocalDate fechaDefuncion,
			String lugarNacimiento, List<String> alias) {
		Checkers.checkNoNull(id,nombre);
		Checkers.check(R_FECHA_DEFUNCION, restriccionfechaDefuncion(fechaNacimiento,  fechaDefuncion));

		this.id = id;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaDefuncion = fechaDefuncion;
		this.lugarNacimiento = lugarNacimiento;
		this.alias = alias; 
	}
	private static Boolean restriccionfechaDefuncion(LocalDate fechaNacimiento, LocalDate fechaDefuncion) {
		return 	fechaNacimiento == null  || fechaDefuncion == null  ||fechaNacimiento.isBefore(fechaDefuncion) ;
	}

	public MiembroStaffImpl(Integer id, String nombre, LocalDate fechaNacimiento,  String lugarNacimiento, List<String> alias) {
		this(id, nombre, fechaNacimiento, null, lugarNacimiento, alias);
	}
	public MiembroStaffImpl(Integer id, String nombre) {
		this(id, nombre, null, null, null, null) ; 
	}
	
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		Checkers.check(R_FECHA_DEFUNCION, restriccionfechaDefuncion(fechaNacimiento,  fechaDefuncion));
		this.fechaNacimiento = fechaNacimiento;
	}

	public void  setFechaDefuncion(LocalDate fechaDefuncion) {
		Checkers.check(R_FECHA_DEFUNCION, restriccionfechaDefuncion(fechaNacimiento,  fechaDefuncion));
		this.fechaDefuncion = fechaDefuncion;
	}

	public void  setAlias(List<String> alias) {
		this.alias = alias;
	}

	public Integer getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public LocalDate getFechaDefuncion() {
		return fechaDefuncion;
	}
	
	public Integer getEdad(){
		Integer res = null;
		if(getFechaNacimiento()!=null){
			LocalDate hasta = this.getFechaDefuncion();
			if(hasta==null){
				hasta=LocalDate.now();
			}
			res = (int)getFechaNacimiento().until(hasta,ChronoUnit.YEARS);
		}
		return res; 
	}

	public String getLugarNacimiento() {
		return lugarNacimiento;
	}

	public List<String> getAlias() {
		return this.alias; 
	}

	public void setNombre(String nombre) {
		Checkers.checkNoNull(nombre);
		this.nombre = nombre;
	}

	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}

	public boolean equals(Object obj) {
		boolean res = false;
		if (obj instanceof MiembroStaff) {
			MiembroStaff ms = (MiembroStaff) obj;
			res = getId().equals(ms.getId());
		}
		return res;
	}

	public int hashCode() {
		return getId().hashCode();
	}
	
	
	public int compareTo(MiembroStaff m) {
		return getId().compareTo(m.getId());
	}
	public String toString(){
		String res = getNombre(); 
		if (getAlias()!= null && !getAlias().isEmpty()){
			res += " ("+ getAlias().get(0) + ") ";
		}
		res += "- " + getId();
		return res ;
	}
}
