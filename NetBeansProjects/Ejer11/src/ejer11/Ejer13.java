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
public class Ejer13 {

    public static void main(String[] args) {
    int primer, segundo, tercer;
    double academico;
     
     Scanner sc = new Scanner(System.in);
     System.out.print("La nota del primer trimestre fue: " );
     primer = sc.nextInt();
     System.out.print("La nota del segundo trimestre fue: " );
     segundo = sc.nextInt();
     System.out.print("La nota del tercer trimestre fue: " );
     tercer = sc.nextInt();
     academico = (primer + segundo+ tercer)/3.0;
     int media = (int) academico;
      System.out.println("La nota media a sido: " + media );
      System.out.println("La nota academica a sido: " + academico );
    }
    
}
