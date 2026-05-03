package Capitulo_1;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        control_Inicio();
    }

    public static void control_Inicio(){

        boolean salida = false;

        while (!salida){

            int numero = entraDatos();

            diaSemana(numero);

            
        
        }
    }

    public static int entraDatos(){

        Scanner diaSemana = new Scanner(System.in);
        boolean salida = false;
        int numero=0;

        while(!salida){

            try {
                System.out.println("\nIntroduce un dia de la semana (1-7): ");
                numero = diaSemana.nextInt();

                salida = true;

            } catch (Exception e) {

                System.out.println("\nFORMATO INCORRECTO, SOLO SE ADMITEN NUMEROS !!!!");
                diaSemana.nextLine(); // Limpiar el buffer del scanner
            }

            if(numero<0 || numero>7) {
                System.out.println("El numero debe estar entre 1 y 7 !!!!");
                salida=false;
            }
        }
        
        diaSemana.close();
        return numero;
    }

    public static void diaSemana(int num) {
        switch (num) {

            case 0:
                System.out.println("SALIENDO DEL PROGRAMA !!! .....");
                break;
            case 1:
                System.out.println("El 1er dia de la Semana es \"Lunes\"");
                control_Inicio();
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
            }
    }
}
