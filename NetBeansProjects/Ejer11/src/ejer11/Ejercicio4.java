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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int actual;
    int nacimiento;
    int edad;
    Scanner sc = new Scanner(System.in);
    System.out.print("Anio de Nacimiento: ");
    nacimiento = sc.nextInt();
    System.out.print("Anio actual: ");
    actual = sc.nextInt();
    edad = actual - nacimiento;
    System.out.print("tu edad es: " + edad + " anios");
    }
    
}
