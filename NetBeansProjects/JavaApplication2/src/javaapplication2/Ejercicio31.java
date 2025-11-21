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
public class Ejercicio31 {

    public static void main(String[] args) {
        boolean par, pos;
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("(Salir con 0) Inserte numero:  " );
        num = sc.nextInt();
        while (num != 0) {
            par = (num%2==0);
            pos = (num > 0);
            System.out.println("Es par?  " + par );
            System.out.println("Es positivo?  " + pos );
            System.out.println("Cuadrado:  " + (num * num) );
            System.out.print("(Salir con 0) Inserte numero: " );
            num = sc.nextInt();
        }
        System.out.println("Programa terminado " );
    }
}
