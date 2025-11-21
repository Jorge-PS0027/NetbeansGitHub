
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jorge.pensan
 */
public class ejercicio4 {

    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero entero positivo:  ");
        numero = sc.nextInt();
        while (numero < 0) {
            System.out.print("NUMERO ENTERO POSITIVO:  ");
            numero = sc.nextInt();
        }
        for (int cont = 0; cont <= numero; numero--) {
            System.out.println(numero);
        }
        System.out.println("Despegue!!!  ");
    }
}
