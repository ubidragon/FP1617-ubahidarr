package fp.practicas;

import java.util.Scanner;
/*
Practica 1 de G1 de ISW
*/

public class IMC {

	public static void main(String[] args) {
	//Primer caso sin Scanner
		Double estatura;
		Double peso;
		Double imc;
	//Nuevas variables para el Scanner
		Double estatura2;
		Double peso2;
		Double imc2;
	//dar valores a las variables
		estatura = 1.81;
		peso =86;
	//formula del IMC
		imc= peso/(altura*altura);
	//salida por consola
		System.out.println("Su IMC es:" + imc);

	//Segundo caso con scanner
	//Inicializacion del Scanner
		Scanner sc = new Scanner(System.in);
	//transforma el input en un double
		System.out.println("Introduce tu altura: ");
		estatura2 = sc.nextDouble();

		System.out.println("Introduce tu peso: ");
		peso2 = sc.nextDouble();

		imc2= peso2/(altura2*altura2);

		System.out.println("Su IMC es:" + imc2);



	}

	public static EstadoSalud calculaEstadoSalud(Double imc){
		EstadoSalud salud = null;

		if (salud <= 7) {
			res = EstadoSalud.INFANCIA;

		} else if (7 < salud && salud <= 11) {
			res = EstadoSalud.NIÑEZ;
		} else if (11 < salud && salud <= 18) {
			res = EstadoSalud.ADOLESCENCIA;
		} else if (18 < salud && salud <= 30) {
			res = EstadoSalud.JUVENTUD;
		} else if (30 < salud && salud <= 65) {
			res = EstadoSalud.ADULTEZ;
		} else {
			res = EstadoSalud.ANCIANIDAD;
		}


		return null;
	}


}

