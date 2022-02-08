package calculadora;

/**
 * <h2>Realiza tres tipos de resta: resta de 2 valores enteros, resta de 2 valores reales y resta de 3 valores reales.No est� permitido el uso de n�meros negativos</h2> 
 * Busca informaci�n de javadoc en <a href="https://google.es">Google</a>
 *  
 * @author Daniel Rodr�guez Carou
 * 
 * @version 1.0
 */



public class Resta {
	
	// Creamos una variable de clase
	
/**
* Atributo est�tico que permite acumular valores que se guardar�n en la propia clase	
*/
	    private static double acumuladorValores;


	// Variables de instancia
		
/**
* Atributo de instancia que contiene un valor real				
*/
		private double num1;
		
/**
* Atributo de instancia que contiene un valor real				
*/				
		private double num2;
		
/**
* Atributo de instancia que contiene un valor real				
*/				
		
		private double num3;
		
/**
* Atributo de instancia que contiene un valor entero				
*/				
		
		private int num4;
		
/**
* Atributo de instancia que contiene un valor entero				
*/				
		
		private int num5;
	    	
		
		
// Constructores

/**
* Constructor sin par�metros
* Crea objetos vac�os que recibir�n los valores a trav�s de los m�todos	
*/
	    
	    public Resta() {
			super();
		} 

/** 
* Constructor con dos par�metros
* Crea objetos de tipo Resta con dos n�meros reales, num1 y num2
* @param num1 cualquier n�mero real
* @param num2 cualquier n�mero real		    
*/
	    
	   public Resta(double num1, double num2) {
			super();
			
			this.num1=num1;
			this.num2=num2;
			
		}
	   
/** 
* Constructor con dos par�metros
* Crea objetos de tipo Resta con dos n�meros enteros, num4 y num5
* @param num4 cualquier n�mero entero
* @param num5 cualquier n�mero entero		    
*/

	   public Resta(int num4, int num5) {
			super();
			
			this.num4=num4;
			this.num5=num5;
			
		}
	   			   
/** 
* Constructor con tres par�metros
* Crea objetos de tipo Resta con tres n�meros reales, num1, num2 y num3
* @param num1 cualquier n�mero real
* @param num2 cualquier n�mero real
* @param num3 cualquier n�mero real		    
*/			   
	   
			
		public Resta(double num1, double num2, double num3) {
			super();
			this.num1 = num1;
			this.num2 = num2;
			this.num3 = num3;
		}
					    
	
// M�todo para introducir dos n�meros reales en un objeto
		
/**
* Introduce dos valores reales en un objeto 	
* @param num1 cualquier n�mero real
* @param num2 cualquier n�mero real
*/
		
		public void set2Reales(double num1, double num2) {
			
			this.num1 = num1;
			this.num2 = num2;
			
		}
		
// Resultado	
		
/**
* Devuelve el resultado de la resta de dos n�meros reales introducidos en un objeto
* (Si en el par�metro num1 se introduce un cero y en el num2 se introduce un valor mayor que cero, el resultado ser� siempre negativo y
* si en ambos par�metros, num1 y num2, se introduce como valor cero, el resultado ser� cero)
* @return la suma de num1 y num2
*/
									    		
		public double resultadoResta2Reales() {
			
			return num1 - num2;		
			
		}
						
// M�todo para introducir dos n�meros enteros en un objeto
		
/**
* Introduce dos valores enteros en un objeto			
* @param num4 cualquier n�mero entero
* @param num5 cualquier n�mero entero
*/				
		
	    public void set2Enteros(int num4, int num5) {
			
	    	this.num4 = num4;
			this.num5 = num5;
			
		}
	    
// Resultado
	    
/**
* Devuelve el resultado de la resta de dos n�meros enteros
* (Si en el par�metro num4 se introduce un cero y en el num5 se introduce un valor mayor que cero, el resultado ser� siempre negativo y
* si en ambos par�metros, num4 y num5, se introduce como valor cero, el resultado ser� cero)
* @return la suma de num4 y num5
*/
		
	    public int resultadoResta2Enteros() {
			
			return num4 - num5;		
			
		}
		
		
// M�todo para introducir tres n�meros reales en un objeto
	    
/**
* Introduce tres valores reales en un objeto			
* @param num1 cualquier n�mero real
* @param num2 cualquier n�mero real
* @param num3 cualquier n�mero real
*/		    
		
		public void set3Reales(double num1, double num2, double num3) {
			
			this.num1 = num1;
			this.num2 = num2;
			this.num3 = num3;
			
		}
		
// Resultado
		
/**
* Devuelve el resultado de la resta de tres n�meros reales
* (Si en el par�metro num1 se introduce un cero, el resultado ser� siempre negativo;
* si se introduce un cero en cada par�metro, el resultado ser� cero y si se introduce un cero en cualquiera de los par�metros num2 y num3, el resultado depender�
* del contenido en num1, siendo negativo si num1 es menor que num2 en caso de que num3 sea cero y siendo negativo si num1 es menor que num3 en caso de que num2 sea cero)
* @return la suma de num1, num2 y num3
*/
	    
	    public double resultadoResta3Reales() {
			
			return num1 - num2 - num3;		
			
		}
		
	
// Acumular valores en la variable de la clase
	    
/** A�ade un valor al atributo est�tico de la clase, acumuladorValores, restando el valor anterior de ese mismo atributo con el valor introducido
*  @param valores cantidad a a�adir al acumulador de valores
*/
	    
	    public void setValores( double valores) {
	    	
	    	acumuladorValores = acumuladorValores - valores;
	    	
	    }
   
// Prueba para saber si se acumula en la variable de clase

/**
* Devuelve el valor del acumulador
* @return contenido de la variable de acumuladorValor
*/
	    
	    public double acumulador() {
	    	
	    	return acumuladorValores;
	    	
	    }
    	
	
	
	

}
