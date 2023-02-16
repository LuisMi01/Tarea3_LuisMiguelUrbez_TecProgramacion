package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la temperatura");
        double temperatura = teclado.nextInt();

        if (temperatura < 2.0) {
            System.out.println("riesgo de hielo");
        } else if (temperatura < 15.0) {
            System.out.println("hace frío");
        } else if (temperatura < 30.0) {
            System.out.println("Buena temperatura");
        } else if (temperatura >= 45.0) {
            System.out.println("Demasiado calor");
        }
    }
}
