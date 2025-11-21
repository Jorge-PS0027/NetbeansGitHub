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
public class Ejer26 {
    public static void main(String[] args) {
      int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte numero: " );
        num1 = sc.nextInt();
        System.out.print("Inserte segundo numero: " );
        num2 = sc.nextInt();
        if (num1 == num2) {
            System.out.println("El numero: " + num1 + " y " + num2 + " Son iguales");
        } else {
            if (num1 > num2) {
                  System.out.println("El numero: " + num1 + " es mayor que " + num2);
            }else{
                  System.out.println("El numero: " + num2 + " es mayor que " + num1); 
            }
         }
    }
    
}
