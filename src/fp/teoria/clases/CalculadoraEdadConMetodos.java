package fp.teoria.clases;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CalculadoraEdadConMetodos {

	public static void main(String[] args) {
		
//		leeFechaNacimiento();
		Long edad = calcularEdad(leeFechaNacimiento());
		System.out.println("Su edad es: " + edad);


		EtapaVital etapa = calcularEtapaVital(calcularEdad(leeFechaNacimiento()).intValue());
		System.out.println("Su etapa vital es: " + etapa);

	}

	public static LocalDate leeFechaNacimiento() {
		System.out.println("Introduzca su año de nacimiento: ");
		Scanner sc1 = new Scanner(System.in);
		Integer anyo = sc.nextInt();
		

		System.out.println("Introduzca su mes de nacimiento: ");
		Integer month = sc.nextInt();
		

		System.out.println("Introduzca su dia de nacimiento: ");
		Integer day = sc.nextInt();

		sc.close();		
	

		LocalDate fecha =  LocalDate.of(anyo, month, day);
		System.out.println(fecha);
		return fecha;

	}

	public static Long calcularEdad(LocalDate fechaNacimiento) {
		
		Long res = fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
		System.out.println(res);
		return res;

	}

	public static EtapaVital calcularEtapaVital(Integer edad) {
		EtapaVital res = null;
		
		
		if (edad <= 7) {
			res = EtapaVital.INFANCIA;

		} else if (7 < edad && edad <= 11) {
			res = EtapaVital.NIÑEZ;
		} else if (11 < edad && edad <= 18) {
			res = EtapaVital.ADOLESCENCIA;
		} else if (18 < edad && edad <= 30) {
			res = EtapaVital.JUVENTUD;
		} else if (30 < edad && edad <= 65) {
			res = EtapaVital.ADULTEZ;
		} else {
			res = EtapaVital.ANCIANIDAD;
		}
		
		
		return res;

	}

}
