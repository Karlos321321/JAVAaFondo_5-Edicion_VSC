package Capitulo_1;
import java.util.Scanner;

// METODOS ESTATICOS
public class Metodos_Estaticos {
    public static void main(String[] args) {

        var a=7;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número para calcular su factorial y verificar si es primo:");
        int numero = scanner.nextInt();

        System.out.println("Factorial de " + numero + " es: " + factorial(numero));
        System.out.println(numero + (esPrimo(numero) ? " Sí es primo" : " No es primo"));
    }

    static int factorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    static boolean esPrimo(int n){
        if (n%2==0) return false;
        return true;
    }
}
