package fp.practicas;

import java.util.Scanner;

import fp.practicas.utiles.EstadoSalud;

/*
Practica 1 de G1 de ISW
*/

public class Problema47_48 {

	public static void main(String[] args) {
		// Primer caso sin Scanner
		Double estatura;
		Double peso;
		Double imc;
		// Nuevas variables para el Scanner
		Double estatura2;
		Double peso2;
		Double imc2;
		// dar valores a las variables
		estatura = 1.81;
		peso = 86.0;
		// formula del IMC
		imc = peso / (estatura * estatura);
		// salida por consola
		System.out.println("Su IMC es:" + imc);

		// Segundo caso con scanner
		// Inicializacion del Scanner
		Scanner sc = new Scanner(System.in);
		// transforma el input en un double
		System.out.println("Introduce tu altura: ");
		estatura2 = sc.nextDouble();

		System.out.println("Introduce tu peso: ");
		peso2 = sc.nextDouble();

		imc2 = peso2 / (estatura2 * estatura2);

		System.out.println("Su IMC es:" + imc2);
		sc.close();

	}

	public static EstadoSalud calculaEstadoSalud(Double imc) {
		EstadoSalud res = EstadoSalud.DELGADEZ;

		if (18.5 <= imc && imc < 25) {
			res = EstadoSalud.NORMAL;
		} else if (imc < 30) {
			res = EstadoSalud.PREOBESIDAD;
		} else {
			res = EstadoSalud.OBESIDAD;
		}

		return res;
	}

}
