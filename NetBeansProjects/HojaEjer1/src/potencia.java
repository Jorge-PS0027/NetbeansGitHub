
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jorge.pensan
 */
public class potencia {

    public static void main(String[] args) {
        int base, exponente;
        double resultado;
        resultado = 0;
        exponente = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Numero:  ");
        base = sc.nextInt();
        System.out.print("exponente:  ");
        exponente = sc.nextInt();
        
        resultado = base;
        
        for (int cont = exponente; cont > 1; cont--) {
            resultado =  (resultado * base);
        }
        System.out.println(base + "^" + exponente + " = " + resultado);
    }
}
