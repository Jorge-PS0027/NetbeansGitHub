/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author jorge.pensan
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        boolean par;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        num = sc.nextInt();
        par = (num % 2) == 0;
        System.out.println("El Numero es par? " + par);
    }
    
}
