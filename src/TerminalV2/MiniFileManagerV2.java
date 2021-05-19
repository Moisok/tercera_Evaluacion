package TerminalV2;
import java.io.File;
import java.util.Arrays;
import java.util.ArrayList;

public class MiniFileManagerV2 {
	//Variables
	//private String main_root = "/home/moiseg";
	private File actual;
	
	//Constructor
	public MiniFileManagerV2 (){
	actual = new File (System.getProperty("user.dir"));		
	}
	
	//Clase informacion
	public void Informacion () {
		System.out.println(
				"- pwd: Mostrar carpeta actual\n"
				+ "- cd <DIR>: Cambiar carpeta actual\n"
				+ "- ls: Muestra el listado de la carpeta actual\n"
				+ "- ll: Muestra el listado de la carpeta actual con la ultima modificacion\n"
				+ "- mkdir <DIR>: Crea el directorio ‘DIR’ en la carpeta actual.\n"
				+ "- rm  <FILE>: Borra ‘FILE’. Si es una carpeta, se borrara primero los archivos, luego las carpetas y se informara\n"
				+ "- mv <FILE1> <FILE2>: Mueve o cambia de nombre ‘FILE1’ a ‘FILE2’.\n"
				+ "- help: Muestra los comandos.\n"
				+ "- plusinfo: informacion sobre mas opciones.\n"
				+ "- exit: Acaba el programa.\n");
	}
	
	//Mostrar carpeta actual
	public void carpeta () {
		
		System.out.println (actual);
	}
	
	//Mostrar listado
	public void muestralistado () {
		File [] archivs = actual.listFiles();
		for (File file : archivs) {
			if (file.isDirectory()) {
				System.out.println(file.getName() + "[*]");
			}
			if (file.isFile()) {
				System.out.println(file.getName() + "[A]");
			}
		}
	}
	
	
	//Mostrar listado con a ultima fecha de modificacion y el tamaño
	public void muestralistadodatos () {
		File archivos [] = actual.listFiles();
		for (File file : archivos) {
			if (file.isDirectory()) {
				System.out.println(file.getName() + "[*]" + file.lastModified() + " " + file.getTotalSpace());
			}
			if (file.isFile()) {
				System.out.println(file.getName() + "[A] " + file.lastModified() + " " + file.getTotalSpace()+"KB");
			}
		}
	}
	
	//Crear Directorio nuevo
	public boolean creadirectorio (String directorio)throws Exception {
		File crear = new File (actual + "/" + directorio); 
		if (!actual.exists()) {
			throw new Exception("El directorio o carpeta no existe");
		}
		else
		System.out.println ("Se ha creado la carpeta: " + crear.getName());
		return crear.mkdir();
	}
	
	//Borrar el directorio
	public boolean borrardirectorio (String directorio) throws Exception {
		File borrar = new File (actual + "/" + directorio); 
		if (!actual.exists()) {
			throw new Exception("El directorio o carpeta no existe");
		}
		else {
		if (borrar.exists()) {
			System.out.println ("Se ha eliminado la carpeta: " + borrar.getName());
			
		}
		else {
			System.out.println ("El directorio no existe, no se puede borrar");
		}	
		}
		return borrar.delete();
	}
	
	//Mover carpetas de directorio
	public void movercarpeta (String dir1, String dir2) throws Exception {
		File directorioactual = new File (dir1);
		File directorioamover = new File (dir2);
		if (!directorioamover.exists()) {
			throw new Exception("El directorio o carpeta no existe");
		}
		else
		directorioactual.renameTo(directorioamover);
		System.out.println ("Se ha movido la carpeta " + directorioactual + " a " + directorioamover);
	}
	
	//Moverse entre directorios
	public void moverse (String dir1)throws Exception {
		File nuevo = new File (dir1);
		if (!nuevo.exists()) {
			throw new Exception("El directorio o carpeta no existe");
		}
		else {
		if (dir1.equals("..")) {
			actual.getParent();
		}
		System.out.println (dir1);
		actual = nuevo;
		}
	}
}
