/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema.pkg4;

import java.util.Scanner;

/**
 *
 * @author jorge.pensan
 */
public class funcionesmenu {
    static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1- suma");
        System.out.println("2- Resta");
        System.out.println("3 - Multiplicacion");
        System.out.println("4 - Division");
        System.out.println("5 - Salir");
        return sc.nextInt();

    }

    static Double calculadora(int opcion) {
        Scanner sc = new Scanner(System.in);
        double resultado = 0;
        if (opcion >= 1 && opcion <= 4) {
            System.out.print("Primer numero: ");
           double num1 = sc.nextDouble();
            System.out.print("Segundo numero: ");
            double num2 = sc.nextDouble();
            resultado = switch (opcion) {
                case 1 ->
                    num1 + num2;
                case 2 ->
                    num1 - num2;
                case 3 ->
                    num1 * num2;
                case 4 ->
                    num1 / num2;
                default -> {
                    yield 0;
                }
            };
        } else if (opcion == 5) {
            System.out.println("Saliendo del programa...");
        } else {
            System.out.println("Opcion invalida");
        }
        return resultado;
    }

    public static void main(String[] args) {
        int opcion = 0;
        while (opcion != 5) { 
            opcion = menu(); 
            double resultado = calculadora(opcion); 
            if (opcion >= 1 && opcion <= 4) {
                System.out.println("Resultado = " + resultado);
            }
        }

    }
}

