/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer2.pkg1;

import java.util.Scanner;

/**
 *
 * @author jorge.pensan
 */
public class Ejerci210Ifs {

    public static void main(String[] args) {
    int nota;
    Scanner sc = new Scanner(System.in);
    System.out.print("Inserte numero: " );
    nota = sc.nextInt();
    if (nota == 1 || nota == 2 || nota == 3 || nota ==0 || nota ==4) {
          System.out.println("Insuficiente: " + nota );    
    } else if (nota == 5) {
         System.out.println("Suficiente: " + nota );
     } else if (nota == 6) {
         System.out.println("Bien: " + nota );
     } else if (nota == 7 || nota == 8) {
         System.out.println("Notable: " + nota );
     } else if (nota == 9 || nota == 10) {
         System.out.println("Sobresaliente: " + nota );      
    }else{
         System.out.println("Error numero invalido: " + nota );
     }
    
    
    
    
    
    
    }
    
}
