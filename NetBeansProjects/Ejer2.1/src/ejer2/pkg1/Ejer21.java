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
public class Ejer21 {

    public static void main(String[] args) {
    int num1;
    Scanner sc = new Scanner(System.in);
    System.out.print("Inserte numero: " );
    num1 = sc.nextInt();
    if (num1%2 == 0) {
        System.out.println("El numero: " + num1 + " es Par");
    } else {
         System.out.println("El numero: " + num1 + " es Impar");
    }
    }
    
}
