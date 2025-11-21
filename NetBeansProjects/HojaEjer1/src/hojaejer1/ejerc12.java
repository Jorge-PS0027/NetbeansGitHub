/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hojaejer1;

/**
 *
 * @author jorge.pensan
 */
public class ejerc12 {

    public static void main(String[] args) {
        int suma = 0;
        int cont = 0;
        int tirada = 0;
        int numS = (int) (Math.random() * 6) + 1;
      do {
            tirada = (int) (Math.random() * 6) + 1;
            if (tirada != numS) {
                suma = tirada + suma;
                cont++;
            }
            if (tirada == numS) {
                System.out.println("Tirada = " + tirada + " Numero oculto descubierto = " + numS);
            } else {
                System.out.println("Tirada = " + tirada + " Puntos almacenados = " + suma);
            }
        }   while (tirada != numS);
        System.out.println(" ");
        System.out.println("Resultado");
        System.out.println("El numero oculto era = " + numS);
        System.out.println("El dinero total acumulado ha sido = " + suma);
        System.out.println("Las tiradas han sido un total de = " + cont);
    }
}
