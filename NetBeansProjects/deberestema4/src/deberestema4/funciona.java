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
public class funciona {
 

    // Función que muestra el menú y devuelve la opción
    static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nMenu:");
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicacion");
        System.out.println("4 - Division");
        System.out.println("5 - Salir");
        System.out.print("Elige una opcion: ");
        return sc.nextInt();
    }

    // Función que realiza la operación
    static double calculadora(int opcion) {
        if (opcion >= 1 && opcion <= 4) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Primer numero: ");
            double num1 = sc.nextDouble();
            System.out.print("Segundo numero: ");
            double num2 = sc.nextDouble();

            return switch (opcion) {
                case 1 ->
                    num1 + num2;
                    
                case 2 ->
                    num1 - num2;
                    
                case 3 -> 
                    num1 * num2;
                    
                case 4 -> 
                    num1 / num2;
                    
                default -> 0;
            };
        }
        return 0; 
    }

    public static void main(String[] args) {
        int opcion = 0;

       
        while (opcion != 5) {
            opcion = menu(); 

            if (opcion >= 1 && opcion <= 4) {
                double resultado = calculadora(opcion);
                System.out.println("Resultado = " + resultado);
            } else if (opcion == 5) {
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("Opcion inválida, intenta de nuevo.");
            }
        }
    }
}

