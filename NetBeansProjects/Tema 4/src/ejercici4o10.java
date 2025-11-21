
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jorge.pensan
 */
public class ejercici4o10 {

    static double elevado(double a, int n) {
        double resultado = 0;
        if (n == 0) {
            resultado = 1;

        } else {
            resultado = a * elevado(a, n - 1);
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("La base: ");
        int a = sc.nextInt();
        System.out.print("Elevado a: ");
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.print("ERROR: El Numero elevado a de ser positivo: ");
            n = sc.nextInt();
        }
        System.out.println("Resultado " + elevado(a, n));
    }
}
