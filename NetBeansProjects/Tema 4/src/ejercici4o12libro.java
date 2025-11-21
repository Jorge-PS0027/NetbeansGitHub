
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jorge.pensan
 */
public class ejercici4o12libro {
      static int fibonacci(int n) {
        int resultado = 0;
        if (n == 0 || n==1) {
            resultado = 1;

        } else {
            resultado = fibonacci(n - 1) + fibonacci(n-2);
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime un numero para Fibonacci: ");
        int n = sc.nextInt();
        
        System.out.println("fibonacci("+ n +")= " + fibonacci(n));
    }

}
