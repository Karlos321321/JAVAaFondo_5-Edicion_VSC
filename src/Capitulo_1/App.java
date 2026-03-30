package Capitulo_1;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner diaSemana = new Scanner(System.in);

        System.out.println("Introduce un dia de la semana (1-7): ");
        int numero = diaSemana.nextInt();

        switch (numero) {
            case 1:
                System.out.println("El 1er dia de la Semana es \"Lunes\"");
                break;
            case 2:
                System.out.println("El 2do dia de la Semana es \"Martes\"");
                break;
            case 3:
                System.out.println("El 3er dia de la Semana es \"Miercoles\"");
                break;
            case 4:
                System.out.println("El 4to dia de la Semana es \"Jueves\"");
                break;
            case 5:
                System.out.println("El 5to dia de la Semana es \"Viernes\"");
                break;
            case 6:
                System.out.println("El 6to dia de la Semana es \"Sabado\"");
                break;
            case 7:
                System.out.println("El 7mo dia de la Semana es \"Domingo\"");
                break;
            default:
                System.out.println("Numero no valido, introduce un numero entre 1 y 7.");
        }
 
        diaSemana.close();
    }

    /* static void DiaSemana(int num) {
        if (num == 1)
            System.out.println("El 1er dia de la Semana es \"Lunes\"");
        if (num == 2)
            System.out.println("El 2do dia de la Semana es \"Martes\"");
        if (num == 3)
            System.out.println("El 3er dia de la Semana es \"Miercoles\"");
        if (num == 4)
            System.out.println("El 4to dia de la Semana es \"Jueves\"");
        if (num == 5)
            System.out.println("El 5to dia de la Semana es \"Viernes\"");
        if (num == 6)
            System.out.println("El 6to dia de la Semana es \"Sabado\"");
        if (num == 7)
            System.out.println("El 7mo dia de la Semana es \"Domingo\"");
    } */
}
