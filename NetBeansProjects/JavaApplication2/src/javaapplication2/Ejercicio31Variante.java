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
public class Ejercicio31Variante {

    public static void main(String[] args) {
        boolean par, pos;
        int num;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("(Salir con 0) Inserte numero:  " );
            num = sc.nextInt();
            par = (num%2==0);
            pos = (num > 0);
            System.out.println("Es par?  " + par );
            System.out.println("Es positivo?  " + pos );
            System.out.println("Cuadrado:  " + (num * num) );
      
        } while (num != 0);
        System.out.println("Programa terminado " );
    }
    
}
