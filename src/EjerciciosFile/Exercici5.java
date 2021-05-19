package EjerciciosFile;

import java.io.File;
import java.io.FileNotFoundException;

public class Exercici5 {
	public static void main(String[] args){

        // Instaciem a la classe FILE amb les rutes relatives a les carpetes que volem esborrar
        File fotografies = new File("Documentos/Fotografias");
        File llibres = new File("Documentos/Libros");
        File documents = new File("Documentos");

        boolean resultat = false;

        try {
            // Esborrem la carpeta 'Fotografias' i tot el seu contingut
        	resultat = esborrarTot(fotografies);
            if (resultat) {
                System.out.println("La carpeta 'Fotografias' ha segut esborrada");
            }

            // Esborrem la carpeta 'Libros' i tot el seu contingut
            resultat = esborrarTot(llibres);
            if (resultat) {
                System.out.println("La carpeta 'Libros' ha segut esborrada");
            }

            // Esborrem la carpeta 'Documentos' i tot el seu contingut
            resultat = esborrarTot(documents);
            if (resultat) {
                System.out.println("La carpeta 'Documentos' ha segut esborrada");
            }

        } 
        
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
        
        finally {
        	System.out.println ("Se ha completado el proceso");
        }
    } // Del main()
	

   /* Crea una funcio anemomenada esborrarTot() que elimine tots els arxius i carpetes d'una ruta,
    * 
    * Si no existeix la ruta mostra una excepcio.
    * Si es un arxiu l'esborrem
    * Si es una carpeta, primer eliminem tots els seus arxius, i despres, esborre la carpeta
    * 
    */
  
	public static boolean esborrarTot (File ruta)throws FileNotFoundException {
		File [] archivos = ruta.listFiles();
		
		//Comprobar si existe
		if (!ruta.exists()) {
			throw new FileNotFoundException("La ruta no existe");
		}
		
		//Si es solo un archivo
		if (ruta.isFile()) {
			ruta.delete();
		}
		
		//Si es un directorio
		if (ruta.isDirectory()) {	
			for (File archivo : archivos) {
					archivo.delete();	
			}
			ruta.delete();
		}
		return true;
}
	


} // de la classe
