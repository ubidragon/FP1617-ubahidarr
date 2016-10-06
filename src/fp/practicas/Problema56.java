package fp.practicas;

import java.time.LocalDate;
import java.time.Month;

import fp.practicas.utiles.Temporada;

public class Problema56 {

public static Temporada calculaTemporada(LocalDate fecha) {

	Temporada t = null;
	Month mes = fecha.getMonth();

	switch(mes){

		case JULY: case AUGUST: case SEPTEMBER:
		t = Temporada.ALTA ;
		break;

		case MAY: case JUNE: case OCTOBER:
		t = Temporada.MEDIA ;
		break;

		default:
		t = Temporada.BAJA ;
		break;
	}
	System.out.println("Segun la fecha proporcionada la temporada es: " + t);
	return t;
	
	


}




}