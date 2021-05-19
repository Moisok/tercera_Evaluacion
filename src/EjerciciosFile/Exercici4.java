package EjerciciosFile;

import java.io.File;

public class Exercici4 {
	
	public static void main(String args[]) {
		
		
		// Creem Instancies de la classe FILE amb les RUTES RELATIVES de les carpetes que volem crear
		
		File lesMeuesCoses = new File ("Documentos/Les Meues Coses");
		File alfabet = new File("Documentos/Alfabet");
		
		// Creem les carptetes i ho comporvem. (NOTA: les variables resultat1 i resultat2 son BOOLEANES
		
		boolean resultado1 = false;
		boolean resultado2 = false;
		
		lesMeuesCoses.mkdir();
		alfabet.mkdir();
		
		
		//Comprobacion 
		if (lesMeuesCoses.exists()) {
			resultado1 = true;
		}
		
		if (alfabet.exists()) {
			resultado2 = true;
		}
		
		/* Crea carpeta "Les Meues Coses" */
		System.out.println("S'ha creat la carpeta 'Documents/Les Meues Coses'?? " + resultado1);
		
		/* Crea carpeta "Alfabet" */
		System.out.println("S'ha creat la carpeta 'Documents/Alfabet'?? " + resultado2);
		
		// Anem a moure les carpetes. Primer creem instacies d'Objectes de la classe FILE amb les rutes origen i dest�
		
		File fotoOrigen = new File("Documentos/Fotografias");
		File fotoDesti = new File("Documentos/Les Meues Coses/Fotografias");
		
		/* Crea les instancies Origen i Desti per a Libros */
		
		File libroOrigen = new File ("Documentos/Libros");
		File librosDestino = new File("Documentos/Les Meues Coses/Libros");
		
		// Movem la carpeta 'Fotografias' dins de 'Les Meues Coses', i comprovem que s'ha mogut correctament 
		
		fotoOrigen.renameTo(fotoDesti);
		libroOrigen.renameTo(librosDestino);
		
		resultado1 = fotoOrigen.renameTo(fotoDesti);
		System.out.println("S'ha mogut la carpeta 'Documentos/Fotografias' a 'Documentos/Les Meues Coses/Fotografias'? " + resultado1);
		
		/* Mou la carpeta libros */
		
		/*Crea dins de la carpeta 'Alfabet', una carpeta per cada una de les lletres de l'alfabet en majuscules. AJUDA: consulta la taula de codi ASCII, utilitza un for i in CASTING de enter a char. */
		
		/* mostra per pantalla el contingut de la carpeta Alfabet*/
		
		
		
	} // Del Main()
	
} // De la Classe		