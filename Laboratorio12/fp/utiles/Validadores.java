package fp.utiles;

public class Validadores {

	public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

	/**
	 * @param cadena
	 *            Cadena de caracteres para la que se quiere comprobar si son
	 *            d�gitos todos sus caracteres.
	 * @return Devuelve cierto si todos los caracteres de la cadena son d�gitos.
	 */
	public static Boolean sonDigitos(String cadena) {
		Boolean res = true;
		for (int i = 0; i < cadena.length(); i++) {
			if (!Character.isDigit(cadena.charAt(i))) {
				res = false;
				break;
			}
		}
		return res;
	}

	/**
	 * @param cadena
	 *            Cadena de caracteres para la que se quiere comprobar si son
	 *            d�gitos todos sus caracteres.
	 * @return Devuelve cierto si todos los caracteres de la cadena son d�gitos.
	 */
	public static Boolean sonLetras(String cadena) {
		Boolean res = true;
		for (int i = 0; i < cadena.length(); i++) {
			if (!Character.isLetter(cadena.charAt(i))) {
				res = false;
				break;
			}
		}
		return res;
	}

	/**
	 * @param cadena
	 *            Cadena de caracteres para la que se quiere comprobar si son
	 *            d�gitos todos sus caracteres.
	 * @return Devuelve cierto si todos los caracteres de la cadena son d�gitos.
	 */
	public static Boolean estaEnBase62(String cadena) {
		Boolean res = true;
		for (int i = 0; i < cadena.length(); i++) {
			if (!ALPHABET.contains(cadena.charAt(i) + "")) {
				res = false;
				break;
			}
		}
		return res;
	}

	/**
	 * @param  Cadena de caracteres para la que se quiere comprobar si la cadena dni dada como par�metro tiene un formato de DNI V�lido.
	 * @return Devuelve cierto si todos los caracteres de la cadena son d�gitos.
	 */
	public static Boolean esDNIValido(String dni){
	
	return dni.length() == 9 &&
	  Character.isLetter(dni.charAt(8)) &&
	  Validadores.sonDigitos(dni.substring(0, 9)) &&
	  Validadores.esLetraNIFValida(dni.substring(0, 9), dni.charAt(8));
	}

	/**
	 * @param numerosDNI
	 *            Cadena formada por 8 d�gitos correspondientes a los n�meros de
	 *            un NIF.
	 * @param letra
	 *            Letra asociada al los numeros del DNI.
	 * @return true si la letra dada como par�metro coincide
	 */
	private static Boolean esLetraNIFValida(String numerosDNI, Character letra) {
		final String LETRAS_NIF = "TRWAGMYFPDXBNJZSQVHLCKE";
		Integer numeros = new Integer(numerosDNI);
		Integer resto = numeros % 23;
		return LETRAS_NIF.charAt(resto) == letra;
	}

}
