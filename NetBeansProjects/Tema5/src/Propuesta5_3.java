
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jorge.pensan
 */
public class Propuesta5_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[], n = 0, ceros = 0, contP = 0, contN = 0, sumaN=0, sumaP=0;
        System.out.println("Dime cuantos numeros quieres:");
        n = sc.nextInt();
        num = new int[n];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Dime el valor del elemento " + i);
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0) {
                ceros++;
            } else if (num[i] > 0) {
                sumaP = sumaP + num[i];
                contP++;
               
            } else if (num[i] < 0) {
                sumaN = sumaN + num[i];
                contN++;
            }

           
        }
         System.out.println("***Desglose de numeros***");
            System.out.println("Numero de ceros: " + ceros);
            try {
            System.out.println("Media de Positivos: " + sumaP/contP );
           
            }catch(ArithmeticException e){
                System.out.println("No hay numeros Positivos");
            }
             try {
           
            System.out.println("Media de los Negativos: " + sumaN/contN);
            }catch(ArithmeticException e){
                System.out.println("No hay numeros Negativos");
            }
    }
}
