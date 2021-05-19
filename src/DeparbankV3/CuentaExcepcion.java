package DeparbankV3;

import java.util.*;

public class CuentaExcepcion extends Exception {

private float cantidad;
	
	private String iban;
	
	//Constructor
	public CuentaExcepcion (String iban){
		
		this.iban=iban;
		
	}
	
	//To string
		public String aviso () {
			String avisar = "El iban " + iban + " no es correcto, debe empezar por ES seguido de 22 digitos";
			return avisar;
		}
	
	
}
