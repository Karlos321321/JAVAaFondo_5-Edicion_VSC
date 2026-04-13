package Capitulo_1;
import java.util.Scanner;

public class App {

    static int numero;

    public static void main(String[] args) {
        Scanner diaSemana = new Scanner(System.in);
        boolean salida= false;

        while (!salida) {
            try {
                System.out.println("Introduce un dia de la semana (1-7): ");
                numero = diaSemana.nextInt();
                if (numero == 0) salida = true;

            } catch (Exception e) {
                // TODO: handle exception

                System.out.println("\nIntroduce un numero valido entre 1 y 7.");
                numero = 0; // Reiniciar el numero para evitar errores en la siguiente iteracion
                diaSemana.nextLine(); // Limpiar el buffer del scanner
            }

            DiaSemana(numero);
            System.out.println();
        }

        diaSemana.close();
    }

    static void DiaSemana(int num) {
        switch (numero) {
            case 0:
                System.out.println("Saliendo del programa...");
                break;  
            case 1:
                System.out.println("El 1er dia de la Semana es \"Lunes\"");
                break;
            case 2:
                System.out.println("El 2o dia de la Semana es \"Martes\"");
                break;
            case 3:
                System.out.println("El 3er dia de la Semana es \"Miercoles\"");
                break;
            case 4:
                System.out.println("El 4o dia de la Semana es \"Jueves\"");
                break;
            case 5:
                System.out.println("El 5o dia de la Semana es \"Viernes\"");
                break;
            case 6:
                System.out.println("El 6o dia de la Semana es \"Sabado\"");
                break;
            case 7:
                System.out.println("El 7o dia de la Semana es \"Domingo\"");
                break;
            default:
                System.out.println("Introduce un numero valido entre 1 y 7.");
            }
    }
}
