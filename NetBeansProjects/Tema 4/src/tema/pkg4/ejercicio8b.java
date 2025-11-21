package tema.pkg4;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jorge.pensan
 */
public class ejercicio8b {

    static int numerosimpares(int num1) {
        int suma = 0;
        int cont = 1;
        while (cont <= num1) {

            if (cont % 2 != 0) {
                suma = suma + cont;
            }
            cont++;
        }

        return suma;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entero;
        System.out.print("Numero entero positivo:  ");
        entero = sc.nextInt();
        while (entero >= 0) {
            System.out.println("Suma Impares: " + numerosimpares(entero));
            System.out.print("Numero entero positivo:  ");
            entero = sc.nextInt();
        }
        System.out.print("Programa finalizado ");
    }
}
