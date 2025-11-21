/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deberestema4;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Deberestema4 {

  static double potencia(double base, int exponente) {
        double resultado = 1;
        int exp = exponente;

        // Si el exponente es negativo, lo hacemos positivo manualmente
        if (exponente < 0) {
            exp = -exponente;
        }

        for (int i = 0; i < exp; i++) {
            resultado *= base;
        }

        // Si el exponente era negativo, invertimos el resultado
        if (exponente < 0) {
            resultado = 1 / resultado;
        }

        return resultado;
    }

    // Función que calcula área o volumen del cilindro
    static void calcularCilindro(int opcion, double radio, double altura) {
        double pi = 3.1416;
        double resultado;

        if (opcion == 1) {
            // Área del cilindro: 2πr(h + r)
            resultado = 2 * pi * radio * (altura + radio);
            System.out.println("El área del cilindro es: " + resultado);
        } else if (opcion == 2) {
            // Volumen del cilindro: πr²h
            resultado = pi * potencia(radio, 2) * altura;
            System.out.println("El volumen del cilindro es: " + resultado);
        } else {
            System.out.println("Opción no válida. Usa 1 para área o 2 para volumen.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Elige una opción:");
        System.out.println("1. Calcular área del cilindro");
        System.out.println("2. Calcular volumen del cilindro");
        int opcion = sc.nextInt();

        System.out.print("Introduce el radio del cilindro: ");
        double radio = sc.nextDouble();

        System.out.print("Introduce la altura del cilindro: ");
        double altura = sc.nextDouble();

        calcularCilindro(opcion, radio, altura);
    }
}
    
    

