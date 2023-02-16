package ejercicio5;

import java.sql.SQLOutput;
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
        salarioBruto(horas, tarifa, hijos);
        System.out.println("======================================");



    }

    public static double salarioBruto(int horas, double tarifa, int hijos) {


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


        System.out.println("Calculo de contribuciones:\n");

        System.out.println("Contribución para el pago de la deuda social y contingencias comunes imponible:");
        double deduccion1 = salarioBruto * 0.0349;
        System.out.println(salarioBruto + " * 3.49 % = " + deduccion1 + " €\n");

        System.out.println("Contribución de contingencias comunes no imponible:");
        double deduccion2 = salarioBruto * 0.0615;
        System.out.println(salarioBruto + " * 6.15 % = " + deduccion2 + " €\n");

        System.out.println("Seguro médico privado:");
        double deduccion3 = salarioBruto * 0.0095;
        System.out.println(salarioBruto + " * 0.95 % = " + deduccion3 + " €\n");

        System.out.println("Fondo de pensiones");
        double deduccion4 = salarioBruto * 0.0844;
        System.out.println(salarioBruto + " * 8.44 % = " + deduccion4 + " €\n");

        System.out.println("Seguro de desempleo");
        double deduccion5 = salarioBruto * 0.0305;
        System.out.println(salarioBruto + " * 3.05 % = " + deduccion5 + " €\n");

        System.out.println("Pensión complementaria (Entidad privada)");
        double deduccion6 = salarioBruto * 0.0381;
        System.out.println(salarioBruto + " * 3.81 % = " + deduccion6 + " €\n");

        System.out.println("Contribución de jubilación anticipada");
        double deduccion7 = salarioBruto * 0.0102;
        System.out.println(salarioBruto + " * 1.02 % = " + deduccion7 + " €\n");

        double deduccionTotal = deduccion1 + deduccion2 + deduccion3 + deduccion4 + deduccion5 + deduccion6 + deduccion7;
        System.out.println("Deducciones totales del empleado: " + deduccionTotal + " €\n");

        System.out.println("Salario neto: " + (salarioBruto - deduccionTotal) + " €\n");
        calculoHijos(hijos);

        double salarioNeto = salarioBruto - deduccionTotal + calculoHijos(hijos);
        System.out.println("Salario neto a pagar: " + salarioNeto + " €\n");

        return 0;
    }


    public static double calculoHijos(int hijos){
        if (hijos == 1){
            int deduccionHijos = 20;
            System.out.println("Prima familiar: " + deduccionHijos + " €\n");
        } else if (hijos == 2){
            int deduccionHijos = 50;
            System.out.println("Prima familiar: " + deduccionHijos + " €\n");
        } else if (hijos >2) {
            int deduccionHijos = 70 + (hijos - 2) * 20;
            System.out.println("Prima familiar: " + deduccionHijos + " €\n");
        }
        return 0;
    }





}














