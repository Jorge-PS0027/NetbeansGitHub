
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class CAJERO {
  
    static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu Cajero automatico:");
        System.out.println("1-Consultar saldo");
        System.out.println("2-Ingresar dinero");
        System.out.println("3-retira dinero");
        System.out.println("4-Salir");
        return sc.nextInt();

    }

    static double ingresar(double saldo) {
        Scanner sc = new Scanner(System.in);
        double cantidad = 0;
        System.out.println("Ingresa cantidad");
        cantidad = sc.nextInt();
        if (cantidad < 0) {
            System.out.println("No se puede insertar una cantidad negativa");
            return saldo;
        } else {
            saldo = saldo + cantidad;
            System.out.println("Nuevo saldo: " + saldo + " $");
            return saldo;
        }
    }

    static double retirar(double saldo) {
        Scanner sc = new Scanner(System.in);
        double cantidad = 0;
        System.out.println("retira cantidad");
        cantidad = sc.nextInt();
        if (cantidad > saldo) {
            System.out.println("No se puede retirar mas de lo que tienes");
            return saldo;
        } else {
            saldo = saldo - cantidad;
            System.out.println("Saldo Restante: " + saldo + " $");
            return saldo;
        }
    }

    static void consultar(double saldo) {
        System.out.println("Tu saldo actual es: " + saldo + " $");
    }

    public static void main(String[] args) {
        int opcion = 0;
        double resultado, total = 1000;
        while (opcion != 4) {
            opcion = menu();
            switch (opcion) {
                case 1 ->

                    consultar(total);
                case 2 ->
                    total = ingresar(total);

                case 3 ->
                    total = retirar(total);
                case 4 ->
                    System.out.println("Saliendo del cajero");
                default ->
                    System.out.println("opcion incorrecta vuelve a ingresar");

            };

        }

    }
}


