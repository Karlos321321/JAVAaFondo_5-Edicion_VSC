package Capitulo_1;

public class Metodos_Estaticos {
    public static void main(String[] args) {

        int numero = 9;
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

    static boolean esPrimo(int n) {
    
       
    }
}
