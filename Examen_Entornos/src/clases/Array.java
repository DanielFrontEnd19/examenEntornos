package clases;
/**
 * Clase Array donde voy a crear un constructor del array
 * y voy a crear dos metodos. Un metodo para ordenar el array (OrdenacionBurbujaMejorada)
 * t el otro metodo para realizar una busqueda de un elemento del array (busquedaLineal)
 * @author daniel.adrianduran
 *@version 1.0
 *@since 15/03/2019
 */
public class Array {
	private int tam;
	private int array [] = new int [tam];
	
	/**
	 * Contructor del Array
	 * @param x
	 */
	public Array(int x[]) {
		this.tam = x.length;
		this.array = x;
	}
	
	/**
	 * Metodo de OrdenacionBurbujaMejorada
	 *en el cual se pretende ordenar el array
	 *realizando comparaciones y realizando intercambios 
	 *de valores si es menor o mayor.
	 */
	public void OrdenacionBurbujaMjeorada () {
		
		 for ( int a = 0; a < array.length; a++) {
	  			System.out.print(array[a] + " ");
	  		}
		 int i, j, aux;
		 for( i= array.length -1; i > 0; i--){
			  for( j = 0; j < i; j++){
				 //comparacion
				  if(array[j] > array[j + 1]){
					 //intercambio de los numeros del array
					  aux=array[j];
					  array[j]=array[j + 1];
					  array[j + 1]=aux;
					
				 }
				
			 }
       		
		 }
		 
	        System.out.println();
	          for ( int a= 0; a < array.length; a++) {
	  			System.out.print(array[a] + " ");
	          }
		
	}
	
	
	
	/**
	 * Metodo buscarLineal. COn este metodo pretendo realizar una busqueda del numero
	 * que voy a pedir por parametro. Recorreremos el array y si lo encuentra dará verdadero sino 
	 * devolverá false porque no se encuentra el elemento buscado en el array.
	 * @param x es el numero que se va a pedir por teclado y es el parametro que vamos a buscar
	 * @return retornara true si el numero buscado a sido encontrado y false si no lo encuentra. 
	 */
	public boolean buscarLineal(int x) {
		boolean sw = false;
		for ( int i =  0; i < array.length && sw==false; i++) {
			if (array[i] == x) {
				sw = true;
			}
		}
		return sw;
	}
}
