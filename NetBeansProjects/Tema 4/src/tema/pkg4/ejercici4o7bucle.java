/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema.pkg4;

import java.util.Scanner;

/**
 *
 * @author jorge.pensan
 */
public class ejercici4o7bucle {

        static boolean esprimo(int num) {
            boolean esprimo = true;
            if (num < 2) {
                esprimo = false;
            }
            esprimo = true;
            for (int cont = 2; cont <= num - 1 && esprimo; cont++) {
                if (num % cont == 0) {
                    esprimo = false;
                }
            }

            return esprimo;
        }

        static int divisores(int num) {
            int cont = 0;
            for (int i = 2; i <= num; i++) {
                if (num % i == 0) {
                    if (esprimo(i) == true) {
                        cont++;
                    }
                }
            }
            return cont;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int cont = 0;
            System.out.println("Dime un numero positivo salir con -1");
            int num1 = sc.nextInt();
            while (num1 != -1) {
                if (num1 > 0) {
                    System.out.println("El " + num1 + " tiene " + divisores(num1) + " Divisores Primos");
                    System.out.println("Dime un numero");
                    num1 = sc.nextInt();
                    cont ++;
                } else {
                    System.out.println("Numero incorrecto escribe un numero positivo o -1 para salir");
                    System.out.println("Dime un numero");
                    num1 = sc.nextInt();
                }
            }
            System.out.println("Programa finalizado " + cont + " Numeros ejecutados");
        }
    }

