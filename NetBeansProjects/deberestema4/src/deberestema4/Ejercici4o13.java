/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deberestema4;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercici4o13 {
     /** Funcion que cuenta la cantidad de pares que se quieren representar con un bucle representa hasta llegar a n pares**/
    static void pares(int num) {
       int cont = 0;
       int i = 0;
       while (cont < num) {
            if ( i % 2 == 0) {
                System.out.println("Numero par = " + i);
                cont++;
            }
            i ++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos números pares quieres ver?: ");
        int n = sc.nextInt();
        pares(n);
    }
}
