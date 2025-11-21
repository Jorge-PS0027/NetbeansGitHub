/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deberes;

import java.util.Scanner;

public class ejerc8 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabla;
        System.out.println("Desde que tabla del 1-10 quieres empezar");
            tabla = scanner.nextInt();
            while (tabla < 0 || tabla > 10){
            System.out.println("Error: es necesario que sea 1-10");
            tabla = scanner.nextInt();
            }
        for (int cont = tabla;cont<=10; cont++){
            System.out.println("Tabla del " + cont);
            for(int num = 1; num<=10; num++){
                System.out.println(cont + "x" + num + "=" + (cont*num));
            }
        }
    }
}
