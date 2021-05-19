package Sucesion_de_fibonacci;

//Lectura de un fichero de texto con Scanner
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Pruebas {

  public static void main(String[] args) {

      File f = new File("/home/moiseg/Documentos/Textonumeros/datos.txt");                                                             
      int numero, suma = 0, cont = 0;
      StringTokenizer st;
      Scanner entrada = null;
      String cadena;

      try {
          entrada = new Scanner(f);
          while (entrada.hasNext()) {
              cadena = entrada.nextLine();
              st = new StringTokenizer(cadena, " ,");
              while (st.hasMoreTokens()) {
                  numero = Integer.parseInt(st.nextToken());                                                    
                  System.out.println(numero);
                  suma = suma + numero;
                  cont++;
              }
          }
          System.out.println("Número leídos: " + cont);                                                         
          System.out.println("Suma " + suma);
      } catch (FileNotFoundException e) {
          System.out.println(e.getMessage());
      } finally {
          entrada.close();
      }
  }
}


