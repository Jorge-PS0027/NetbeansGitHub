
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jorge.pensan
 */
public class resuleto5_4 {

    static int maximo(int t[]) {
        int mayor = 0;
        for (int x = 0; x < t.length; x++) {
            if (t[x] > mayor) {
                mayor = t[x];
            }
        }
        return mayor;
    }

    static int minimo(int t[]) {
        int mayor = 0, menor = t[0];
        for (int x = 0; x < t.length; x++) {
            if (t[x] > mayor) {
                mayor = t[x];
            } else if (t[x] < menor) {
                menor = t[x];
            }
            
        }
          
        return menor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[], mayor = 0, menor = 0;
        num = new int[5];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Dime el valor del elemento " + i);
            num[i] = sc.nextInt();
        }
        mayor = maximo(num);
        menor = minimo(num);
        System.out.println("El numero mayor: " + mayor);
        System.out.println("El numero menor: " + menor);
    }
}
