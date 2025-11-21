/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema.pkg4;

import java.util.Scanner;

/**
 *
 * @author jorge.pensan
 */
public class Tema4 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num;
      System.out.print("Cuantos ECOS quieres ?  " );
      num = sc.nextInt();
      ecos(num);

    }
    static void ecos(int x){
        for (int cont = 0 ; cont < x; cont++){
            System.out.println("Eco...");    
        }
    }
    
}
