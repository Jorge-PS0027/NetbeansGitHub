
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jorge.pensan
 */
public class propuesto5_4_opciones2 {
    static int[] buscar(int t[], int clave) {
        int posicion1 = -1;
        int posicion2 = -1;

        for (int x = 0; x < t.length; x++) {
            if (t[x] == clave) {
                if (posicion1 == -1) {
                    posicion1 = x;
                } 
                    posicion2 = x;
                
            }
        }

        return new int[]{posicion1, posicion2};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = {5, 1, 5, 3, 5, 2, 4};

        System.out.println("Dime un numero a buscar:");
        int num = sc.nextInt();

        int[] resultado = buscar(x, num);

        if (resultado[0] == -1) {
            System.out.println("No se encontro la clave.");
        } else if (resultado[1] == -1) {
            System.out.println("La clave esta en la posicion: " + resultado[0]);
        } else {
            System.out.println("La clave esta en la posición: " + resultado[0] + " y en la posicion " + resultado[1]);
        }

    }
}