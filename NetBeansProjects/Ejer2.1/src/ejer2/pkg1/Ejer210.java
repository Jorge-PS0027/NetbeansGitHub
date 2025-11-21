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
public class Ejer210 {

    public static void main(String[] args) {
    int nota;
    Scanner sc = new Scanner(System.in);
    System.out.print("Inserte numero: " );
    nota = sc.nextInt();
    switch (nota) {
        case 0,1,2,3,4 ->
            System.out.println("Insuficiente: " + nota );    
        case 5 ->
            System.out.println("Suficiente: " + nota );
       case 6 ->
            System.out.println("Bien: " + nota );
       case 7,8 ->
            System.out.println("Notable: " + nota );
       case 9,10 ->
            System.out.println("Sobresaliente: " + nota );
       default ->
            System.out.println("Error numero invalido: " + nota );
           
            
    }
        




    
    }
    
}
