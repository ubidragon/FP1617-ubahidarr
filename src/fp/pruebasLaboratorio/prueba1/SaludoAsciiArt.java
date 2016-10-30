/**
 * 
 */
package fp.pruebasLaboratorio.prueba1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

import com.github.lalyos.jfiglet.FigletFont;

/**
 * @author Ubidragon
 *
 *
 */
public class SaludoAsciiArt {

	public static void main(String[] args) {
		System.out.println("�Cual es su nombre?");
		Scanner sc = new Scanner(System.in);
		String res = sc.nextLine();
		System.out.println(saluda(res));
		sc.close();
	}

	public static String devuelveTextoDia(LocalDate fecha) {
		String res = null;
		String res2 = null;

		DayOfWeek day = fecha.getDayOfWeek();
		Month month = fecha.getMonth();

		switch (day) {

		case MONDAY:
			res = "lunes";
			break;
		case TUESDAY:
			res = "martes";
			break;
		case WEDNESDAY:
			res = "miercoles";
			break;
		case THURSDAY:
			res = "jueves";
			break;
		case FRIDAY:
			res = "viernes";
			break;
		case SATURDAY:
		case SUNDAY:
			res = "fin de semana";
			break;

		}

		switch (month) {

		case JANUARY:
			res2 = "ENERO";
			break;
		case FEBRUARY:
			res2 = "FEBRERO";
			break;
		case MARCH:
			res2 = "MARZO";
			break;
		case APRIL:
			res2 = "ABRIL";
			break;
		case MAY:
			res2 = "MAYO";
			break;
		case JUNE:
			res2 = "JUNIO";
			break;
		case JULY:
			res2 = "JULIO";
			break;
		case AUGUST:
			res2 = "AGOSTO";
			break;
		case SEPTEMBER:
			res2 = "SEPTIEMBRE";
			break;
		case OCTOBER:
			res2 = "OCTUBRE";
			break;
		case NOVEMBER:
			res2 = "NOVIEMBRE";
			break;
		case DECEMBER:
			res2 = "DICIEMBRE";
			break;

		}

		return res + " de " + res2.toLowerCase();

	}

	public static String imprimeEnGrande(String s) {
		return FigletFont.convertOneLine(s.replace(" ", "   "));

	}

	public static String saluda(String s) {

		String p = imprimeEnGrande(s.toUpperCase());
		String p2 = devuelveTextoDia(LocalDate.now());
		String res = "Hola " + p + "\n�Que tengas un buen " + p2 + "!";
		return res;

	}

}
