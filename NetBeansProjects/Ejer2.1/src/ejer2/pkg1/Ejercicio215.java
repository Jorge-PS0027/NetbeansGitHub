/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer2.pkg1;

import java.util.Scanner;

/**
 *
 * @author jorge.pensan
 */
public class Ejercicio215 {

    public static void main(String[] args) {
    double base,altura, area;
       Scanner sc = new Scanner(System.in);
           System.out.print("Inserte base: " );
           base  = sc.nextDouble();
           System.out.print("Inserte altura: " );
           altura = sc.nextDouble();
           if (base > 0 && altura > 0) {
           area = (base * altura) /2.0;
           System.out.println("area = " + area );
           }else{
               System.out.print("Numeros invalidos " );
           }
           }

    }
   
