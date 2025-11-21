
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jorge.pensan
 */
public class propuesto5_4 {

    static int buscar(int t[], int clave) {
        int posicion = 0;
        int NoEsta = 0;
int resultado[] = {posicion,NoEsta};
        for (int x = 0; x < t.length; x++) {
            if (t[x] == clave) {
                posicion = x+1; 
            }
        }
        if (posicion == 0){
            posicion = -1;
    }
        return posicion;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int resultado=0;
        int x[] =  {4, 5, 6, 1, 2, -5, -10}; 
        int num = 0;
        System.out.println("Dime un numero a buscar");
        num = sc.nextInt();
        resultado = buscar(x, num);
        if (resultado== -1){
            System.out.println("No se encontro la clave: " + resultado);
        } else{
            System.out.println("La clave estaba en la posicion: " + resultado);
        }
    }
}
