/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema.pkg4;

import java.util.InputMismatchException;
import java.util.Scanner;


public class pruebaexcepciones1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean ok = false;
        while (!ok) {
            try {
                System.out.print("Número (1-10): ");
                num = sc.nextInt();
                if (num >= 1 && num <= 10) {
                    ok = true;
                } else {
                    System.out.println("Debe estar entre 1 y 10.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Introduce un entero válido.");
                sc.nextLine();
            }
        }
    }
}
