package ejercicio5;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner teclad = new Scanner(System.in);
        System.out.println("¿Apellido del empleado?");
        String apellido = teclad.nextLine();
        System.out.println("¿Cual es el nombre del empleado?");
        String nombre = teclad.nextLine();
        System.out.println("¿Cual es el puesto del empleado?\n" +
                "1. Agente de servicio\n" +
                "2. Empleado de oficina\n" +
                "3. Directivo\n");
        int puesto = teclad.nextInt();
        System.out.println("¿Cual es la cantidad de horas trabajadas?");
        int horas = teclad.nextInt();


    }
}
