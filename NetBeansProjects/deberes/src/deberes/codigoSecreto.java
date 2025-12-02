
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jorge
 */
public class codigoSecreto {

    static boolean combinacion(int t[], int secreta[]) {
        boolean adivinado = false;
        for (int i = 0; i < t.length; i++) {

            if (t[i] == secreta[i]) {
                System.out.println("La combinacion [" + (i + 1) + "] es correcta");
                adivinado = true;
            } else if (t[i] > secreta[i]) {
                System.out.println("La combinacion [" + (i + 1) + "] erronea la combinacion es menor");

            } else {
                System.out.println("La combinacion [" + (i + 1) + "] erronea la combinacion es mayor");
            }
        }
        for (int i = 0; i < t.length; i++) {
            if (t[i] != secreta[i]) {
                adivinado = false;
            }
        }

        return adivinado;
    }

    public static void main(String[] args) {
        boolean resultado = false;
        Scanner sc = new Scanner(System.in);
        int tabla[] = new int[5];
        
        int codigo[] = new int[5];
        for (int i = 0; i < codigo.length; i++) {
            codigo[i] = (int) (Math.random() * 5) + 1;
        }
        while (!resultado){
            System.out.println("**Adivina la combinacion**");
        for (int i = 0; i < tabla.length; i++) {
            boolean error = false;
            while (!error) {
                try {
                    
                    System.out.print(" [" + (i + 1) + "] ");
                    tabla[i] = sc.nextInt();
                    if (tabla[i] < 0 || tabla[i] > 5) {
                        error = false;
                    } else {
                        error = true;
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Error: El elemento debe ser un numero entero.");
                    sc.nextLine();
                }
            }
        }
        
        resultado = combinacion(tabla, codigo);
        
        }
    }
}
