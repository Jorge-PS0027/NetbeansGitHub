/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hojaejer1;

import java.util.Scanner;

/**
 *
 * @author jorge.pensan
 */
public class ejerc14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2 ;
        boolean haynumeros = false;
        System.out.println("Dame un rango de numeros");
        do {
            System.out.println("Dime el primer numero del rango");
            num1 = scanner.nextInt();
            System.out.println("Dime hasta que numero es el rango");
            num2 = scanner.nextInt();
        } while (num1 < 2 || num2 < num1);

        for (int cont = num1; cont <= num2; cont++) {
            boolean primo = true;
          double  raiz = Math.sqrt(cont);
            for (int multi = 2;multi<=raiz;multi++) {
                if (cont % multi == 0) {
                  primo = false;
                }
            }    
              if (primo){
                  System.out.print(cont + ", ");
                    haynumeros = true;
              }             
        }
        if (!haynumeros){
            System.out.println("No hay ningun numero primo en el rango");
        }
    }
}
