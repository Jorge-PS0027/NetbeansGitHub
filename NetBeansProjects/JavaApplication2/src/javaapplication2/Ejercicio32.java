/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author jorge.pensan
 */
public class Ejercicio32 {

    public static void main(String[] args) {
        double media;
        int edad,alumnos,mayores,suma;
        suma = 0;
        alumnos = 0;
        mayores = 0;
        media = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("(Salir con numeros incoherentes) Inserte edad:  " );
        edad = sc.nextInt();
        while (edad >= 0 && edad < 150) {
            suma = edad + suma;
            alumnos= alumnos + 1;
            if (edad >= 18) {
                mayores = mayores +1;
            }
            media = (double) suma / alumnos;
            System.out.print("(Salir con numeros incoherentes) Inserte numero: " );
            edad = sc.nextInt();
        }
        System.out.println("Programa terminado " );
            System.out.println("Has insertado:  " +  alumnos + " alumnos de los cuales " + mayores + " son mayores de edad");
            System.out.println("La suma de los alumnos es:  " + suma);
            System.out.println("La media de los alumnos es:  " + media);
    }
    
}
