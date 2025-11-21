/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema.pkg4;

import java.util.Scanner;

public class ejercicio16 {

    static void random(int n, int max, int min) {
        int resultado = 0;
        System.out.print(n + " Numeros aleatorios: ");
        for (int i = 0; i < n; i++) {
            resultado = (int) (Math.random() * (max - min + 1)) + min;
            if (i == 0){
                 System.out.print(resultado);
            } else{
            System.out.print(", " + resultado ); 
            
            }
        }
    }

    public static void main(String[] args) {
        int n = 0, max = 0, min = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una cantidad de numeros aleatorios");
        n = sc.nextInt();
        System.out.println("Dime el numero inicial de rango");
        min = sc.nextInt();
        System.out.println("Dime el ultimo numero del rango");
        max = sc.nextInt();
        while (max < min) {
            System.out.println("Error: el numero inicial no puede ser mayor que el ultimo del rango");
            System.out.println("Dime el numero inicial de rango");
            min = sc.nextInt();
            System.out.println("Dime el ultimo numero del rango");
            max = sc.nextInt();
        }
        random(n,max,min);
        System.out.println(" ");
    }
}
