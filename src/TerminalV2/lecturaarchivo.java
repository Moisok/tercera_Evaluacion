package TerminalV2;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class lecturaarchivo {

	public static void main(String[] args) throws IOException {
		
		//Construimos Scanner
		Scanner teclado = new Scanner (System.in);
		
		//Variables
		String nombre1;
		String nombre2;
		
		//Pedimos primer nombre
		System.out.print ("Introduce nombre de fichero a leer (y extension): ");
		nombre1 = teclado.next();
		System.out.println("Has introducido: " + nombre1);
		//
		System.out.println ("Introduce nombre a exportar(y extension): " );
		nombre2 = teclado.next();
		System.out.println("Has introducido: " + nombre2);
		//Ruta de origen
	
		FileReader lectura = new FileReader ("/home/moiseg/Documentos/Tercera_Evaluacion" + "/" + nombre1);
		BufferedReader entrada = new BufferedReader (lectura);
		String leer_lineas = entrada.readLine();
		//Prueba
		System.out.println (leer_lineas);
		
		
		
		

	}

}
