package Palindromo_pantalla;

//Programa para crear archivo una frase sobre si es palindromo o no

import java.io.FileWriter;
import java.util.Scanner;


public class Palindromo3 {
	
	public static void main (String[]args) throws Exception {
		
		//Creamos el teclado
		Scanner teclado = new Scanner(System.in);
		
		//Creamos las variables
		String frase="";
		boolean palindromo = false;
		FileWriter archivo = null;
		
		
		//Pedimos la frase y comenzamos el Try
		try {
			
		archivo = new FileWriter("Palindromo.txt");
		System.out.println ("Introduce una frase");
		frase = teclado.nextLine();
		frase = frase.replace(" ", "");
		frase = frase.toLowerCase();
		System.out.println (frase);
		
		//revertimos la frase
		String frase2 = new StringBuilder(frase).reverse().toString();
		System.out.println (frase2);
		
		//comprobamos
		if (frase.equals(frase2)) {
			archivo.write("La frase: " + frase + " es un palindromo por que es similar a: " + frase2);
		}
		
		else {
			archivo.write("La frase: " + frase + " no es un palindromo por que no es similar a: " + frase2);
		}
		
		}
		
		catch (Exception e) {
			System.err.println ("Error de escritura");
			
		}
		
		finally {
		archivo.close();
		}
			
	}

}
