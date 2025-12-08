
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jorge
 */
public class ejercicio6_4 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int cont=0;
        String espacios;
        System.out.println("Introduce una cadena:");
        espacios = sc.nextLine();
        for(int i=0;i<espacios.length();i++){
          if (espacios.charAt(i) == ' ') { 
                cont++;
            }  
        }
         System.out.println("contador de espacios:" + cont);
     }
}
