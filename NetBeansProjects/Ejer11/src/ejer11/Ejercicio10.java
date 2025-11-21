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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean lluvia, biblio, tareas, salir;
        Scanner sc = new Scanner(System.in);
        System.out.println("mira por la ventana esta lloviendo? (true/false) ");
        lluvia = sc.nextBoolean();
        System.out.println("Terminaste las tareas? (true/false) ");
        tareas = sc.nextBoolean();
        System.out.println("Tienes que ir a la biblioteca? (true/false) ");
        biblio = sc.nextBoolean();
        salir = tareas && !lluvia || biblio;
        System.out.println("Hoy sales? " + salir);
        
    }
    
}
