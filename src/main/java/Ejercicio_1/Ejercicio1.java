package Ejercicio_1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la temperatura");

        double temperatura = teclado.nextInt();
        if (temperatura < 2.0) {
            System.out.println("riesgo de hielo");
        }

    }
}
