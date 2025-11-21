/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer2.pkg1;

import java.util.Scanner;

/**
 *
 * @author jorge.pensan
 */
public class Ejercicio213 {
    public static void main(String[] args) {
   int hora, minuto, segundo;
    Scanner sc = new Scanner(System.in);
        System.out.print("Inserte hora: " );
        hora = sc.nextInt();
        System.out.print("Inserte minutos: " );
        minuto = sc.nextInt();
          System.out.print("Inserte segundos: " );
        segundo = sc.nextInt();
        if ((hora > 23 || hora < 1) ||  (minuto > 59 || minuto < 0) || (segundo > 59 || segundo < 0)) {
        System.out.print("Hora invalida: " + hora + ":" + minuto + ":" + segundo );
        }else{
        System.out.print("Hora valida : " + hora + ":" + minuto + ":" + segundo );
        segundo = segundo + 1;
        if (segundo == 60) {
            segundo = 0;
            minuto = minuto + 1; 
            if (minuto == 60) {
                minuto = 0;
                hora= hora + 1;
                if (hora > 23){
                    hora = 0;
                                        System.out.print("Hora +1 segundo : " + hora + ":" + minuto + ":" + segundo );
                 }else{
                             System.out.print("Hora +1 segundo : " + hora + ":" + minuto + ":" + segundo );
                    
                }
            }else{
            System.out.print("Hora +1 segundo : " + hora + ":" + minuto + ":" + segundo );
            }
        }else{
            System.out.print("Hora +1 segundo : " + hora + ":" + minuto + ":" + segundo );
        }
        
    }
    }
    
}
