/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jorge.pensan
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class menulargo {

    /**
     * *Funcion que devuelve el menu y pide la opcion
     */
    static int menu() {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Longitud de la circunferencia");
        System.out.println("2. Área del círculo");
        System.out.println("3. Área de la esfera");
        System.out.println("4. Área del cilindro");
        System.out.println("5. Volumen de la esfera");
        System.out.println("6. Volumen del cilindro");
        System.out.println("7. Nuevo radio");
        System.out.println("8 - Salir");
        try {
            System.out.print("Dime la opcion: ");
            opcion = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: la opcion debe ser un número válido.");
            opcion = 0;
        }
        return opcion;
    }

    static double radio() {
        Scanner sc = new Scanner(System.in);
        double r = 0;
        boolean error = false;
        while (!error) {
            try {
                System.out.print("Dime el radio: ");
                r = sc.nextDouble();
                error = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: el radio debe ser un número válido.");
                sc.nextLine();
            }
        }
        return r;
    }

    /**
     * *Calcula la longitud del circunferencia
     */
    static Double longitudCir(double r) {
        return 2 * Math.PI * r;
    }

    /**
     * *Calcula la longitud del circulo
     */
    static double areaCirculo(double r) {
        return Math.PI * Math.pow(r, 2);

    }

    /**
     * *Calcula el area de la esfera
     */
    static double areaEsfera(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    /**
     * *Calcula el area del cilindro
     */
    static double areaCilindro(double r, double h) {
        return 2 * Math.PI * r * h;
    }

    /**
     * *Calcula el volumen de la esfera
     */
    static double volumenEsfera(double r) {
        return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    }

    /**
     * *Calcula el volumen del cilindro
     */
    static double volumenCilindro(double r, double h) {
        return Math.PI * Math.pow(r, 2) * h;
    }

    /**
     * funcion que coge la opcion de la funcion menu para calcular la opcion
     * escogida llamando a otras funciones que calculen  *
     */
    static Double calculadora(int opcion, double r) {
        Scanner sc = new Scanner(System.in);
        double resultado = 0;
        double h = 0;
        if (opcion >= 1 && opcion <= 6) {

            resultado = switch (opcion) {
                case 1 ->
                    longitudCir(r);

                case 2 ->
                    areaCirculo(r);

                case 3 ->
                    areaEsfera(r);

                case 4 -> {
                    try {
                        System.out.print("Introduce la altura del cilindro: ");
                        h = sc.nextDouble();
                        yield areaCilindro(r, h);
                    } catch (Exception e) {
                        System.out.println("Error: altura inválida");
                        yield 0.0;
                    }
                }

                case 5 ->
                    volumenEsfera(r);

                case 6 -> {
                    try {
                        System.out.print("Introduce la altura del cilindro: ");
                        h = sc.nextDouble();
                        yield volumenCilindro(r, h);
                    } catch (Exception e) {
                        System.out.println("Error: altura inválida");
                        yield 0.0;
                    }
                }
                default -> {
                    yield 0.0;
                }
            };

        } else if (opcion == 8) {
            System.out.println("Saliendo del programa...");
        } else if (opcion == 7) {
            System.out.println("Radio");
        } else {
            System.out.println("Opcion invalida");
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        double r = 0;
        r = radio();
        while (opcion != 8) {
            opcion = menu();
            double resultado = calculadora(opcion, r);
            if (opcion >= 1 && opcion <= 6) {
                System.out.println("Resultado = " + resultado);

            } else if (opcion == 7) {
                r = radio();

            }
        }
    }
}
