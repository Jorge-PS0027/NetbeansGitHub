
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jorge.pensan
 */
public class resuelto5_3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[], n;
        System.out.println("Dime cuantos numeros quieres:");
        n = sc.nextInt();
        num = new int[n];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Dime el valor del elemento " + i);
            num[i] = sc.nextInt();
        }
        for (int i = num.length -1; i >=0;i--){
             System.out.println(num[i]);
        }
     }
}
