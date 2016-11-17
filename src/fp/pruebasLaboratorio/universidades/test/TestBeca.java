package fp.pruebasLaboratorio.universidades.test;

import fp.pruebasLaboratorio.universidades.BecaImpl;

public class TestBeca extends BecaImpl {

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
		Constructor(null,null,null,null,null,null);
		System.out.println("---------FIN DEL CASO DE PRUEBA---------\n");

	}
	private static void testConstructor2() {
		 System.out.println("\t=======CASO DE PRUEBA 2=======");
		System.out.println("");
		Constructor(null,null,null,null,null,null);
		System.out.println("---------FIN DEL CASO DE PRUEBA---------\n");
		
		
	}
	private static void testConstructor3() {
		 System.out.println("\t=======CASO DE PRUEBA 3=======");
		System.out.println("");
		Constructor(null,null,null,null,null,null);
		System.out.println("---------FIN DEL CASO DE PRUEBA---------\n");
		
		
	}
	private static void testConstructor4() {
		 System.out.println("\t=======CASO DE PRUEBA 4=======");
		System.out.println("");
		Constructor(null,null,null,null,null,null);
		System.out.println("---------FIN DEL CASO DE PRUEBA---------\n");
		
		
	}
	private static void testConstructor5() {
		 System.out.println("\t=======CASO DE PRUEBA 5=======");
		System.out.println("");
		Constructor(null,null,null,null,null,null);
		System.out.println("---------FIN DEL CASO DE PRUEBA---------\n");
		
		
	}
	private static void testConstructor6() {
		 System.out.println("\t=======CASO DE PRUEBA 6=======");
		System.out.println("");
		Constructor(null,null,null,null,null,null);
		System.out.println("---------FIN DEL CASO DE PRUEBA---------\n");
		
		
	}
	private static void testConstructor7() {
		 System.out.println("\t=======CASO DE PRUEBA 7=======");
		System.out.println("");
		Constructor(null,null,null,null,null,null);
		System.out.println("---------FIN DEL CASO DE PRUEBA---------\n");
		
		
	}
	private static void testConstructor8() {
		 System.out.println("\t=======CASO DE PRUEBA 8=======");
		System.out.println("");
		Constructor(null,null,null,null,null,null);
		System.out.println("---------FIN DEL CASO DE PRUEBA---------\n");
		
		
	}
	private static void testConstructor9() {
		 System.out.println("\t=======CASO DE PRUEBA 9=======");
		System.out.println("");
		Constructor(null,null,null,null,null,null);
		System.out.println("---------FIN DEL CASO DE PRUEBA---------\n");
		
		
	}
	private static void testConstructor10() {
		 System.out.println("\t=======CASO DE PRUEBA 10=======");
		System.out.println("");
		Constructor(null,null,null,null,null,null);
		System.out.println("---------FIN DEL CASO DE PRUEBA---------\n");
		
		
	}
	


	private static void Constructor(String nombre, String codigo, Double creditos, TipoAsignatura tipo, Integer curso,
			String dpto){

		try{
			Asignatura a = new AsignaturaImpl(nombre, codigo, creditos, tipo, curso,
			dpto);
			System.out.println(a);
		}catch(IllegalArgumentException e){

			System.out.println("************Capturada Excepcion esperada");

		}catch(Exception e){
			e.printStackTrace();
			System.out.println("****\n****\nExcepcion no esperada\n****\n****\nRevisa el codigo");
		}

	}
	

}
