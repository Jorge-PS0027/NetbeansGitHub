/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hojaejer1;

import java.util.Scanner;

/**
 *
 * @author jorge.pensan
 */
public class ejer2variante {
     public static void main(String[] args) {
      int numuser,num, cont;
        cont = 0;
        num = (int) (Math.random() * 1000 + 1 );
        Scanner sc = new Scanner(System.in);
        System.out.print("Adivina el numero:  " );
        numuser = sc.nextInt();
        while (num != numuser && numuser != -1 && cont != 5)  {
            if (numuser > num ) {
                  System.out.println("numero mayor sigue intentando");
                  cont++;
                  System.out.println("Adivina el numero:  " );
                  numuser = sc.nextInt();
            }else{
                  System.out.println("numero menor sigue intentando" );
                  cont++;
                  System.out.println("Adivina el numero:  " );
                  numuser = sc.nextInt();
            }
            }
            if (numuser == -1) {
                 System.out.println("Te has rendido pardillo el numero era:  " + num );
            }else{
                if (cont == 5) {
                  System.out.println("Numero de intentos finalizado el numero era:  " + num );
                }else{
                  System.out.println("Felicidades acertaste");
                  
       
    
                }
    }
     }
}
    

