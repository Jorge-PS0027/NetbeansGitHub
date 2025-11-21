
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jorge.pensan
 */
public class ejerci36VF {

    public static void main(String[] args) {
        int numero, cont;
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero entero positivo:  ");
        numero = sc.nextInt();
        while (numero < 0) {
            System.out.print("NUMERO ENTERO POSITIVO:  ");
            numero = sc.nextInt();
        }
        for (cont = 1; cont <= numero; cont++) {
            System.out.println(cont);
        }
    }
}
