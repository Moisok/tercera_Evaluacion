package DeparbankV3;

import java.util.*;

public class Cuenta_Bancaria {
	
	static Scanner teclado = new Scanner (System.in);
	
	private  String iban;
	
	private  String titular;
	
	private float saldo;
	
	private int movimiento;
	
	//Creo el arraylist
	ArrayList movimientos = new ArrayList();

	private int nMovimientos = 0;
	
	private boolean validarIBAN;
	
	public Cuenta_Bancaria (String iban, String titular) {
		
		this.iban=iban;
		
		this.titular=titular;
	}
	
	/*Construccion de getters*/
	public String getIban() {
		return iban;
	}

	public String getTitular() {
		return titular;
	}
	
	public float getSaldo() {
		return saldo;
	}

	/*Funcion para los ingresos*/
	public void ingresos (float cantidad) throws Exception { 
		this.saldo = this.saldo + cantidad;
		this.movimiento++;
		movimientos.add(cantidad);
		if (cantidad >= 3000) {
			System.out.println (" ");
			throw new AvisarHaciendaException(cantidad,getTitular(),getIban());
			}
		
	}
	
	
	/*Funcion para retirar dinero*/
	public void retirada (float cantidad) throws AvisarHaciendaException {
		
		if ((this.saldo - cantidad) < -50) {
			System.err.println ("No hay suficiente Saldo");
		}
		
		else {
			this.saldo = this.saldo - cantidad;
			this.movimiento++;
			movimientos.add(cantidad);
			if (cantidad >= 3000) {
				System.out.println (" ");
				throw new AvisarHaciendaException(cantidad,getTitular(),getIban());
				}
		}

	}

	/*Funcion para ver los datos*/
	
	public void datos() {
		System.out.println (" ");
		System.out.println ("El titular de la cuenta es: " + this.titular);
		System.out.println ("Su numero de iban es: " + this.iban);
		System.out.println ("Su saldo disponible es de " + this.saldo);
		System.out.println (" ");
	}
	
	/*Funcion para ver los movimientos*/
	
	public void movimientos () {
		
		System.out.println (" ");
		
		for (Object object : movimientos) {
			System.out.println ("Movimiento:" + nMovimientos + " Cantidad:"+ object);
			nMovimientos++;
		}
		
		
	}
	/*Funcion para validar el IBAN*/
	public boolean validamiento () throws Exception {
		validarIBAN = this.validarIBAN;
		if (iban.matches("^[A-Z]{2}\\d{22}")) {
			validarIBAN = true;
		}
		else {
			validarIBAN = false;
			throw new CuentaExcepcion(getIban());
		}
		
		return validarIBAN;
		
	}
}
	
	