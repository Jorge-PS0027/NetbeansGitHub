/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema.pkg4;

import java.util.Scanner;

public class ejercici4o3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double altura, radio;

        System.out.print("Dime el radio: ");
        radio = sc.nextDouble();

        System.out.print("Dime la altura: ");
        altura = sc.nextDouble();

        System.out.println("Elige una opción:");
        System.out.println("1. Area");
        System.out.println("2. Volumen");
        opcion = sc.nextInt();

        volumenArea(opcion, radio, altura);
    }

    static void volumenArea(int op, double r, double a) {
        if (op == 1) {
            double area = 2 * Math.PI * r * (a + r);
            System.out.println("El área del cilindro es: " + area);
        } else if (op == 2) {
            // sustituimos Math.pow(r,2) por potencia(r, 2)
            double volumen = Math.PI * potencia(r, 2) * a;
            System.out.println("El volumen del cilindro es: " + volumen);
        } else {
            System.out.println("Opción no válida. Debe ser 1 (área) o 2 (volumen).");
        }
    }

    /**
     * Calcula base^exponente sin usar Math.pow.
     */
    static double potencia(double base, int exponente) {
        int resultado = 0;
        if (exponente == 0) {
            return 1.0;
        }

        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }

        return resultado;
    }
}