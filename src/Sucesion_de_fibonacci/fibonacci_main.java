package Sucesion_de_fibonacci;

import java.io.FileWriter;
import java.io.IOException;

//En este programa hay que calcular la sucesion fibonacci y guardarle en un fichero de texto
//Creado Por Moises Sepulveda Segarra

public class fibonacci_main {

	public static void main(String[] args) throws IOException {
		
		//Variables
		
		double fibonacci = 1;
		
		double acumulador = 1;
		
		double pares;
	
		//Nombre del fichero
		FileWriter archivo = null;
	
		
		//Empezamos el bucle
		try {
			
		archivo = new FileWriter("Datos_numeros.txt");
		
		for (int i=0;i<100;i++) {
			acumulador = fibonacci + acumulador; 
			fibonacci = acumulador - fibonacci;
			if (fibonacci % 2 == 0) {
				archivo.write(" " + (int) fibonacci + "\n"); 
				}
			}
		}
		
		catch (Exception e) {
			
		}
		finally {
		archivo.close();
		}
	}

}
