package fp.practicas;

import fp.practicas.utiles.EstadoAgua.java;

public class Problema53 {

public static void main(String[] args) {

	Double temperatura;
	

	obtenerEstadoAgua(temperatura);

}

public static EstadoAgua obtenerEstadoAgua(Integer temperatura){
	EstadoAgua res = null;

	Scanner sc = new Scanner(System.in);
	//transforma el input en un double
	System.out.println("Introduce la temperatura para calentar: ");
	temperatura = sc.nextDouble();
	


	if (temperatura > 100) {
		
		res = EstadoAgua.GASEOSO;

	} else if (temperatura<0) {
		
		res = EstadoAgua.SOLIDO;

	}else{

		res = EstadoAgua.LIQUIDO;

	}
	sc.close();

	return res;
}


}
