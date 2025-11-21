
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jorge.pensan
 */
public class ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, exponente;
        double resultado;
        resultado = 0;
        exponente = 0;

        System.out.print("Numero:  ");
        base = sc.nextInt();
        while (base < 0) {
            System.out.print("error base negativa introduce base positiva-:  ");
            base = sc.nextInt();
        }
        System.out.print("exponente:  ");
        exponente = sc.nextInt();
        if (exponente > 0) {
            
        
        resultado = base;

        for (int cont = exponente; cont > 1; cont--) {
            resultado = (resultado * base);
        }
        System.out.println(base + "^" + exponente + " = " + resultado);
        }else{
            int expPositivo = -exponente; 
            resultado = base;

            for (int cont = expPositivo; cont > 1; cont--) {
                resultado = resultado * base;
            }

            resultado = 1 / resultado; 
            System.out.println(base + "^" + exponente + " = " + resultado);
        }
            
        }
    }

