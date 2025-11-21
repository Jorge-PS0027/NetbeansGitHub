/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hojaejer1;

import java.util.Scanner;

/**
 *
 * @author jorge.pensan
 */
public class ejer11 {

    public static void main(String[] args) {
           
        System.out.println("Escriba n:");
      int n = new Scanner(System.in).nextInt();

      

      for (int fila = 1; fila <= n; fila++) 

      {

         for (int espacios = 0; espacios < n-fila; espacios++) System.out.print(" ");

         
        for (int asteriscos = 1; asteriscos <= fila; asteriscos++) System.out.print("* ");

        

         System.out.println("");

      }
    }
}
