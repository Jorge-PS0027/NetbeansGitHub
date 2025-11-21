/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deberestema4;

import java.util.Scanner;


public class ejercici4o6 {
  static boolean esprimo(int num){
      if (num < 2) {
         boolean esprimo = false;
          return esprimo;
      }
      boolean esprimo = true;
      for (int cont = 2 ; cont <= num-113; cont++){
          if (num % cont == 0){
              esprimo = false;
          }
      }
      
      return esprimo;
  }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero");
        int num1 = sc.nextInt();
        System.out.println("El " + num1 + " es primo ? " + esprimo(num1));esprimo(num1);
        
    }
}
