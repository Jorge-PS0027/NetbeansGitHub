
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jorge
 */
public class ejercicio5_5 {

    static int[] rellenaPares(int longitud, int fin) {

        int num = 0;
        int Pares[] = new int[longitud];
        for (int i = 0; i < Pares.length; i++) {
            int aleatorio = 0;
            do {
                aleatorio = (int) ((Math.random() * fin) + 2);
            } while (aleatorio % 2 != 0);

            Pares[i] = aleatorio;

        }
        return Pares;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lon = 0, fn = 0;
        boolean error1 = false, error2 = false;
        while (!error1) {
            try {

                System.out.println("dime el numero de elementos que habra en la tabla");
                lon = sc.nextInt();
                if (lon <= 0) {
                    System.out.println("Error: el numero debe ser positivo");
                } else {
                    error1 = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: el numero debe ser un numero entero");
                sc.nextLine();
            }
        }
        while (!error2) {
            try {
                System.out.println("Dime que elemento sera el ultimo");
                fn = sc.nextInt();
                if (fn <= 0) {
                    System.out.println("Error: el numero debe ser positivo");
                } else {
                    error2 = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: el numero debe ser un numero entero");
                sc.nextLine();
            }
        }
        int par[] = rellenaPares(lon, fn);
        for (int pares : par) {
            System.out.println(pares);
        }
    }
}
