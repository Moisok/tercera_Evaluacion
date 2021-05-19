package paises_l;

//Programa que lee los numeros de un archivo y te dice cual es el mayor y cual es el menor 

import java.io.*;

public class paisesS {
		//Clase principal
		public static void main (String[] args ) throws Exception  {
			//Creamos las variables tipo leer y escribir
			FileReader leer_paises = null;
			FileWriter escribir_paises = null;
			
			try {
				
				//Seleccionamos de donde leemos
				leer_paises = new FileReader("paises.txt");
				//Especificamos a donde lo exportamos
				escribir_paises = new FileWriter("Paises_exp.txt",true);
				
				BufferedReader entrada = new BufferedReader(leer_paises);
				String paises = entrada.readLine();
				
				while (paises != null) {
					//Escribirmos el archivo
					escribir_paises.write(paises+"\n");
					paises = entrada.readLine();

				}
			}
			
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			finally {
				leer_paises.close();
				escribir_paises.close();
			}
		}
		
	}


