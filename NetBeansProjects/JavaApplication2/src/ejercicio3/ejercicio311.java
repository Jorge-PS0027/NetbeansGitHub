/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

public class ejercicio311 {
  public static void main(String[] args) {
        int numero;
        double facto;
        facto = 1;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero:  ");
        numero = sc.nextInt();
        
        for (int cont = numero; cont > 0; cont--) {
            facto = facto * cont;
        }
        System.out.println("El factorial de  " + numero + " = " + facto );
    }  
}
