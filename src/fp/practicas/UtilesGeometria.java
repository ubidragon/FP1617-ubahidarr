
package fp.practicas;

import fp.geometria.tipos.Punto;
import fp.practicas.utiles.Cuadrante;


public class UtilesGeometria{

	public static Cuadrante obtenerCuadrante(Punto p){
		Cuadrante res;

		Double x = p.getX();
		Double y = p.getY();

		if (x == 0. && y==0.) {
			res = Cuadrante.EJE;
		}else if(x < 0. && y > 0.){
			res= Cuadrante.SEGUNDO_CUADRANTE;

		}else if (x > 0. && y > 0.) {
			res= Cuadrante.PRIMER_CUADRANTE;
			
		}else if (x < 0. && y < 0.) {
			res= Cuadrante.TERCER_CUADRANTE;
		}else{
			res = Cuadrante.CUARTO_CUADRANTE;
		}

		return res;



	}
}