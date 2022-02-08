package calculadora;

/**
 * <h2>Esta clase realizará tres tipos de multiplicaciones: producto de 2 valores reales, producto entre 2 valores enteros, producto entre 3 enteros y la potencia entre 2 numeros reales.No está permitido el uso de valores negativos</h2>
 * 	Busca información sobre JavaDoc en <a href="https://google.es">Gogle</a>
 * 
 * @author Pedro José García Rodríguez
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
	 * Método constructor sin parámetros.
	 * Crea objetos vacíos, los cuales recibirán los valores a través de los métodos de producto.
	 */
	
	public Producto() {
		super();
	}

	/**
	 * Método que devuelve el resultado de multiplicar dos números reales.
	 * En el caso de que el número a multiplicar sea cero, el resultado será cero, independientemente de cuál sea el número que multiplique a cero.
	 * 
	 * @param num1 Número real pedido.
	 * @param num2 Número real pedido.
	 *  
	 * @return Devuelve el resultado de multiplicar ambos números reales pedidos.
	 * 
	 */
	
	public double ProductoReales (double num1, double num2) {
		
		return num1 * num2;
	
	}
	
	/**
	 * 
	 * Método que devuelve el resultado de multiplicar dos números enteros.
	 * En el caso de que el número a multiplicar sea cero, el resultado será cero, independientemente de cuál sea el número que multiplique a cero.
	 * 
	 * @param num3 Número entero pedido.
	 * @param num4 Número entero pedido.
	 * 
	 * @return Devuelve el resultado de restar ambos números enteros pedidos.
	 */
	
	public int ProductoEnteros (int num3, int num4) {
		return num3 * num4;
	}

	/**
	 * Método que devuelve el resultado de multiplicar 3 números reales.
	 * En el caso de que el número a multiplicar sea cero, el resultado será cero, independientemente de cuál sea el número que multiplique a cero.
	 * 
	 * @param num5 Número real pedido.
	 * @param num6 Número real pedido.
	 * @param num7 Número real pedido.
	 * @return Devuelve el resultado de multiplicar los tres números reales pedidos por consola.
	 */
	
	public double Producto3Reales (double num5, double num6, double num7) {
		return num5 * num6 * num7;
	}
	
	/**
	 * Método que devuelve el resultado de hacer la potencia de dos números pedidos, siendo el parámetro num8 la base, y el parámetro num9 el exponente de la potencia.
	 * En el caso de que los números solicitados sean demasiado grandes, el resultado que obtendremos por consola será "infinity".
	 * 
	 * En el caso de que uno de los números pedidos, sea cero, el resultado obtenido será uno.
	 * 
	 * @param num8 Número pedido que será la base de la potencia.
	 * @param num9 Número pedido que será el exponente de la potencia.
	 * @return Devuelve el resultado de realizar la potencia entre los números pedidos.
	 */
	
	public double Potencia (double num8, double num9) {
		return Math.pow(num8, num9);
		
	}
}

