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
public class ejerci16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("Escriba n:");
        num = scanner.nextInt();

        for (int fila = num; fila >= 1; fila--) {
           
            for (int asteriscos = 1; asteriscos <= fila; asteriscos++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }

        scanner.close();
    }
}