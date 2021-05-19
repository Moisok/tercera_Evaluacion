package NumeroN;

import java.io.*;

//Programa que lee un archivo con numeros y te dice cual es el mayor y cual es el menor

public class Numeromym {

	public static void main (String[] args ) throws Exception {
		//Variables
		FileReader leer_numeros = null;
		FileWriter escribe_numeros = null;
		int minimo = 0;
		int maximo = 0;
	
		
		
		
		
		try {
			
			//Ruta de donde leemos el archivo
			leer_numeros = new FileReader("numeros.txt");
			//Ruta a exportar
			escribe_numeros = new FileWriter ("numeros2.txt", true);
			
			//Bufer
			BufferedReader entrada = new BufferedReader(leer_numeros);
			String mym = entrada.readLine();
			int numeros = Integer.parseInt(mym);
			
			 minimo = Integer.parseInt(mym);
			 maximo = Integer.parseInt(mym);
			
			while (mym != null) {
				if (minimo < Integer.parseInt(mym)) {
					minimo = Integer.parseInt(mym);
				}
				
				if (maximo > Integer.parseInt(mym)) {
					maximo = Integer.parseInt(mym);
				}
				mym = entrada.readLine();
		}
	}
		
		
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			escribe_numeros.write(minimo +" "+maximo);
			leer_numeros.close();
			escribe_numeros.close();
			System.out.println ("Terminado");
		}
		
	}
}
