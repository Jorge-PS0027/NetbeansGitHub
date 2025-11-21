/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer2.pkg1;

import java.util.Scanner;

/**
 *
 * @author jorge.pensan
 */
public class Ejerc212 {

    public static void main(String[] args) {
     int dia, mes,anio ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte dia: " );
        dia = sc.nextInt();
        System.out.print("Inserte mes: " );
        mes = sc.nextInt();
          System.out.print("Inserte anio: " );
        anio = sc.nextInt();
            if (mes > 12 && anio <= 0) {
                  System.out.println("Fecha invalida " + dia + "/" + mes + "/" + anio );
            }else if (mes == 2 && dia >= 1 && dia<= 28){
                  System.out.println("fecha correcta " + dia + "/" + mes + "/" + anio );
             }else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia >= 1 && dia<= 30){
                  System.out.println("fecha correcta " + dia + "/" + mes + "/" + anio );
             }else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia >= 1 && dia<= 31){
                  System.out.println("fecha correcta " + dia + "/" + mes + "/" + anio );
              
            }else{
                 System.out.println("Fecha invalida " + dia + "/" + mes + "/" + anio );
             }
    }
    
}
