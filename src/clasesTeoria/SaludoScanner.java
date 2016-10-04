package clasesTeoria;

import java.util.Scanner;

public class SaludoScanner {

	public static void main(String[] args) {
		
		
		Scanner sc1 = new Scanner(System.in);
		pedirNombre(sc1);
	
		
// 		Al hacer el segundo scanner me peta pero no se porque 	
		Scanner sc2 = new Scanner(System.in);
		pedirNombre(sc2);
	
		
	}

	public static void pedirNombre(Scanner s){
		System.out.println("Introduzca su nombre: ");
	
		String res = s.nextLine();
		System.out.println("Saludos " + res);
		
	}
	

}
