
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jorge
 */
public class ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena1;
        String cadena2;
        int resultado = 0;
        System.out.println("Introduce la cadena1:");
        cadena1 = sc.nextLine();
        System.out.println("Introduce la cadena2:");
        cadena2 = sc.nextLine();
        resultado = cadena1.compareToIgnoreCase(cadena2);
        if (resultado !=0){
        String cadena3 = cadena1+cadena2;
         cadena3 = cadena3.toUpperCase();
            System.out.println("Las cadenas son distintas: combinando...");
            System.out.println(cadena3);
        } else{
            System.out.println("Las cadenas son igulaes");
        }
       
}
}
