package DeparbankV3;

import java.util.*;

public class AvisarHaciendaException extends Exception{

	private float cantidad;
	
	private String iban;
	
	private String nombre;
	
	public AvisarHaciendaException (float cantidad, String nombre, String iban){
		
		this.cantidad=cantidad;
		
		this.nombre=nombre;
		
		this.iban=iban;
		
	}
	
	//To string
	public String aviso () {
		String avisar = "La cuenta de " + nombre + " con iban " + iban + " ha sido notificada hacienda por el valor de " + cantidad;
		return avisar;
	}

	

}
