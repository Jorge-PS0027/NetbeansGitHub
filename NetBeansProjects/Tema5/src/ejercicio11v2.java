
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jorge.pensan
 */
public class ejercicio11v2 {
     static int[] MaxYMin(int t[]){
         int mayor = t[0], menor = t[0];
        for (int x = 0; x < t.length; x++) {
            if (t[x] > mayor) {
                mayor = t[x];
            } else if (t[x] < menor) {
                menor = t[x];
            }

        }
        int resultado[] = {mayor, menor};

        return resultado;
    }

      public static void main(String[] args) {
          int arrayenteros[] = new int[15];
          for (int i=0; i<arrayenteros.length; i++){
              arrayenteros[i] =  (int)(Math.random() * 100) + 1;
          }
          Arrays.sort(arrayenteros);
            System.out.println("***DESGLOSE DE VALORES DE LA TABLA***");
          for (int valor : arrayenteros){
              
               System.out.println("valores tabla" + valor);
          }
         int resultado[] =  MaxYMin(arrayenteros);
          System.out.println(" ");
          System.out.println("***NUMEROS MAYOR Y MENOR***");
          System.out.println("El numero mayor de la tabla es: " + resultado[0]);
           System.out.println("El numero menor de la tabla es: " + resultado[1]);
      }
}

