package main;

import java.util.Scanner;

import clases.Array;

/**
 * He creado un programa con el que pretendo realizar una busqueda de un elemento
 * de un array que pediremos por teclado. Donde nos especificará si se encuentra en el array o no. 
 * Para ello realizará una ordenacion del array para despues realizar la busqueda. 
 * 
 * @author daniel.adrianduran
 *@version 1.0
 *@since 15/03/2019
 */

public class Examen_Entornos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
		
		int array [] = {15,1,22,9,12,6,4,8,15,21,18,17, 2, 11,16};
		int x;
		
		
		Array a1 = new Array (array);
		System.out.println();
		a1.OrdenacionBurbujaMjeorada();
		System.out.println();
		System.out.println("Introduce un numero a buscar: ");
		x = sc.nextInt();
		a1.buscarLineal(x);
		if (a1.buscarLineal(x)) {
			System.out.println("El numero : " + x +  "  se encuentra en el la lista  " );
		}
		else {
			System.out.println("El valor buscado no se encuentra en el la lista");
			
		}
		sc.close();
	}

}
