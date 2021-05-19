package Palindromo_pantalla;

//Programa para crear archivo una frase sobre si es palindromo o no

import java.io.FileWriter;
import java.util.Scanner;


public class Palindromo {
	
	public static void main (String[]args) throws Exception {
		
		//Creamos el teclado
		Scanner teclado = new Scanner(System.in);
		
		//Creamos las variables
		String frase=" ";
		String palindromo=" ";
		boolean esono = true;
		FileWriter archivo = null;
		
		//Pedimos la frase y comenzamos el Try
		try {
			
			archivo = new FileWriter("Palindromo2.txt");
			
		System.out.println ("Introduce una frase");
		frase = teclado.nextLine();
		frase = frase.replace(" ", "");
		frase = frase.toLowerCase();
		int caracteres = frase.length();
		//Bucle para comprobar los caracteres
		
		for (int i=0;i<caracteres && esono;i++) {
			//Aqui lo que hago es comprobar las posiciones (i) con el de la ultima posicion -i
			palindromo=palindromo+frase.charAt(i);
			if (frase.charAt(i) != frase.charAt((caracteres -1) -i)) {
            	frase=palindromo+palindromo.charAt(i);
                esono = false;
            }
		}
		
		if (esono) {
			archivo.write("La frase: " + frase + " es un palindromo");
		}
		
		else {
			archivo.write("La frase: " + frase + " no es un palindromo, lo siento");
		}
		}
		
		catch (Exception e) {
			System.err.println ("Error al crear el archivo");
		}
			
		finally {
			archivo.close();
		}
	}

}
