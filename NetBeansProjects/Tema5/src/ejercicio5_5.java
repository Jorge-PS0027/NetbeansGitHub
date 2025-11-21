
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jorge.pensan
 */
public class ejercicio5_5 {

    static int[] rellenaPares(int longitud, int fin) {
        Random random = new Random();
        int num=0;
        int Pares[] = new int[longitud];
        for (int i = 0; i < Pares.length; i++) {
            int aleatorio = 2 + random.nextInt(fin);
            if (aleatorio % 2 ==0){
                Pares[i] = aleatorio;
            }
        }
        return Pares;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = 0, f = 0;
        System.out.println("dime el numero de elementos que habra en la tabla");
        l = sc.nextInt();
        System.out.println("Dime que elemento sera el ultimo");
        f = sc.nextInt();
        int par[] = rellenaPares(l, f);
        for (int pares : par){
        System.out.println(pares);
        }
    }
}
