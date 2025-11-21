/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer11;

import java.util.Scanner;

/**
 *
 * @author jorge.pensan
 */
public class Ejer14 {

    public static void main(String[] args) {
    double num1;
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Inserte numero a redondear: " );
    num1 = sc.nextDouble();
    num1 = num1 + 0.5;
    int redondeado = (int) num1;
    System.out.println("El numero rendondeado es: " + redondeado);
    }
    
}
