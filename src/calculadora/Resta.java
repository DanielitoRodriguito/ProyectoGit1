package calculadora;

/**
 * <h2>Realiza tres tipos de resta: resta de 2 valores enteros, resta de 2 valores reales y resta de 3 valores reales.No está permitido el uso de números negativos</h2> 
 * Busca información de javadoc en <a href="https://google.es">Google</a>
 *  
 * @author Daniel Rodríguez Carou
 * 
 * @version 1.0
 */



public class Resta {
	
	// Creamos una variable de clase
	
/**
* Atributo estático que permite acumular valores que se guardarán en la propia clase	
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
* Constructor sin parámetros
* Crea objetos vacíos que recibirán los valores a través de los métodos	
*/
	    
	    public Resta() {
			super();
		} 

/** 
* Constructor con dos parámetros
* Crea objetos de tipo Resta con dos números reales, num1 y num2
* @param num1 cualquier número real
* @param num2 cualquier número real		    
*/
	    
	   public Resta(double num1, double num2) {
			super();
			
			this.num1=num1;
			this.num2=num2;
			
		}
	   
/** 
* Constructor con dos parámetros
* Crea objetos de tipo Resta con dos números enteros, num4 y num5
* @param num4 cualquier número entero
* @param num5 cualquier número entero		    
*/

	   public Resta(int num4, int num5) {
			super();
			
			this.num4=num4;
			this.num5=num5;
			
		}
	   			   
/** 
* Constructor con tres parámetros
* Crea objetos de tipo Resta con tres números reales, num1, num2 y num3
* @param num1 cualquier número real
* @param num2 cualquier número real
* @param num3 cualquier número real		    
*/			   
	   
			
		public Resta(double num1, double num2, double num3) {
			super();
			this.num1 = num1;
			this.num2 = num2;
			this.num3 = num3;
		}
					    
	
// Método para introducir dos números reales en un objeto
		
/**
* Introduce dos valores reales en un objeto 	
* @param num1 cualquier número real
* @param num2 cualquier número real
*/
		
		public void set2Reales(double num1, double num2) {
			
			this.num1 = num1;
			this.num2 = num2;
			
		}
		
// Resultado	
		
/**
* Devuelve el resultado de la resta de dos números reales introducidos en un objeto
* (Si en el parámetro num1 se introduce un cero y en el num2 se introduce un valor mayor que cero, el resultado será siempre negativo y
* si en ambos parámetros, num1 y num2, se introduce como valor cero, el resultado será cero)
* @return la suma de num1 y num2
*/
									    		
		public double resultadoResta2Reales() {
			
			return num1 - num2;		
			
		}
						
// Método para introducir dos números enteros en un objeto
		
/**
* Introduce dos valores enteros en un objeto			
* @param num4 cualquier número entero
* @param num5 cualquier número entero
*/				
		
	    public void set2Enteros(int num4, int num5) {
			
	    	this.num4 = num4;
			this.num5 = num5;
			
		}
	    
// Resultado
	    
/**
* Devuelve el resultado de la resta de dos números enteros
* (Si en el parámetro num4 se introduce un cero y en el num5 se introduce un valor mayor que cero, el resultado será siempre negativo y
* si en ambos parámetros, num4 y num5, se introduce como valor cero, el resultado será cero)
* @return la suma de num4 y num5
*/
		
	    public int resultadoResta2Enteros() {
			
			return num4 - num5;		
			
		}
		
		
// Método para introducir tres números reales en un objeto
	    
/**
* Introduce tres valores reales en un objeto			
* @param num1 cualquier número real
* @param num2 cualquier número real
* @param num3 cualquier número real
*/		    
		
		public void set3Reales(double num1, double num2, double num3) {
			
			this.num1 = num1;
			this.num2 = num2;
			this.num3 = num3;
			
		}
		
// Resultado
		
/**
* Devuelve el resultado de la resta de tres números reales
* (Si en el parámetro num1 se introduce un cero, el resultado será siempre negativo;
* si se introduce un cero en cada parámetro, el resultado será cero y si se introduce un cero en cualquiera de los parámetros num2 y num3, el resultado dependerá
* del contenido en num1, siendo negativo si num1 es menor que num2 en caso de que num3 sea cero y siendo negativo si num1 es menor que num3 en caso de que num2 sea cero)
* @return la suma de num1, num2 y num3
*/
	    
	    public double resultadoResta3Reales() {
			
			return num1 - num2 - num3;		
			
		}
		
	
// Acumular valores en la variable de la clase
	    
/** Añade un valor al atributo estático de la clase, acumuladorValores, restando el valor anterior de ese mismo atributo con el valor introducido
*  @param valores cantidad a añadir al acumulador de valores
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
