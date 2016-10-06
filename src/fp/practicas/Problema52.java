package fp.practicas;

import java.util.Scanner;

public class Problema52 {

public static void main(String[] args) {

	Double temperatura;

	Scanner sc = new Scanner(System.in);
	//transforma el input en un double
	System.out.println("Introduce la temperatura para calentar: ");
	temperatura = sc.nextDouble();
	


	if (temperatura > 100) {
		
		System.out.println("Gas");

	} else if (temperatura<0) {
		
		System.out.println("Solido");

	}else{

		System.out.println("Liquido");

	}
	sc.close();

}


}
