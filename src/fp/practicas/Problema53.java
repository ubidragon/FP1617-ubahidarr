package fp.practicas;

import java.util.Scanner;

import fp.practicas.utiles.EstadoAgua;

public class Problema53 {

	public static void main(String[] args) {

		Integer temperatura = null;
		obtenerEstadoAgua(temperatura);

	}

	public static EstadoAgua obtenerEstadoAgua(Integer temperatura) {
		EstadoAgua res = null;

		Scanner sc = new Scanner(System.in);
		// transforma el input en un double
		System.out.println("Introduce la temperatura para calentar: ");
		temperatura = sc.nextInt();

		if (temperatura > 100) {

			res = EstadoAgua.GASEOSO;

		} else if (temperatura < 0) {

			res = EstadoAgua.SOLIDO;

		} else {

			res = EstadoAgua.LIQUIDO;

		}
		sc.close();
		System.out.println("El estado del contenido del cazo es: " + res);
		return res;
	}

}
