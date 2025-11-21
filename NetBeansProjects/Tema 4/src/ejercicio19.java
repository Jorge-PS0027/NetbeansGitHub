
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jorge.pensan
 */
public class ejercicio19 {
    static void calcularTotal(int n){
         Scanner sc = new Scanner(System.in);
        double precio = 0;
        double suma = 0;
        for (int i=1; i < n+1; i++){
            System.out.println(i + "-Dime el precio ");
            precio = sc.nextDouble();
            while (precio < 0.0){
            System.out.println("Precio negativo vulve a insertar el precio-"+ i + ": ");
            precio = sc.nextDouble();
            }
            suma = suma + precio; 
        }
         if (suma > 100){
             System.out.println("Precio Sin descuento: " + suma);
             System.out.println("Se aplica un 10 % de descuento" );
             System.out.println("Precio con descuento: " + Aplicardescuento(suma));
         } else {
             System.out.println("Precio Total sin descuento aplicable: " +  suma);
         }
    }
      static Double Aplicardescuento(double total){
          Double  descuento = 0.0;
          descuento = total * 0.1;
          return total - descuento;
      }
    
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = 0;
        System.out.println("dime cuantos precios quieres");
        n = sc.nextInt();
        calcularTotal(n);
    }
}
