package ejercicio5;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner teclad = new Scanner(System.in);
        System.out.println("\n¿Apellido del empleado?");
        String apellido = teclad.nextLine();
        System.out.println("\n¿Cual es el nombre del empleado?");
        String nombre = teclad.nextLine();
        System.out.println("\n¿Cual es el puesto del empleado?\n" +
                "1. Agente de servicio\n" +
                "2. Empleado de oficina\n" +
                "3. Directivo\n");
        String puesto = teclad.next();
        System.out.println("\n¿Cual es la cantidad de horas trabajadas?");
        int horas = teclad.nextInt();
        System.out.println("\n¿Cual es la tarifa horária?");
        double tarifa = teclad.nextInt();
        System.out.println("\nNúmero de hijos:");
        int hijos = teclad.nextInt();

        System.out.println("======================================");
        System.out.println("Nomina de: " + nombre + " " + apellido);
        System.out.println("Estado: " + puesto);
        System.out.println("Salario bruto: ");
        salarioBruto(horas, tarifa);
        System.out.println("======================================");

    }

    public static void salarioBruto(int horas, double tarifa) {

        double salarioBruto = 0;
        if (horas <= 169){
            salarioBruto = horas * tarifa;
            System.out.println(salarioBruto + " €");
            System.out.println("Total de: " + horas + " horas sin incremento");
        } else if (horas > 169 && horas <180) {
            int horasExtra = horas - 169;
            salarioBruto = (horasExtra * tarifa * 1.5) + (169 * tarifa);
            System.out.println(salarioBruto + " €");
            System.out.println("Total de: " + horasExtra + " horas con incremento del 50% y " + (horas - horasExtra) + " horas sin incremento");
        } else if (horas >= 180) {
            int horasExtraSuperiores = horas - 180;
            int horasExtra = (horas - 169) - horasExtraSuperiores;

            salarioBruto = (horasExtraSuperiores * tarifa * 1.6)+(horasExtra * tarifa * 1.5) + (169 * tarifa);
            System.out.println(salarioBruto + " €");
            System.out.println("Total de: " + horasExtraSuperiores + " horas con incremento del 60%, " + horasExtra + " horas con incremento del 50% y " + (horas - horasExtra - horasExtraSuperiores) + " horas sin incremento");
        }
    }

    public static void calculoDeducciones(double salarioBruto, int hijos){
        System.out.println("Calculo de contribuciones:\n");

        
    }






}














