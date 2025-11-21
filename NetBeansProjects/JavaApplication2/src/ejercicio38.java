
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jorge.pensan
 */
public class ejercicio38 {

    public static void main(String[] args) {
        int numero, suma;
        double media;
        media = 0;
        suma = 0;
        Scanner sc = new Scanner(System.in);
        for (int cont = 0; cont < 10; cont++) {
            System.out.print("Dime un numero ");
            numero = sc.nextInt();
            suma = suma + numero;
        }
        media = suma / 10.0;
        System.out.println("la media es: " + media);
    }
}
