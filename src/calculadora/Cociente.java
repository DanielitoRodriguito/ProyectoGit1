package calculadora;

/**

*<h2>Clase que hace la funci�n, con n�meros enteros y reales, de dividir y buscar la ra�z.No est� permitido el uso de n�meros negativos</h2>

* @author ahmed 

*/

	 

	public class Cociente {

	 

	           /**

	           * N�mero real que utilizar� la calculadora para dividir.

	           */

	           private float a;

	           /**

	           * N�mero real que utilizar� la calculadora para dividir.

	           */

	           private float b;

	           /**

	           * N�mero entero que utilizar� la calculadora para dividir.

	           */

	           private int c;

	          /**

	           * N�mero entero que utilizar� la calculadora para dividir.

	          */

	           private int d;

	          /**

	           * N�mero real que utilizar� la calculadora para sacar la ra�z.

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

	           * Constructor con cinco par�metros

	           * Crea objetos de tipo Cociente,recibe n�meros a, b, c, d y r.

	           * @param a n�mero real que utilizar� la calculadora para hacer divisiones.

	           * @param b n�mero real que utilizar� la calculadora para hacer divisiones.

	           * @param c n�mero entero que utilizar� la calculadora para hacer divisiones.

	           * @param d n�mero entero que utilizar� la calculadora para hacer divisiones.

	           * @param r n�mero real que utilizar� la calculadora para sacar una ra�z.

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

	           * Divide dos n�meros reales.

	           * @param a n�mero real que utilizar� la calculadora para dividir. No puede ser cero porque dar�a error.

	           * @param b n�mero real que utilizar� la calculadora para dividir.Si el n�mero introducido es cero, el resultado siempre ser� cero.

	           * @return float divisi�n a/b.

	           */

	           public float divisionDosReales (float a, float b) { 

	                return a/b;      

	    }

	           /**

	           * Divide dos n�meros enteros.

	           * @param c n�mero entero que utilizar� la calculadora para dividir. No puede ser cero porque dar�a error.

	           * @param d n�mero entero que utilizar� la calculadora para dividir. Si el n�mero introducido es cero, el resultado siempre ser� cero.

	           * @return integer division c/d.

	           */

	    public int divisionDosEnteros (int c, int d) {

	        return c/d;    

	   }

	   /**

	    * Invierte el orden de la division a/b a b/a

	    * @param b n�mero real que utilizar� la calculadora para dividir. No puede ser cero porque dar�a error.

	    * @param a n�mero real que utilizar� la calculadora para dividir.Si el n�mero introducido es cero, el resultado siempre ser� cero.

	    * @return float division de b/a

	    */

	   public float inversoReal (float b, float a) {

	              return b/a;

	   }

	   /**

	    * M�todo para calcular la ra�z de r.

	    * Si el n�mero introducido es cero el resultado siempre ser� cero.

	    * @param r n�mero real que utilizar� la calculadora para sacar la ra�z

	    * @return double da el resultado de la ra�z cuadrada de r.

	    */

	   public double raiz (double r) {

	              return (double)(Math.sqrt(r));

	   }

	}


