/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author jorge.pensan
 */
public class ejerciciodictadoprofe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[];
        num = new int[6];
        for(int i=0;i < num.length;i++){
            System.out.println("Dime el valor del elemento " + i);
            num[i] = sc.nextInt();
        }
         for(int x=0;x < num.length;x++){
             System.out.println("En el elemento " + x + " se encuentra el valor: " + num[x]);
        }
    }
}
