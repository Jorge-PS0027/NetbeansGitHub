/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg7;

import java.util.Scanner;
import java.lang;
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double radio, lon, area;
    Scanner sc = new Scanner(System.in);
    sc.useLocale(locale.US);
    System.out.print("Escribe el radio: ");
    radio = sc.nextDouble();
    lon = 2 * Math.PI * radio;
    area = Math.PI * Math.pov(radio,2);
    System.out.print("La longitud es: " + lon);
    System.out.println("El area es: " + area);
    }
    
}
