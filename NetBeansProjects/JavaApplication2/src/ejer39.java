
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jorge.pensan
 */
public class ejer39 {
       public static void main(String[] args) {
        int numero, cont;
        cont=1;
           Scanner sc = new Scanner(System.in);
           System.out.print("Numero entre 1 - 10:  " );
           numero = sc.nextInt();
           while (numero <= 1 || numero >= 10) {
           System.out.print("NUMERO ENTRE 1 - 10:  " );
           numero = sc.nextInt();
           }
           while (cont <= 10) {
              System.out.println( numero + "*" + cont + "=" + (numero * cont) + "  ");
               cont++;
           }
    }  
}
