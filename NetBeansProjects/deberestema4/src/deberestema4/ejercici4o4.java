/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deberestema4;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class ejercici4o4 {

    static int mayor(int num1, int num2) {
        int mayor;
        if (num1 > num2) {
            mayor = num1;
        } else {
            mayor = num2;
        }
        return (mayor);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero");
        int num1 = sc.nextInt();

        System.out.println("Dime otro numero");
        int num2 = sc.nextInt();

        System.out.println("El numero mayor es = " + mayor(num1, num2));
    }
}
