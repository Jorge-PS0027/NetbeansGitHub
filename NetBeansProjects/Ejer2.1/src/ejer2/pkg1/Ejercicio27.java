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
public class Ejercicio27 {

    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   
        System.out.print("Introduce el primer numero: ");
        int num1 = sc.nextInt();
        
        System.out.print("Introduce el segundo numero: ");
        int num2 = sc.nextInt();
        
        System.out.print("Introduce el tercer numero: ");
        int num3 = sc.nextInt();
        
        if (num1 >= num2 && num1 >= num3) {
                    System.out.print(num1 + " > ");
                    if (num2 >= num3) {
                        System.out.println(num2 + " > " + num3);
                    } else {
                        System.out.println(num3 + " > " + num2);
                    }
        } else {
                    if (num2 >= num1 && num2 >= num3) {
                        System.out.print(num2 + " > ");
                        if (num1 >= num3) {
                            System.out.println(num1 + " > " + num3);
                        } else {
                            System.out.println(num3 + " > " + num1);
                        }
                    } else {
                        System.out.print(num3 + " > ");
                        if (num1 >= num2) {
                            System.out.println(num1 + " > " + num2);
                        } else {
                            System.out.println(num2 + " > " + num1);
                }
            }
        }
    }
} 
