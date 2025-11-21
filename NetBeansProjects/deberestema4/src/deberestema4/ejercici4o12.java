/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deberestema4;

import java.util.Scanner;

public class ejercici4o12 {
     /** Funcion que calcula la distancia usando la formula**/
    static double distancia(double x1, double x2, double y1, double y2) {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);              

        System.out.println("dime los puntos X e Y");
        System.out.println("X Primer valor");
        double x1 = sc.nextInt();
         System.out.println("Y Primer valor");
        double y1 = sc.nextInt();
        System.out.println("X Segundo valor");
        double x2 = sc.nextInt();
        System.out.println("Y Segundo valor");
        double y2 = sc.nextInt();
        System.out.println("La distancia es " + distancia(x1,x2,y1,y2));
    }
}
