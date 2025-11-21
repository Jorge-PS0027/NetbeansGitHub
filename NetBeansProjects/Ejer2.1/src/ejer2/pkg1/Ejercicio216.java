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
public class Ejercicio216 {

    public static void main(String[] args) {
    int num1, valorAB;
      Scanner sc = new Scanner(System.in);
        System.out.print("Inserte numero: " );
        num1 = sc.nextInt();
        valorAB = (num1 < 0) ? Math.abs(num1) : num1;
            System.out.println(valorAB);
    }
    
    
}
