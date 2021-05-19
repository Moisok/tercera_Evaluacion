package Palindromo_pantalla;

import java.util.Scanner;

public class palindromo2 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String frase,frase2="2aaa";
	        boolean palindromo = true;

		    System.out.print("Introduce una frase: ");

	        frase = sc.nextLine();
	        frase = frase.replace(" ", "");
	        frase = frase.toUpperCase();
	        int longitud = frase.length();

	        for (int i = 0; i < longitud && palindromo; i++) {
	            // comparamos el car�cter de la posici�n i con el de la �ltima posici�n - i
	        	frase2=frase2+frase.charAt(i);
	            if (frase.charAt(i) != frase.charAt((longitud - 1) - i)) {
	            	frase=frase2+frase2.charAt(i);
	                palindromo = false;
	            }
	        }
	        System.out.println(frase2);
	        if (palindromo) {
	            System.out.println(frase2 + "Si es un palindromo");
	        } else {
	            System.out.println("La frase no es palindromo");
	        }
	    }

	}
