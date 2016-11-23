package fp.pruebasLaboratorio.universidades.test;

import fp.pruebasLaboratorio.universidades.Asignatura;
import fp.pruebasLaboratorio.universidades.AsignaturaImpl;
import fp.pruebasLaboratorio.universidades.TipoAsignatura;

public class TestAsignatura {

	public static void main(String[] args) {
		 

		testConstructor();
		testConstructor2();
		testConstructor3();
		testConstructor4();
		testConstructor5();
		testConstructor6();
		testConstructor7();
		testConstructor8();
		testConstructor9();
		testConstructor10();


	}

	private static void testConstructor() {
		
		System.out.println("\t=======CASO DE PRUEBA 1=======");
		System.out.println("");
		Constructor("Fundamentos de Programacion", "1234567", 7.5, TipoAsignatura.ANUAL, 1);
		System.out.println("---------FIN DEL CASO DE PRUEBA---------\n");

	}
	private static void testConstructor2() {
		 System.out.println("\t=======CASO DE PRUEBA 2=======");
		System.out.println("Excepcion de nombre");
		Constructor(null,"1234567" , 7.5, TipoAsignatura.ANUAL, 1);
		System.out.println("---------FIN DEL CASO DE PRUEBA---------\n");
		
		
	}
	private static void testConstructor3() {
		 System.out.println("\t=======CASO DE PRUEBA 3=======");
		System.out.println("Excepcion de codigo");
		Constructor("Fundamentos de Programacion", null, 7.5, TipoAsignatura.ANUAL, 1);
		System.out.println("---------FIN DEL CASO DE PRUEBA---------\n");
		
		
	}
	private static void testConstructor4() {
		 System.out.println("\t=======CASO DE PRUEBA 4=======");
		System.out.println("Excecion de creditos");
		Constructor("Fundamentos de Programacion", "1234567", null, TipoAsignatura.ANUAL, 1);
		System.out.println("---------FIN DEL CASO DE PRUEBA---------\n");
		
		
	}
	private static void testConstructor5() {
		 System.out.println("\t=======CASO DE PRUEBA 5=======");
		System.out.println("Excepcion de TipoAsignatura");
		Constructor("Fundamentos de Programacion", "1234567", 7.5, null, 1);
		System.out.println("---------FIN DEL CASO DE PRUEBA---------\n");
		
		
	}
	private static void testConstructor6() {
		 System.out.println("\t=======CASO DE PRUEBA 6=======");
		System.out.println("Excepcion de curso");
		Constructor(
"Fundamentos de Programacion", "1234567", 7.5, TipoAsignatura.ANUAL, null);
		System.out.println("---------FIN DEL CASO DE PRUEBA---------\n");
		
		
	}
	private static void testConstructor7() {
		 System.out.println("\t=======CASO DE PRUEBA 7=======");
		System.out.println("Testeo de check de codigo: muy corto");
		Constructor(
"Fundamentos de Programacion", "123456", 7.5, TipoAsignatura.ANUAL, 1);
		System.out.println("---------FIN DEL CASO DE PRUEBA---------\n");
		
		
	}
	private static void testConstructor8() {
		 System.out.println("\t=======CASO DE PRUEBA 8=======");
		System.out.println("Testeo de check codigo: muy largo");
		Constructor("Fundamentos de Programacion", "12345678", 7.5, TipoAsignatura.ANUAL, 1);
		System.out.println("---------FIN DEL CASO DE PRUEBA---------\n");
		
		
	}
	private static void testConstructor9() {
		 System.out.println("\t=======CASO DE PRUEBA 9=======");
		System.out.println("Testeo de codigo: no solo numeros");
		Constructor("Fundamentos de Programacion", "1234567A", 7.5, TipoAsignatura.ANUAL, 1);
		System.out.println("---------FIN DEL CASO DE PRUEBA---------\n");
		
		
	}
	private static void testConstructor10() {
		 System.out.println("\t=======CASO DE PRUEBA 10=======");
		System.out.println("Check creditos 0");
		Constructor("Fundamentos de Programacion", "1234567", 0., TipoAsignatura.ANUAL, 1);
		System.out.println("---------FIN DEL CASO DE PRUEBA---------\n");
		
		
	}
	


	private static void Constructor(String nombre, String codigo, Double creditos, TipoAsignatura tipo, Integer curso){

		try{
			Asignatura a = new AsignaturaImpl(nombre, codigo, creditos, tipo, curso);
			muestraAsignatura(a);
		}catch(IllegalArgumentException e){

			System.out.println("************Capturada Excepcion esperada");

		}catch(Exception e){
			e.printStackTrace();
			System.out.println("****\n****\nExcepcion inesperada\n****\n****\nRevisa el codigo");
		}

	}

	private static void muestraAsignatura(Asignatura a){
		
		System.out.println("========MOSTRANDO CLASE=======");
		System.out.println("Asignatura: " + a);
		System.out.println("Nombre: "+ a.getNombre());
		System.out.println("Codigo: " +a.getCodigo());
		System.out.println("TipoAsignatura: " + a.getTipoAsignatura());
		System.out.println("Creditos: " + a.getCreditos());
		System.out.println("Curso: " + a.getCurso());
	
		
		
		
		
	}


}
