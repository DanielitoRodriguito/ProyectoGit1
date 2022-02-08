package calculadora;

/**
 * <h2>Se utiliza para realizar sumas mediante la utilizaci�n de diferentes m�todos.</h2>
 * 
 * 
 * @author Pedro G�mez Alonso
 * @version 1.0
 * @since 10-01-2022.
 * 
 */

public class Suma {
	
	/**
	 * Servir� como acumulador para realizar sumas con el m�todo sumaAcumulada().
	 */
	private static int numero = 0;
	
	
	
	/**
	 * M�todo "getter" para el atributo "numero" 
	 * @return numero Valor del atributo "numero".
	 */	
	public static int getNumero() {	
		return numero;
	}

	
	/**
	 * <p> Devuelve un n�mero real cuyo valor es la suma de dos n�meros reales introducidos por par�metro.</p>
	 * <p> Admite n�meros negativos. Si no los admitiera, lo indicar�a o explicar�a el error que devuelve.</p>
	 * 
	 * @param num1 Primer n�mero real a sumar.
	 * @param num2 Segundo n�mero real a sumar.
	 * @return Retorna una n�mero real resultante de la suma de los par�metros introducidos.
	 */
	
	public float sumaReales(float num1, float num2) {
		
		return num1 + num2;
	}
	
	/**
	 * <p> Devuelve un n�mero real cuyo valor es la suma de tres n�meros reales introducidos por par�metro. </p>
	 * <p> Admite n�meros negativos. Si no los admitiera, lo indicar�a o explicar�a el error que devuelve.</p>
	 * 
	 * @param num1 Primer n�mero real a sumar.
	 * @param num2 Segundo n�mero real a sumar.
	 * @param num3 Tercer n�mero real a sumar.
	 * @return Retorna un n�mero real resultante de la suma de los par�metros introducidos.
	 */
	
	public float sumaReales(float num1, float num2, float num3) {
		return num1+num2+num3;
	}
	
	
	
	/**
	 * <p> Devuelve la suma de dos n�mero enteros introducidos por par�metro.</p>
	 * <p> Admite n�meros negativos. Si no los admitiera, lo indicar�a o explicar�a el error que devuelve.</p>
	 * 
	 * @param num1 Primero n�mero entero a sumar.
	 * @param num2 Segundo n�mero entero a sumar.
	 * @return Retorna un n�mero entero resultante de la suma de los par�metros introducidos.
	 */
	
	
	public int dosEnteros(int num1, int num2) {
		return num1+num2;
	}
	

	
	/**
	 * Suma el valor actual del atributo est�tico de la clase suma "numero" al valor de tipo entero introducido por par�metro y el resultado lo almacena de nuevo en el atributo est�tico "numero".
	 * 
	 * @param num Valor de tipo entero que se sumar� al valor actual del atributo de la clase Suma.
	 */
	public void sumaAcumulada(int num) {
		numero = numero + num;
	}
	
}