package Clase_File;

import java.io.File;
import java.util.Scanner;

public class Ejemeplos_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner
		Scanner teclado = new Scanner(System.in);
		String directorios;
		
		
		//Creamos objeto de la clase file
		File fichero1 = new File ("/home/moiseg/Documentos/Ejemplos/fichero.txt");
		
		
		//Objeto para directorio
		File directorio = new File ("/home/moiseg/Documentos/Ejemplos");
		File directorio3 = new File ("/home/moiseg/Documentos/Ejemplos/Creacion");
		//Otras dos maneras de referenciar
		File fichero2 = new File ( "/home/moiseg/Documentos/Ejemplos", "fichero2.txt");
		
		File fichero3 = new File (directorio, ".fichero3.txt");
		
		//Imprimimos por pantala el contenido del fichero (ArrayList)
		System.out.println ("Mostramos lista de la carpeta Ejemplos (Crea un array)");
		System.out.println (" ");
		for (String e : directorio.list()) {
			System.out.println(e);
		}
		
		//Por teclado...
		System.out.println (" ");
		System.out.println ("Introduce drectorio");
		directorios = teclado.next();
		System.out.println ("Has introducido: " + directorios);
		File directorio2 = new File (directorios);
		
		System.out.println ("Mostramos listas de la ruta que hemos introducido por pantalla (Si existe...)");
		System.out.println (" ");
		for (String e : directorio2.list()) {
			System.out.println(e);
		}
		
		//Mas metodos de la clase File
		System.out.println (" ");
		System.out.println ("Nombre del fichero");
		System.out.println (directorio.getName());
		//
		System.out.println (" ");
		System.out.println ("Ruta alternativa del fichero");
		System.out.println (directorio.getPath());
		//
		System.out.println (" ");
		System.out.println ("Ruta absoluta del fichero");
		System.out.println (directorio.getAbsolutePath());
		//
		System.out.println (" ");
		System.out.println ("Array de strings");
		System.out.println (directorio.getPath());
		//
		System.out.println (" ");
		System.out.println ("Directorio Padre");
		System.out.println (directorio.getParent());
		
		//Metodos clase File con booleanos
		System.out.println (" ");
		System.out.println ("METODOS BOOLEANOS");
		System.out.println ("Devuelve verdadero o falso si existe o no existe");
		System.out.println (directorio.exists());
		//
		System.out.println (" ");
		System.out.println ("Devuelve verdadero o falso si es un directorio o no, en este caso pondre 2 ejemplos");
		System.out.println (directorio.isDirectory());
		System.out.println (fichero1.isDirectory());
		//
		System.out.println (" ");
		System.out.println ("Devuelve verdadero o falso si es un archivo o no, en este caso pondre 2 ejemplos");
		System.out.println (directorio.isFile());
		System.out.println (fichero1.isFile());
		//
		System.out.println (" ");
		System.out.println ("Devuelve verdadero o falso si es un archivo oculto o no, en este caso pondre 2 ejemplos");
		System.out.println (fichero1.isHidden());
		System.out.println (fichero3.isHidden());
		
		//
		System.out.println (" ");
		System.out.println ("Devuelve el tamanio del archivo");
		System.out.println (fichero1.length()+"/kb");
		//
		System.out.println (" ");
		System.out.println ("Devuelve la fecha de la ultima modificacion");
		System.out.println (fichero1.lastModified());
		
		//Metodos lase file booleanos con creacion y elminacion de archivos
		System.out.println (" ");
		System.out.println ("MODIFICACION DE ARCHIVOS");
		System.out.println ("Borrar Archivo (Primero mostramos)");
		for (String e : directorio.list()) {
			System.out.println(e);
		}
		fichero2.delete();
		System.out.println (" ");
		System.out.println ("Borrar Archivo (Volvemos a mostrar)");
		for (String e : directorio.list()) {
			System.out.println(e);
		}
		//
		System.out.println (" ");
		System.out.println ("Crear directorio");
		directorio3.mkdir();
		for (String e : directorio.list()) {
			System.out.println(e);
		}
		//
		//Revisar mañana
		/**System.out.println (" ");
		System.out.println ("Cambiar nombre del archivo");
		fichero2.renameTo(fichero2);
		for (String e : directorio.list()) {
			System.out.println(e);
		}**/
	
		
	}

}
