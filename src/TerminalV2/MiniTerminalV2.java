package TerminalV2;
//Importamos herramientas

import java.util.Scanner;

public class MiniTerminalV2 {

	public static void main(String[] args) {
		//variables
		String comando;
		String [] vectorcomando;
		//Construimos teclado
		Scanner teclado = new Scanner (System.in);
		//Constructor
		MiniFileManagerV2 comandos = new MiniFileManagerV2();
		Nuevos newoptions = new Nuevos();
		//Menu principal
		try {
		do {
			System.out.print ("moiseg@client:~$ ");
			vectorcomando = (teclado.nextLine()).split(" ");
			comando = vectorcomando [0];
			//Opciones
			switch (comando) {
			case "pwd":
				comandos.carpeta();
				break;
				
			case "cd":
				//Funcion para moverse entre directorios
				comandos.moverse(vectorcomando [1]);
				break;
				
			case "ls":
				comandos.muestralistado();
				break;
				
			case "ll":
				comandos.muestralistadodatos();
				break;
				
			case "mkdir":
				comandos.creadirectorio(vectorcomando[1]);
				break;
				
			case "rm":
				comandos.borrardirectorio(vectorcomando[1]);
				break;
				
			case "mv":
				comandos.movercarpeta(vectorcomando[1], vectorcomando[2]);
				break;

			case "help":
				comandos.Informacion();
				break;
				
			case "plusinfo":
				newoptions.infomenu();
				//comandos.Informacion();
				break;
				
			case "fibo":
				newoptions.fibonacci(vectorcomando [1], vectorcomando[2]);
				break;
			
			case "palin":
				newoptions.palindromo(vectorcomando [1], vectorcomando[2]);
				break;
				
			case "numbers":
				newoptions.numbers(vectorcomando [1], vectorcomando[2], vectorcomando[3]);
				break;
				
			case "media":
				newoptions.media();
				break;
			
			case "archives":
				newoptions.ordenar_archivos();
				break;
				
			case "exit":
				comando = "exit";
				break;
			}
		}while (comando != "exit");
	}
		
		catch (Exception e) {
			System.err.println("Error" + e);
		}
		
		
		finally {
		System.out.println ("Saliendo de terminal");
		}
	}

}
