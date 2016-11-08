package fp.boletines.boletin2.aeropuerto.test;

import java.time.LocalDateTime;

import fp.boletines.boletin2.aeropuerto.Vuelo;
import fp.boletines.boletin2.aeropuerto.VueloImpl;

public class TestVuelo {

	public static void main(String[] args) {

		Vuelo v = new VueloImpl("Avs2345", "Madrid", "Barcelona", LocalDateTime.of(2016, 9, 20, 18, 50),
				LocalDateTime.of(2016, 9, 20, 22, 50), 125, 120);
		Vuelo v1 = new VueloImpl("Avs2345", "Sevilla", "Madrid", LocalDateTime.of(2017, 8, 15, 12, 30), LocalDateTime.of(2018, 10, 3, 9, 10), 115);
		Vuelo v2 = new VueloImpl("AB45XD4", "Paris", "Roma",LocalDateTime.of(2016, 9, 20, 18, 50), LocalDateTime.of(2016, 9, 20, 19, 50), 250, 250);

		muestraPropiedades(v);
		muestraPropiedades(v1);
		muestraPropiedades(v2);
		
	}

	private static void muestraPropiedades(Vuelo v) {

		System.out.println("\nInformacion principal: \n \t" + v);
		System.out.println("\t<===========================>");
		System.out.println("Codigo: " + v.getCodigo());
		System.out.println("Origen: " + v.getOrigen());
		System.out.println("Destino: " + v.getDestino());
		System.out.println("Fecha de Salida: " + v.getFechaSalida());
		System.out.println("Fecha de Llegada: " + v.getFechaLlegada());
		System.out.println("Numero de Plazas: " + v.getNumeroPlazas());
		System.out.println("Numero de Pasajeros: " + v.getNumeroPasajeros());
		System.out.println("Duracion del Vuelo: " + v.getDuracion());
		System.out.println("Completo: " + v.getCompleto());

	}

}
