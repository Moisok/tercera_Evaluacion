package Adivina_Numero;

import java.util.*;

public class Random500 {

	public static void main (String [] args) {
		
		//Creamos el teclado
		
		Scanner teclado = new Scanner(System.in);
		
		//Creamos variables
		int intentos = 0;
		
		int valor = -1;
		
		boolean acierto = true;
		
		int numero=(int)(Math.random()*500+1);
		
		//Creamos el bucle para que nos adivine el numero
		
		System.out.println("(El numero a adivinar seria: " + numero + " )");
		
		//Empezamos el juego
		do {
			
			do {
				
			try {
				intentos++; 
				System.out.println("Introduce un numero del 1 al 500" + " Intento: " + (intentos));
				valor = teclado.nextInt();
				acierto = true;
			}
			
			catch (InputMismatchException e) {
				System.err.println ("No has introducido un valor correcto");
				teclado.next();
				acierto = false;
				}
			
			} while (acierto == false);
				
				
				System.out.println ("Has introducido: " + valor);
				if (valor < numero) {
					System.out.println ("El numero es mayor");
				}
				if (valor > numero) {
					System.out.println ("El numero es menor");
				}
				
		} while (valor != numero);  
			
			
		
		//Mensaje de victoria
		System.out.println ("Genial los has acertado en el intento: " + (intentos-1));
		}
		
	}

	
	

