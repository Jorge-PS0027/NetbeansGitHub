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
public class Ejer11 {

    public static void main(String[] args) {
    double ManzanasPK, PerasPK, total;
    ManzanasPK = 2.35;
    PerasPK = 1.95;
     int ManzPeso1, ManzPeso2;
     int PerasPeso1, PerasPeso2;
     
     Scanner sc = new Scanner(System.in);
     System.out.print("El peso de las Manzanas del primer semestre fue:" );
     ManzPeso1 = sc.nextInt();
     System.out.print("El peso de las Manzanas del segundo semestre fue:" );
     ManzPeso2 = sc.nextInt();
     System.out.print("El peso de las Peras del primer semestre fue:" );
     PerasPeso1 = sc.nextInt();
     System.out.print("El peso de las Peras del segundo semestre fue:" );
     PerasPeso2 = sc.nextInt();
     total = ManzanasPK * (ManzPeso1 + ManzPeso2) + PerasPK * (PerasPeso1 + PerasPeso2);
     System.out.println("El importe total de los semestres fue: " + total );      
    }
    
}
