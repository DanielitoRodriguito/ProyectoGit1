package calculadora;

/**

*<h2>Clase que hace la función, con números enteros y reales, de dividir y buscar la raíz.No está permitido el uso de números negativos</h2>

* @author ahmed 

*/

	 

	public class Cociente {

	 

	           /**

	           * Número real que utilizará la calculadora para dividir.

	           */

	           private float a;

	           /**

	           * Número real que utilizará la calculadora para dividir.

	           */

	           private float b;

	           /**

	           * Número entero que utilizará la calculadora para dividir.

	           */

	           private int c;

	          /**

	           * Número entero que utilizará la calculadora para dividir.

	          */

	           private int d;

	          /**

	           * Número real que utilizará la calculadora para sacar la raíz.

	           */

	           private double r;

	          

	  

	    public float getA() {

	                      return a;

	           }

	           public void setA(float a) {

	                      this.a = a;

	           }

	           public float getB() {

	                      return b;

	           }

	           public void setB(float b) {

	                      this.b = b;

	           }

	           public int getC() {

	                      return c;

	           }

	           public void setC(int c) {

	                      this.c = c;

	           }

	           public int getD() {

	                      return d;

	           }

	           public void setD(int d) {

	                      this.d = d;

	           }

	           public double getR() {

	                      return r;

	           }

	           public void setR(double r) {

	                      this.r = r;

	           }

	          

	           /**

	           * Constructor con cinco parámetros

	           * Crea objetos de tipo Cociente,recibe números a, b, c, d y r.

	           * @param a número real que utilizará la calculadora para hacer divisiones.

	           * @param b número real que utilizará la calculadora para hacer divisiones.

	           * @param c número entero que utilizará la calculadora para hacer divisiones.

	           * @param d número entero que utilizará la calculadora para hacer divisiones.

	           * @param r número real que utilizará la calculadora para sacar una raíz.

	           */

	           public Cociente(float a, float b, int c, int d, double r) {

	                      super();

	                      this.a = a;

	                      this.b = b;

	                      this.c = c;

	                      this.d = d;

	                      this.r = r;

	           }

	           public Cociente () {

	                     

	           }

	           /**

	           * Divide dos números reales.

	           * @param a número real que utilizará la calculadora para dividir. No puede ser cero porque daría error.

	           * @param b número real que utilizará la calculadora para dividir.Si el número introducido es cero, el resultado siempre será cero.

	           * @return float división a/b.

	           */

	           public float divisionDosReales (float a, float b) { 

	                return a/b;      

	    }

	           /**

	           * Divide dos números enteros.

	           * @param c número entero que utilizará la calculadora para dividir. No puede ser cero porque daría error.

	           * @param d número entero que utilizará la calculadora para dividir. Si el número introducido es cero, el resultado siempre será cero.

	           * @return integer division c/d.

	           */

	    public int divisionDosEnteros (int c, int d) {

	        return c/d;    

	   }

	   /**

	    * Invierte el orden de la division a/b a b/a

	    * @param b número real que utilizará la calculadora para dividir. No puede ser cero porque daría error.

	    * @param a número real que utilizará la calculadora para dividir.Si el número introducido es cero, el resultado siempre será cero.

	    * @return float division de b/a

	    */

	   public float inversoReal (float b, float a) {

	              return b/a;

	   }

	   /**

	    * Método para calcular la raíz de r.

	    * Si el número introducido es cero el resultado siempre será cero.

	    * @param r número real que utilizará la calculadora para sacar la raíz

	    * @return double da el resultado de la raíz cuadrada de r.

	    */

	   public double raiz (double r) {

	              return (double)(Math.sqrt(r));

	   }

	}


