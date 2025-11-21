
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class ejer36VD {
       public static void main(String[] args) {
        int numero, cont;
        cont=1;
           Scanner sc = new Scanner(System.in);
           System.out.print("Numero entero positivo:  " );
           numero = sc.nextInt();
           while (numero < 0) {
           System.out.print("NUMERO ENTERO POSITIVO:  " );
           numero = sc.nextInt();
           }
            do {
                System.out.println(cont  ); 
                cont++;
            } while (numero >= cont);
    }  
}

