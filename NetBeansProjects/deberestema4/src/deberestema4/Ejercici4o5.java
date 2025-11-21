/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deberestema4;

import java.util.Scanner;

public class Ejercici4o5 {

    static boolean vocal(char v) {
        boolean resultado;
        if (v == 'a' || v == 'e' || v == 'i' || v == 'u' || v == 'o' || v == 'A' || v == 'E' || v == 'I' || v == 'U' || v == 'O') {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("La a es una vocal: " + vocal('a'));
        System.out.println("La u es una vocal: " + vocal('u'));
        System.out.println("La g es una vocal: " + vocal('g'));
        System.out.println("La p es una vocal: " + vocal('p'));
        System.out.println("La E es una vocal: " + vocal('E'));
        System.out.println("La R es una vocal: " + vocal('R'));
    }
}
