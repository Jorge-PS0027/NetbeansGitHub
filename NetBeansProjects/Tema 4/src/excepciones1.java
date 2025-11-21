
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jorge.pensan
 */
public class excepciones1 {
     public static void main(String[] args) {
         int num1 = 0,num2 = 0, suma = 0;
         boolean error = false;
         Scanner sc = new Scanner(System.in);
        do{ 
         try{
         System.out.println("Dime un numero entero");
         num1 = sc.nextInt();
          System.out.println("Dime otro numero entero");
         num2 = sc.nextInt();
         suma = num1+num2;
             System.out.println("la suma de los dos numero es = "+ suma );
         error = true;
         } catch(InputMismatchException e) {
             System.out.println("Error: tiene que ser un numero entero");       
             sc.nextLine();
                 }        
         } while (!error);
     }
}
