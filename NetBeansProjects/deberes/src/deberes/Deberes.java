/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deberes;

import java.util.Scanner;

public class Deberes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu, n1, n2;
        menu = 0;
        while (menu != 4) {
           
          

           

            System.out.println("Menu");
            System.out.println("SUMAR INTRODUCE 1");
            System.out.println("RESTAR INTRODUCE 2");
            System.out.println("MULTIPLICAR INTRODUCE 3");
            System.out.println("SALIR INTRODUCE 4");
            menu = scanner.nextInt();
            
            System.out.println("INTRODUCE 1 NUMERO");
            n1 = scanner.nextInt();
            System.out.println("INTRODUCE 1 NUMERO");
            n2 = scanner.nextInt();
            
            switch (menu) {
                case 1 ->
                    System.out.println("La suma es:" + (n1 + n2));
                case 2 ->
                    System.out.println("La resta es:" + (n1 - n2));
                case 3 ->
                    System.out.println("La multiplicacion es:" + (n1 * n2));
                case 4 ->
                    System.out.println("Saliendo");
                default ->
                    System.out.println("ERROR: Eleccion no valida");
            }
        }
    }
}
