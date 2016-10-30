package fp.pruebasLaboratorio.ascii;

import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.github.lalyos.jfiglet.FigletFont;

public class HoraAsciiArt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String horas = sc.nextLine();
		LocalTime res = LocalTime.parse(horas);
		String fin = generaTextoHora(res);

		System.out.println(imprimeEnGrande(fin));

		sc.close();

	}

	public static String generaTextoHora(LocalTime hora) {
		String res = "Son las ";

		if (hora.getMinute() == 15) {

			res = res + hora.getHour() + " y cuarto";

		} else if (hora.getMinute() == 30) {

			res = res + hora.getHour() + " y media";

		} else if (hora.getMinute() == 00) {

			res = res + hora.getHour() + " en punto";

		} else if (hora.getMinute() > 30) {
			Integer menos = 60 - hora.getMinute();
			res = res + hora.getHour() + " menos " + menos;
		} else {

			res = res + hora.getHour() + " y " + hora.getMinute();

		}

		return res;

	}

	public static String imprimeEnGrande(String s) {
		String masEspacio = s.replace(" ", "   ");
		String grande = FigletFont.convertOneLine(masEspacio);
		return grande;
	}

}
