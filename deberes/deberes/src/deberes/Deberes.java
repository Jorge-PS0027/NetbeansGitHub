/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deberes;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Deberes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contraseña;
        String adivina;
        int resultado;
        System.out.println("Introduce la contraseña:");
        contraseña = sc.nextLine();
        do {
            System.out.println("Adivina la contraseña:");
            adivina = sc.nextLine();

            resultado = adivina.compareTo(contraseña);
            if (resultado < 0) {
                System.out.println("tu intento es menor alfabeticamente que la contraseña");
            } else if (resultado > 0) {
                System.out.println("tu intento es mayor alfabeticamente que la contraseña");
            }

        } while (resultado != 0);
        System.out.println("Acertaste la contraseña");
    }

}
