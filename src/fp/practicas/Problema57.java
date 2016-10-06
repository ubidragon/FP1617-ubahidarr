package fp.practicas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;



public class Problema57 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la fecha de su reserva");
		String fecha = sc.nextLine();
		LocalDate res = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd/MM/yy"));
		sc.close();
		
		Problema56.calculaTemporada(res);
		

	}

}
