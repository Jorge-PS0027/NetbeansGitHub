/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema.pkg4;

import static java.lang.Thread.yield;
import java.util.Scanner;

/**
 *
 * @author jorge.pensan
 */
public class ejercici4o8 {

    static Double calculadora(double num1, double num2, int opcion) {
        double resultado;
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
                System.out.println("Operacion invalida");
               yield 0;
            }
        };
        return resultado;
    }

    public static void main(String[] args) {
        double num1, num2;
        int opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1- suma");
        System.out.println("2- Resta");
        System.out.println("3 - Multiplicacion");
        System.out.println("4 - Division");
        opcion = sc.nextInt();
        System.out.println("Dime un numero");
        num1 = sc.nextDouble();
        System.out.println("Dime otro numero");
        num2 = sc.nextDouble();
        System.out.println("Resultado= " + calculadora(num1, num2, opcion));
    }
}
