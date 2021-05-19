package EjerciciosFile;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class Exercici1 {

	public static void main(String[] args) throws FileNotFoundException {
		
		// Creamos en primer lugar el teclado
		Scanner teclado = new Scanner(System.in);
		
		//Variable
		String directorio="";
		
		//Comenzamos el programa....
		try {
		do {
		System.out.println ("Introduce directorio:");
		directorio = teclado.nextLine();
		File ruta = new File (directorio);
		//Le pasamos el file a la funcion
		muestraRuta(ruta);
		}
		while (!directorio.equals(""));
		}
		
		catch (FileNotFoundException e) {
			System.err.println(e);
		}
		
		//Fin del programa
		finally{
		System.out.println("Fin del programa");
		}
	}
	
	/***Funcion para comprobar ficheros y archivos***/
	public static void muestraRuta (File ruta) throws FileNotFoundException {
		
		if (!ruta.exists()) {
			throw new FileNotFoundException("No existe el directorio");
		}
		
		//Si es solo un fichero...
		if (ruta.isFile()) {
			System.out.println("El nombre del fichero es: " + ruta.getName());
		}
		
		else {
		//Creamos el vector
		 File[] listado = ruta.listFiles();
		 //Creamos el bucle
		 for (int i=0;i<listado.length;i++) {
			 if (listado[i].isFile()) {
				 System.out.println("[A] " +listado[i]);
			 }
			 if (listado[i].isDirectory()) {
				 System.out.println("[*] " +listado[i]);
			 }
		 }
		 
		}
	}
}


