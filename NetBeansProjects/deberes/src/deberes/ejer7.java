/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deberes;

import java.util.Scanner;

public class ejer7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int cont = 1;cont<=10; cont++){
            for(int num = 1; num<=10; num++){
                System.out.println(cont + "x" + num + "=" + (cont*num));
            }
        }
    }
}
