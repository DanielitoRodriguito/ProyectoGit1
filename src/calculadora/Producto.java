package calculadora;

/**
 * <h2>Esta clase realizar� tres tipos de multiplicaciones: producto de 2 valores reales, producto entre 2 valores enteros, producto entre 3 enteros y la potencia entre 2 numeros reales.No est� permitido el uso de valores negativos</h2>
 * 	Busca informaci�n sobre JavaDoc en <a href="https://google.es">Gogle</a>
 * 
 * @author Pedro Jos� Garc�a Rodr�guez
 * @version 1.0
 */

public class Producto {
	
	/**
	 * Atributo de instancia que contiene un valor real.
	 */
	
	private double num1;
	
	/**
	 * Atributo de instancia que contiene un valor real.
	 */
	
	private double num2;
	
	/**
	 * Atributo de instancia que contiene un valor entero.
	 */
	
	private int num3;
	
	/**
	 * Atributo de instancia que contiene un valor entero.
	 */
	
	private int num4;
	
	/**
	 * Atributo de instancia que contiene un valor real.
	 */
	
	private double num5;
	
	/**
	 * Atributo de instancia que contiene un valor real.
	 */
	
	private double num6;
	
	/**
	 * Atributo de instancia que contiene un valor real.
	 */
	
	private double num7;
	
	/**
	 * Atributo de instancia que contiene un valor real.
	 */
	
	private double num8;
	
	/**
	 * Atributo de instancia que contiene un valor real.
	 */
	
	private double num9;
	
	/**
	 * M�todo constructor sin par�metros.
	 * Crea objetos vac�os, los cuales recibir�n los valores a trav�s de los m�todos de producto.
	 */
	
	public Producto() {
		super();
	}

	/**
	 * M�todo que devuelve el resultado de multiplicar dos n�meros reales.
	 * En el caso de que el n�mero a multiplicar sea cero, el resultado ser� cero, independientemente de cu�l sea el n�mero que multiplique a cero.
	 * 
	 * @param num1 N�mero real pedido.
	 * @param num2 N�mero real pedido.
	 *  
	 * @return Devuelve el resultado de multiplicar ambos n�meros reales pedidos.
	 * 
	 */
	
	public double ProductoReales (double num1, double num2) {
		
		return num1 * num2;
	
	}
	
	/**
	 * 
	 * M�todo que devuelve el resultado de multiplicar dos n�meros enteros.
	 * En el caso de que el n�mero a multiplicar sea cero, el resultado ser� cero, independientemente de cu�l sea el n�mero que multiplique a cero.
	 * 
	 * @param num3 N�mero entero pedido.
	 * @param num4 N�mero entero pedido.
	 * 
	 * @return Devuelve el resultado de restar ambos n�meros enteros pedidos.
	 */
	
	public int ProductoEnteros (int num3, int num4) {
		return num3 * num4;
	}

	/**
	 * M�todo que devuelve el resultado de multiplicar 3 n�meros reales.
	 * En el caso de que el n�mero a multiplicar sea cero, el resultado ser� cero, independientemente de cu�l sea el n�mero que multiplique a cero.
	 * 
	 * @param num5 N�mero real pedido.
	 * @param num6 N�mero real pedido.
	 * @param num7 N�mero real pedido.
	 * @return Devuelve el resultado de multiplicar los tres n�meros reales pedidos por consola.
	 */
	
	public double Producto3Reales (double num5, double num6, double num7) {
		return num5 * num6 * num7;
	}
	
	/**
	 * M�todo que devuelve el resultado de hacer la potencia de dos n�meros pedidos, siendo el par�metro num8 la base, y el par�metro num9 el exponente de la potencia.
	 * En el caso de que los n�meros solicitados sean demasiado grandes, el resultado que obtendremos por consola ser� "infinity".
	 * 
	 * En el caso de que uno de los n�meros pedidos, sea cero, el resultado obtenido ser� uno.
	 * 
	 * @param num8 N�mero pedido que ser� la base de la potencia.
	 * @param num9 N�mero pedido que ser� el exponente de la potencia.
	 * @return Devuelve el resultado de realizar la potencia entre los n�meros pedidos.
	 */
	
	public double Potencia (double num8, double num9) {
		return Math.pow(num8, num9);
		
	}
}

