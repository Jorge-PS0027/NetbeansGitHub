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
public class ejerc17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horas, minutos, segundos, incre;
        incre = 0;
        do {
            System.out.println("dime la horas");
            horas = scanner.nextInt();
            System.out.println("dime los minutos");
            minutos = scanner.nextInt();
            System.out.println("dime los segundos");
            segundos = scanner.nextInt();
        } while (horas < 0 || horas > 12 || minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59);
        System.out.println(horas + ":" + minutos + ":" + segundos);
        System.out.println("dime los segundos a incrementar");
        incre = scanner.nextInt();

        for (int cont = 0; cont < incre; cont++) {
            segundos++;  

            if (segundos >= 60) {  
                segundos = 0;
                minutos++;

                if (minutos >= 60) {  
                    minutos = 0;
                    horas++;
                    if (horas > 12) {  
                        horas = 1;
                    }
                }
            }
        }
         System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}
