package tema.pkg4;

import java.util.Scanner;

public class ejercici4o9 {

    /**
     * Funciom maximo calcula el mayor de dos numeros
     */
    static int maximo(int num1, int num2) {
        int mayor;
        if (num1 > num2) {
            mayor = num1;
        } else {
            mayor = num2;
        }
        return (mayor);
    }

    /**
     * Funciom maximo que utiliza la otra funcion maximo para calcular el mayor
     * de un 3 numero
     */
    static int maximo(int num1, int num2, int num3) {
        int mayor = maximo(num1, num2);
        return maximo(num3, mayor);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero");
        int num1 = sc.nextInt();

        System.out.println("Dime otro numero");
        int num2 = sc.nextInt();

        System.out.println("Dime otro numero");
        int num3 = sc.nextInt();

        System.out.println("El numero mayor es = " + maximo(num1, num2, num3));
    }
}
