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
public class Ejercicio29 {

    public static void main(String[] args) {
       int num1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte numero entre 1 y 99999: " );
        num1 = sc.nextInt();
        if (num1 <= 99999 && num1 >= 1) {
            if (num1 < 10){
                    System.out.println("El numero: " + num1 + " Tiene 1 cifra");
            }else if (num1 < 100) {
                    System.out.println("El numero: " + num1 + " Tiene 2 cifras");
            }else if (num1 < 1000) {
                    System.out.println("El numero: " + num1 + " Tiene 3 cifras");
            }else if (num1 < 10000) {
                    System.out.println("El numero: " + num1 + " Tiene 4 cifras");
            }else if (num1 < 100000) {
                    System.out.println("El numero: " + num1 + " Tiene 5 cifras");
            }
       } else {
          System.out.println("El numero: " + num1 + " Es invalido");
         }
    }
    
}
