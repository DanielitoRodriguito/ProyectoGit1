package calculadora;

/**
 * <h2>Se utiliza para realizar sumas mediante la utilización de diferentes métodos.</h2>
 * 
 * 
 * @author Pedro Gómez Alonso
 * @version 1.0
 * @since 10-01-2022.
 * 
 */

public class Suma {
	
	/**
	 * Servirá como acumulador para realizar sumas con el método sumaAcumulada().
	 */
	private static int numero = 0;
	
	
	
	/**
	 * Método "getter" para el atributo "numero" 
	 * @return numero Valor del atributo "numero".
	 */	
	public static int getNumero() {	
		return numero;
	}

	
	/**
	 * <p> Devuelve un número real cuyo valor es la suma de dos números reales introducidos por parámetro.</p>
	 * <p> Admite números negativos. Si no los admitiera, lo indicaría o explicaría el error que devuelve.</p>
	 * 
	 * @param num1 Primer número real a sumar.
	 * @param num2 Segundo número real a sumar.
	 * @return Retorna una número real resultante de la suma de los parámetros introducidos.
	 */
	
	public float sumaReales(float num1, float num2) {
		
		return num1 + num2;
	}
	
	/**
	 * <p> Devuelve un número real cuyo valor es la suma de tres números reales introducidos por parámetro. </p>
	 * <p> Admite números negativos. Si no los admitiera, lo indicaría o explicaría el error que devuelve.</p>
	 * 
	 * @param num1 Primer número real a sumar.
	 * @param num2 Segundo número real a sumar.
	 * @param num3 Tercer número real a sumar.
	 * @return Retorna un número real resultante de la suma de los parámetros introducidos.
	 */
	
	public float sumaReales(float num1, float num2, float num3) {
		return num1+num2+num3;
	}
	
	
	
	/**
	 * <p> Devuelve la suma de dos número enteros introducidos por parámetro.</p>
	 * <p> Admite números negativos. Si no los admitiera, lo indicaría o explicaría el error que devuelve.</p>
	 * 
	 * @param num1 Primero número entero a sumar.
	 * @param num2 Segundo número entero a sumar.
	 * @return Retorna un número entero resultante de la suma de los parámetros introducidos.
	 */
	
	
	public int dosEnteros(int num1, int num2) {
		return num1+num2;
	}
	

	
	/**
	 * Suma el valor actual del atributo estático de la clase suma "numero" al valor de tipo entero introducido por parámetro y el resultado lo almacena de nuevo en el atributo estático "numero".
	 * 
	 * @param num Valor de tipo entero que se sumará al valor actual del atributo de la clase Suma.
	 */
	public void sumaAcumulada(int num) {
		numero = numero + num;
	}
	
}