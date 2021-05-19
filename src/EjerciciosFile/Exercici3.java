package EjerciciosFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * Metodes de la classe FILE:
 * renameTo()
 * File[] listFiles()
 * 
 * Metodes de la classe ARRAYS
 * sort()
 * 
 * Per imprimir els axrius i directoris de manera ordenada, crearem una funcio anomenada imprimirLlistaArxius() 
 * Per esborrar les extensions crearem una funcio anomenada llevarExtensionsArxius()
 * 
 */

public class Exercici3 {

// Creem dos objectes de tipus File on assignem la ruta d'origen i la ruta desto. (PER A LA CARPETA DOCUMENTS)       
	
	public static void main (String args[]) {
		
		File docOrigen = new File("Documentos");
		File docDesti =new File("DOCS");

// Comprove que la carpetada DOCUMENTOS esta creada, simplement es per acotar errors
		
		if(!docOrigen.exists())
			System.out.println("COMPROVA QUE LA CARPETA DOCUMENTS ESTA CREADA I LA RUTA ES CORRECTA");
		
// Reanomenem la carpeta Documents
		docOrigen.renameTo(docDesti);
		
// Creem dos objectes de tipus File on assignem la ruta d'origen i la ruta desti. // (PER A LA CARPETA FOTOGRAFIAS) i canviem el nom
		
		File fotoOrigen = new File("DOCS/Fotografias");
		File fotoDesti = new File("DOCS/FOTOS");
		fotoOrigen.renameTo(fotoDesti);
		
// Creem dos objectes de tipus File on assignem la ruta d'origen i la ruta desti. // (PER A LA CARPETA LIBROS) i canviem el nom
		
		File llibreOrigen = new File("DOCS/Libros");
		File llibreDesti = new File("DOCS/LECTURES");
		llibreOrigen.renameTo(llibreDesti);
		

		/* **********************************************************
         *  Llevem les extensions en FOTOS (REANOMENTANT ELS ARXIUS)
           ********************************************************** */
        
  // ABANS d'eliminar les extensions, imprimim "[A] " + Array.Sort(listados)la llista d'arxius ordenada cridant a la funcio imprimirLlistaArxius()
		
		imprimirListaDeArchivos(docDesti);
		
// Reanomenem els arxius, llenvant les Extensions cridant a la funcio llevarExtensionsArxius()
// DESPRES d'eliminar les extensions, imprimim de nou la llista d'arxius ordenadacridant a la funcio imprimirLlistaArxius()

		eliminarExtensiones(docDesti);
		
		System.out.println (" ");
		
		imprimirListaDeArchivos(docDesti);
	
		
} // del main()
	
/*
 * IMPRIMIR LLISTA ARXIUS
 * 
 */
	public static void imprimirListaDeArchivos (File datos) {
		//Vector
		File []listado = datos.listFiles();
		Arrays.sort(listado);
		//Creamos el vector
		for (File file : listado) {
			if (file.isDirectory()) {
				System.out.println(file.getName());
			}
			if (file.isFile()) {
				System.out.println(file.getName());
			}
		 }
	}
	
/*
 * 
 * LLEVAR EXTENSIONS ARXIUS
 * 	
 */
	public static void eliminarExtensiones (File datos) {
		for (File dof : datos.listFiles()) {
			if (dof.isFile()) {
			String [] orden = dof.getName().split("\\.");
			File destino = new File (dof.getParent() + "/" + orden[0]);
			dof.renameTo(destino);
			}
		}
	}
	



} // de la classe
