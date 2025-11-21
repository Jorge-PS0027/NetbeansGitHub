package tema.pkg4;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jorge.pensan
 */
public class ejercici4o15version2 {
    /** Funcion que pasa las horas a minutos y las suma con los minutos y despues hace la resta de los dos tiempos
     *  se asegura de que quede un resultado positivo con math abs**/
    static int diferenciaMin(int hora1, int min1, int hora2, int min2) {
        int minutos1 = 0, minutos2 = 0, diferencia = 0;
        if (hora1<=hora2){
            hora2 += 24;
            }
      minutos1 = (hora1 * 60) + min1;
      minutos2 = (hora2 * 60) + min2;
      diferencia = (minutos1 - minutos2);    
     if (diferencia<0) {
         diferencia = 24*60 + diferencia;
      }
      return diferencia;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primera hora: ");
        int hora1 = sc.nextInt();
        System.out.print("Primer minuto: ");
        int minuto1 = sc.nextInt();

        System.out.print("Segunda hora: ");
        int hora2 = sc.nextInt();
        System.out.print("Segundo minuto: ");
        int minuto2 = sc.nextInt();
        System.out.println("La diferencia es de " + diferenciaMin(hora1, minuto1, hora2, minuto2) + " minutos.");
    }
}

