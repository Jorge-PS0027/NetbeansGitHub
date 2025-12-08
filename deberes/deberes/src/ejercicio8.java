
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jorge
 */
public class ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabras;
        System.out.println("Introduce palabras separadas por espacios:");
        palabras = sc.nextLine();
        if (palabras.indexOf(" ") == -1) {
            System.out.println("Solo se detecto una palabra o ninguna"); 
        }else{
        String palabra1 = palabras.substring(0, palabras.indexOf(" "));
        String palabra2 = palabras.substring(palabras.lastIndexOf(" ") + 1, palabras.length());
        String mayus1 = palabra1.substring(0, 1);
        String resto1 = palabra1.substring(1);
        String mayus2 = palabra2.substring(0, 1);
        String resto2 = palabra2.substring(1);
        mayus2 = mayus2.toUpperCase();
        mayus1 = mayus1.toUpperCase();
        palabra2 = mayus2 + resto2;
        palabra1 = mayus1 + resto1;
        System.out.println(palabra1);
        System.out.println(palabra2);
        }
    }
}
