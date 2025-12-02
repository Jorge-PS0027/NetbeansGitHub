
import java.util.Arrays;
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
public class Propuesto5_7 {

    static int[] CalcularNumero(int t[]) {
        int elemento1 = 0;
        int elemento2 = 0;
        int[] copia = new int[0];
        while (t.length > 1) {
            do {
                elemento1 = (int) (Math.random() * t.length);
                elemento2 = (int) (Math.random() * t.length);
            } while (elemento1 == elemento2);
            int media = (t[elemento1] + t[elemento2]) / 2;
            if (elemento1 == (t.length -1)) {
                t[elemento2] = media;
                t[elemento1] = t[t.length - 1];
            } else {
                t[elemento1] = media;
                t[elemento2] = t[t.length - 1];
            }
            t = Arrays.copyOf(t, t.length - 1);

            Arrays.sort(t);
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        boolean error=false;
        while (!error) {
            System.out.print("Dime cuantos numeros de la suerte quieres (minimo 2): ");
            try {
                n = sc.nextInt();
                if (n < 2) {
                    System.out.println("Error: Debes introducir un numero mayor o igual que 2.");
                } else {
                    error = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un numero entero válido.");
                sc.nextLine();
            }
        }
        int tabla[] = new int[n];
        for (int i = 0; i < tabla.length; i++) {
          boolean entradaValida = false;
            while (!entradaValida) {
                try {
                    System.out.print("Dime tu numero " + (i + 1) + " de la suerte: ");
                    tabla[i] = sc.nextInt();
                    entradaValida = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error: El elemento debe ser un numero entero.");
                    sc.nextLine();
                }
            }
        }
        Arrays.sort(tabla);
        System.out.println("**Numeros Escogidos**");
        System.out.println(Arrays.toString(tabla));
        int resultado[] = CalcularNumero(tabla);
        System.out.println("**Numero de la Suerte**");
        System.out.println(Arrays.toString(resultado));
    }
}
