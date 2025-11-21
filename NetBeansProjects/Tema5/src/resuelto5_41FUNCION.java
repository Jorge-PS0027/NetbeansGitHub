
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
public class resuelto5_41FUNCION {

    static int[] MaxYMin(int t[]) {
        int mayor = t[0], menor = t[0];
        for (int x = 0; x < t.length; x++) {
            if (t[x] > mayor) {
                mayor = t[x];
            } else if (t[x] < menor) {
                menor = t[x];
            }

        }
        int resultado[] = {mayor, menor};

        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[], mayor = 0, menor = 0, x = 0;
        boolean error1 = false, error2 = false;
        while (!error1) {
            try {
                System.out.println("Dime el numero de elementos de la tabla");
                x = sc.nextInt();
                if (x > 0) {
                    error1 = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: el numero debe ser un numero entero");
                sc.nextLine();
            }
        }
        num = new int[x];
        int errores=0;
        for (int i = 0; i < num.length; i++) {
            while (!error2) {
                try {
                    System.out.println("Dime el valor del elemento " + i);
                    num[i] = sc.nextInt();
                    error2 = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error: el numero debe ser un numero entero");
                    sc.nextLine();
                    
                }
            }
            error2=false;
            if (errores > num.length) {
                error2=true;
            }
        }

        int valores[] = MaxYMin(num);
        System.out.println("El numero mayor: " + valores[0]);
        System.out.println("El numero menor: " + valores[1]);
    }
}
