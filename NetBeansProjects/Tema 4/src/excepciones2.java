
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
public class excepciones2 {
       public static void main(String[] args) {
           int num1=0,num2=0,division=0;
           boolean error=false;
           Scanner sc = new Scanner(System.in);
           while (!error){
               try{
                   System.out.println("Numero a dividir"); 
                   num1 = sc.nextInt();
                   System.out.println("entre");
                   num2 = sc.nextInt();
                   division= num1/num2;
                   System.out.println("La division de "+num1+" entre "+ num2 +" es = "+division);
                   error=true;
               } catch (InputMismatchException e){
                     System.out.println("Error: Introduce un numero");
                     sc.nextLine();
               } catch (ArithmeticException e){
                   System.out.println("Error: No se puede dividir entre 0");
                   sc.nextLine();
               }
           }
       }
}

