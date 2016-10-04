package clasesTeoria;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CalculadoraEdad {
/**Creacion de una calculadora de edad sin usar metodos auxiliares**/
	public static void main(String[] args) {
		System.out.println("Calculadora de Edad Basica");
		
//Pedimos al usuario que inserte el año de nacimiento
		System.out.println("Introduzca su año de nacimiento: ");
		Scanner sc1 = new Scanner(System.in);
		Integer anyo = sc1.nextInt();
		

		System.out.println("Introduzca su mes de nacimiento: ");
		Scanner sc2 = new Scanner(System.in);
		Integer month = sc2.nextInt();
		

		System.out.println("Introduzca su dia de nacimiento: ");
		Scanner sc3 = new Scanner(System.in);
		Integer day = sc3.nextInt();
		

//Operaciones para calcular edad
		LocalDate fecha =  LocalDate.of(anyo, month, day);
		Long diferenciaAnyos = fecha.until(LocalDate.now(), ChronoUnit.YEARS);


		System.out.println("Su edad es: " + diferenciaAnyos);
	}



}