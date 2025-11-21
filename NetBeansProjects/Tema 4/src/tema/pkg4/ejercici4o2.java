/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema.pkg4;

import java.util.Scanner;

public class ejercici4o2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("dime un numero");
        num1 = sc.nextInt();
        System.out.println("dime otro numero");
        num2 = sc.nextInt();
        rango(num1, num2);
    }

    static void rango(int x, int y) {
        if (x > y) {
            for (int menor = y; menor < x; menor++) {
                System.out.print(menor + ", ");
            }
        } else {
            for (int menor = x; menor <= y; menor++) {
                System.out.print(menor + ", ");
            }
        }
    }
}
