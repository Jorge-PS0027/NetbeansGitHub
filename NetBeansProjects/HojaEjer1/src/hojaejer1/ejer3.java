/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hojaejer1;

import java.util.Scanner;

public class ejer3 {
    public static void main(String[] args) {
        int entero, suma, cont;
        suma = 0;
        cont = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero entero positivo:  " );
        entero = sc.nextInt();
      while (entero >= 0) {
            while (cont < entero) {
                
                if (cont%2!=0){
                suma = suma + cont;
                }

        System.out.println(cont + " ");    
        cont++;
        }
    System.out.println("Suma Impares: "+ suma );
    cont = 1;
    suma = 0;
    System.out.print("Numero entero positivo:  " );
    entero = sc.nextInt();
        }
      System.out.print("Programa finalizado " );
    }
}
