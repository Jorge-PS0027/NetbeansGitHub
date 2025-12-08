
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jorge
 */
public class ejercicio6_3V2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contraseña;
        String adivina;

        System.out.println("Introduce la contraseña:");
        contraseña = sc.nextLine();
        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }
        do {
            System.out.println(" ");
            System.out.println("La longitud de la contraseña es de " + contraseña.length());
            System.out.println("Adivina la contraseña:");
            adivina = sc.nextLine();
            if (adivina.length() != contraseña.length()) {
                System.out.println("La longitud de la contraseña es de " + contraseña.length());
                System.out.println("Vuelve a introducir la contraseña");
                adivina = sc.nextLine();
            }

            System.out.println("");

            for (int i = 0; i < contraseña.length(); i++) {
                char c = contraseña.charAt(i);
                char a = adivina.charAt(i);

                if (a == c) {
                    System.out.print(c);
                } else {
                    System.out.print("*");
                }
            }

        } while (!adivina.equals(contraseña));
        System.out.println(" Acertaste la contraseña");
    }

}
