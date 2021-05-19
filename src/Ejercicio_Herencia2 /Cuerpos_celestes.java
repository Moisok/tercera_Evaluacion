package Ejercicio_Herencia2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cuerpos_celestes {

	public static void main(String[] args) throws Exception {
		//Construccion del Scanner
		Scanner teclado = new Scanner(System.in);
		
		//Variable de menu
		int opcion= 0;
		
		FileWriter archivo = null;
		
		//Contruimos arraylist de astros
		
		ArrayList<Astros> listado = new ArrayList<Astros>();
		
		//Construimos satelites y planetas
		Planetas venus = new Planetas ("venus",434323,3325,3323065,243465,543445,434545,1000,false);
		Planetas marte = new Planetas ("Mercurio",434,35,3065,265,545,545,200000,true);
		Planetas tierra = new Planetas ("Tierra",45,34,3000,23,56,56,300000,true);
		Satelites luna = new Satelites ("Luna",20,45,450,0,10,35000,23,"Tierra");
		Satelites phobos = new Satelites ("phobos",23,44,555,6,78,3507600,10,"Marte");
		Satelites deimos = new Satelites ("deimos",23,45,5675,8,30,353407600,5,"Marte");

		listado.add(venus);
		listado.add(marte);
		listado.add(tierra);
		listado.add(luna);
		listado.add(phobos);
		listado.add(deimos);
		
		tierra.aniadeSat(luna);
		
		marte.aniadeSat(phobos);
		marte.aniadeSat(deimos);
	
			
		try {
			
			archivo = new FileWriter("Datos_astros.txt");
			
		while (opcion<8) {
			System.out.println ("1: Datos de tierra");
			System.out.println ("2: Datos de marte");
			System.out.println ("3: Datos de venus");
			System.out.println ("4: Datos de luna");
			System.out.println ("5: Datos de phobos");
			System.out.println ("6: Datos de deimos");
			System.out.println ("7: Todos");
			System.out.println ("8: Salir");
			opcion = teclado.nextInt();
			
			switch (opcion) {
			case 1:
				archivo.write(tierra.toString());
				break;
			case 2:
				archivo.write(marte.toString());
				break;
			case 3:
				archivo.write(venus.toString());
				break;	
			case 4:
				archivo.write(luna.toString());
				break;	
			case 5:
				archivo.write(phobos.toString());
				break;
			case 6:
				archivo.write(deimos.toString());
				break;	
			case 7: 
				//Imprimimos por pantalla metodo for each
				for (Astros astros : listado) {
					archivo.write(astros.toString());
				}
				break;
			case 8:
				System.out.println ("Gracias por usar el programa");
				break;	
			}
			
		}
	
		
	}
		
		catch(Exception E) {
			
		}
	
		finally {
			archivo.close();
			}	
		
		
		
		
		
		
	}

}
