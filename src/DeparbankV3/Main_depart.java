/*Ejercicio del cajer creado por moises Sepulveda segarra*/
/*Este ejercicio se basa en un cajero automatico que permite realizar hasta 100 operaciones de
 * ingreso y de extraccion, he tenido que poner dos menus ya que en la primera version cree el 
 * menu en la clase, en el primer menu tendra dos opciones la primera insertar una cuenta creada
 * y la segunda crear una cuenta nueva, hay que seguir las instrucciones para que el cajero te
 * deje crear la cuenta
 */

package DeparbankV3;

import java.util.*;

public class Main_depart {

	/*Funcion Menu de operaciones*/
	
	public static void menu (Cuenta_Bancaria cuenta) throws Exception {
		
		int opcion = 0;
		String continuar;
		int ingreso;
		int retirada;
		float cantidad = 0;;
		
		Scanner teclado = new Scanner (System.in);
		
		
		while (opcion < 7) {
		System.out.println ("Elige opcion");
		System.out.println ("Introduce 1 <- Para consultar los datos");
		System.out.println ("Introduce 2 <- Mostrar titular");
		System.out.println ("Introduce 3 <- Mostrar saldo");
		System.out.println ("Introduce 4 <- Realizar ingreso");
		System.out.println ("Introduce 5 <- Realizar retirada");
		System.out.println ("Introduce 6 <- Consultar Movimientos");
		System.out.println ("Introduce 7 <- Retirar tarjeta y salir");
		System.out.print ("SELECCION: ");
		
		opcion = teclado.nextInt();
		
		if (opcion > 7) {
			opcion = 0;
			System.out.println (" ");
			System.err.println ("La opcion no es valida");
		}
	
		switch (opcion) {
		
		case 1:
			
			opcion = 0;
			cuenta.datos();
			System.out.println ("Introduzca 'c' para continuar");
			System.out.print ("SELECCION: ");
			continuar = teclado.next();
			break;
			
		case 2:	
			
			opcion = 0;
			System.out.println (" ");
			System.out.println ("El titular de la tarjeta es: " + cuenta.getTitular() );
			System.out.println (" ");
			System.out.println ("Introduzca 'c' para continuar");
			System.out.print ("SELECCION: ");
			continuar = teclado.next();
			break;
			
		case 3:	
			
			opcion = 0;
			System.out.println (" ");
			System.out.println ("Su saldo disponible es de " + cuenta.getSaldo());
			System.out.println (" ");
			System.out.println ("Introduzca 'c' para continuar");
			System.out.print ("SELECCION: ");
			continuar = teclado.next();
			break;
			
		case 4:	
			
			opcion = 0;
			System.out.println (" ");
			System.out.println ("Saldo disponible: " + cuenta.getSaldo());
			System.out.println ("Introduce cantidad a ingresar: " );
			System.out.print ("INGRESE: ");
			
			try {
			cantidad = teclado.nextFloat();
			cuenta.ingresos(cantidad);
			System.out.println ("Tienes un saldo actual de: " + cuenta.getSaldo());
			System.out.println (" ");
			System.out.println ("Introduzca 'c' para continuar");
			System.out.println (" ");
			System.out.println ("SELECCION: ");
			continuar = teclado.next();
			}
			catch(AvisarHaciendaException e) {
				System.err.println(e.aviso());
			}
			break;
			
			
		case 5:	
			
			opcion = 0;
			System.out.println (" ");
			System.out.println ("Saldo disponible: " + cuenta.getSaldo());
			System.out.println ("Introduce cantidad a retirar: " );
			System.out.print ("RETIRE: ");
			try {
			cantidad = teclado.nextFloat();
			cuenta.retirada(cantidad);
			System.out.println ("Tienes un saldo actual de: " + cuenta.getSaldo());
			System.out.println (" ");
			System.out.println ("Introduzca 'c' para continuar");
			System.out.println (" ");
			System.out.print ("SELECCION: ");
			continuar = teclado.next();
			}
			catch(AvisarHaciendaException o) {
				System.err.println(o.aviso());
			}
			break;
			
		case 6:	
			opcion = 0;
			System.out.println (" ");
			cuenta.movimientos();
			System.out.println ("Saldo disponible: " + cuenta.getSaldo());
			System.out.println (" ");
			System.out.println ("Introduzca 'c' para continuar");
			System.out.print ("SELECCION: ");
			continuar = teclado.next();
			break;
			
		case 7:	
			System.out.println (" ");
			System.out.println ("Que tenga usted un buen dia y gracias por nuestros servicios");
			break;
	  }	
	}
  }
	
	
	/***ESTO DE AQUI ES LA FUNCION PRINCIPAL DEL MAIN
	 * @throws Exception ***/
	
	public static void main (String [] args) throws Exception{
		
		
		Scanner teclado = new Scanner (System.in);
		
		int opcion;
		String nombre;
		int saldo;
		String iban;
		boolean continuar = true;
		
		/*Menu principal del cajero*/
		while (continuar = true) {
		System.out.println ("Bienvenido al cajero de DeparBank");
		System.out.println ("A continuacion tendra que elegir");
		System.out.println (" ");
		System.out.println ("Opcion1: Ingresar tarjeta existente");
		System.out.println ("Opcion2: Crear nueva cuenta bancaria");
		System.out.println ("Opcion3: Salir");
		System.out.print ("SELECCION: ");
		opcion = teclado.nextInt();
		
		if (opcion > 3) {
			System.err.println ("Opcion no Valida");
		}
	
		switch (opcion) {
		
		case 1:
			Cuenta_Bancaria cuenta1 = new Cuenta_Bancaria ("ES2158565877455211236982","Manolo");
			menu(cuenta1);
			continuar = false;
			
			break;
			
		case 2:
			try {
			System.out.println ("Introduce Nombre de titular: ");
			System.out.print ("INTRODUCE NOMBRE: ");
			nombre = teclado.next();
			System.out.println ("Introduce el numero de iban");
			System.out.println ("recuerda que debe empezar por ES seguido de 22 digitos");
			System.out.println (" ");
			System.out.print ("INTRODUCE IBAN: ");
			iban = teclado.next();
			Cuenta_Bancaria cuenta2 = new Cuenta_Bancaria (iban,nombre);
			cuenta2.validamiento();
			if (cuenta2.validamiento()) {
			menu(cuenta2);
			continuar = false;
			}
			}
			catch(CuentaExcepcion i) {
				System.err.println(i.aviso());
			}
			break;
		case 3:
			System.out.println ("Que tenga usted un buen dia y gracias por nuestros servicios");
			break;
		}
		}
	}
}
	

