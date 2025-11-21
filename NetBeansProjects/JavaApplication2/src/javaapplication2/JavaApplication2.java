/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author jorge.pensan
 */
public class JavaApplication2 {

 
    public static void main(String[] args) {
    int edad;
    System.out.print("Escribe tu edad: ");
    Scanner sc = new Scanner(System.in);
    edad = sc.nextInt();
    edad ++;
    System.out.println("Dentro de un anio tendras: " + edad + " anios" );
    }
    
}
