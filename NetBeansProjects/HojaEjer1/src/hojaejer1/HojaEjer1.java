/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hojaejer1;

import java.util.Scanner;

/**
 *
 * @author jorge.pensan
 */
public class HojaEjer1 {

    public static void main(String[] args) {
        int edad,min,max;
 
        Scanner sc = new Scanner(System.in);
        System.out.print("(Salir con -1) Inserte edad:  " );
        edad = sc.nextInt();
        min = edad;
        max = edad;
        while (edad != -1) {
            if (edad < 0 || edad > 150) {
            System.out.println("Numero invalido" );
            } else {
            if (edad > max) {
                max = edad;
            } else {
               if (edad < min) {
                   min = edad;
               }
            }
            }
        System.out.print("(Salir con -1) Inserte edad:  " );
        edad = sc.nextInt();
        } 
        System.out.println("Programa terminado " );
        System.out.println("edad maxima " + max + " edad minima " + min);
    }
    
}
