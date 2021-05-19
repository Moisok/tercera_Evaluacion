package TerminalV2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Nuevos {

	private String opcion;
	
	//Introducir datos por pantall
	Scanner teclado = new Scanner(System.in);
	
	//Constructor
		public Nuevos () {
		}

	//Informacion del meni
		public void infomenu () {
			System.out.println(
					"- fibo + ruta + nombrearchivo: Calcula Sucesion fibonacci en la ruta indicada\n"
					+ "- palin + ruta + nombrearchiv: Te dice si una frase es un palindromo o no y te lo exporta en un fichero en la ruta indicada\n"
					+ "- numbers + nombredearchivo + ruta de Destino + nombreaexportar.txt: Coge un archivo con numeros (que esta en la carpeta raiz del proyecto) y te lo exporta a otro indicando cual es el mayor y cual es el menor ");}

	//Sucesion Fibonacci
		public void fibonacci (String ruta, String nombre) throws Exception  {
		double fibonacci1 = 1;
		double acumulador = 1;
		double pares;
		FileWriter archivo = new FileWriter(ruta + "/" + nombre);
		for (int i=0;i<100;i++) {
			acumulador = fibonacci1 + acumulador; 
			fibonacci1 = acumulador - fibonacci1;
			if (fibonacci1 % 2 == 0) {
				archivo.write(" " + (int) fibonacci1 + "\n"); 
				}
			}
		archivo.close();
		
		}
		 
	//Palindromo
		public void palindromo (String ruta, String nombre) throws Exception {
			String frase="";
			boolean palindromo = false;
			FileWriter archivo = null;
			archivo = new FileWriter(ruta + "/" + nombre);
			System.out.println ("Introduce una frase");
			frase = teclado.nextLine();
			frase = frase.replace(" ", "");
			frase = frase.toLowerCase();
			System.out.println (frase);
			String frase2 = new StringBuilder(frase).reverse().toString();
			System.out.println (frase2);
			if (frase.equals(frase2)) {
				archivo.write("La frase: " + frase + " es un palindromo por que es similar a: " + frase2);
			}
			else {
				archivo.write("La frase: " + frase + " no es un palindromo por que no es similar a: " + frase2);
			}
			archivo.close();
		}
		
	//Numero mayor y menor
		public void numbers (String rutanumeros, String ruta, String nuevonumeros) throws IOException {
			FileReader leer_numeros = null;
			FileWriter escribe_numeros = null;
			int minimo = 0;
			int maximo = 0;
			leer_numeros = new FileReader(rutanumeros);
			escribe_numeros = new FileWriter (ruta + "/" + nuevonumeros, true);
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
			 	escribe_numeros.write(minimo +" "+maximo);
				leer_numeros.close();
				escribe_numeros.close();
				System.out.println ("Terminado");
			 
		}
		
	//Media de los alumnos
		public void media () throws IOException {
			File notas  = new File ("/home/moiseg/Documentos/Tercera_Evaluacion/alumnos_notas.txt");
			FileReader calculamedia = new FileReader (notas);
			BufferedReader entrada = new BufferedReader (calculamedia);
			//variables
			double contador = 0;
			double suma = 0;
			double media = 0;
			int prueba = 0;				String vectorpalabra;
			//Bucle para sumar
			while (prueba < 10) {
			String [] vectorlectura;
			String lectura = entrada.readLine();
			vectorlectura = (lectura.split(" "));
			for (int i=2; i<vectorlectura.length;i++) {
				suma = suma + Integer.parseInt(vectorlectura[i]);
				contador++;
			}
			media = suma/contador;
			System.out.println ("La media de " + vectorlectura[0] + " " + vectorlectura[1] + " es de:" +media);
			prueba++;
			}
		}
		
	//Ordenar archivos
		public void ordenar_archivos() throws IOException {
			String nombre;
			String nombre2;
			//Pedimos nombres para los archivos
			System.out.println("Introduce nombre de archivo y extension");
			nombre = teclado.nextLine();
			System.out.println ("Introduce nombre a exportar y extension");
			nombre2 = teclado.nextLine();
			//Ponemos las rutas
			FileReader archivo1 = new FileReader(nombre);
			FileWriter archivo2 = new FileWriter (nombre2);
			BufferedReader bufer = new BufferedReader (archivo1);
			String espacio = " ";
			String saltolinea = null;
			ArrayList <String> ordenar = new ArrayList <String>();
			System.out.println ("Ordenando alfabeticamente los siguientes nombres....");
			for (int i=0;i<20;i++) {
				saltolinea = bufer.readLine();
				ordenar.add(saltolinea); 
				System.out.println(saltolinea);
				System.out.println(" ");
				Collections.sort(ordenar);
			}
			archivo2.write(ordenar+espacio);
			archivo1.close();
			archivo2.close();
			System.out.println ("Terminado");
		}
		
//Final de la clase		
}