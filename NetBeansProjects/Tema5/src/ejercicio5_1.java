
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jorge.pensan
 */
public class ejercicio5_1 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[], suma= 0;
        num = new int[10];
        for(int i=0;i < num.length;i++){
            num[i] = (int) (Math.random()*100)+1;
            suma = suma + num[i];
        }
          System.out.println("La suma de los 10 numeros aleatorios es: " + suma);
    }
}

