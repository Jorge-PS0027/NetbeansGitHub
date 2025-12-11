/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package purbas;

import java.util.Scanner;

public class ejercicio6_9 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String cadena ="";
    String palabra="";
    do {
        System.out.println("Dime una palabra: Fin para salir");
        palabra = sc.next();
        cadena = cadena + " " + palabra;
        
    } while (!palabra.equalsIgnoreCase("fin"));
    cadena = cadena.substring(1);
        System.out.println(cadena);
}
}
