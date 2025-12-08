
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jorge
 */
public class ejercicio6_5 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String invertido ="";
        String cadena;
        System.out.println("Introduce una cadena:");
        cadena = sc.nextLine();
        for(int i = cadena.length() -1; i >= 0;i--){
          char nuevo = cadena.charAt(i);         
          invertido = invertido + nuevo;
        }
        System.out.println(invertido);
    }
}
