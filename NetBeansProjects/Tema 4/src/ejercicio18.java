
import java.util.Scanner;
import java.util.InputMismatchException;

public class ejercicio18 {
    static int sumadigitos(int n) {
    int resultado = 0;
    if (n < 10 && n >= 0) {
        resultado = n;
    } else {
       resultado = (n % 10 ) + (sumadigitos(n/10));
    }
    return resultado;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        try{
             System.out.println("Dime un numero");
             n = sc.nextInt();
               System.out.println("suma de digitos " + sumadigitos(n));
        } catch(InputMismatchException e) {
            System.out.println("Numero invalido");
        }
        
    }  
}
