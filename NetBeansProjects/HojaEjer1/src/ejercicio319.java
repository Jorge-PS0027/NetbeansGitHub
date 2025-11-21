
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jorge.pensan
 */
public class ejercicio319 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, r, resto, veces;

        System.out.println("Raiz cuadrada de:");
        num = scanner.nextInt();


        for (veces = 1; (veces * veces) <= num; veces++) ;
          
        veces--;
        r = veces * veces;
        resto = num - r;

        System.out.println("Raíz cuadrada entera: " + veces);
        System.out.println("Resto: " + resto);
        
     }
}