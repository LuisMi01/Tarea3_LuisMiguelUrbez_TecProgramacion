package ejercicio4;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cual es tu tipo de carne? (1 - vacuno, 2 - cordero)");
        int carne = teclado.nextInt();
        System.out.println("¿Cuantos gramos de carne quieres?");
        int gramos = teclado.nextInt();
        System.out.println("¿Cual es el grado de cocinado? (1 - casi cruda, 2 - al punto, 3 - Bien hecho)");
        int cocinado = teclado.nextInt();

        if (carne == 1){

        }

        if (carne == 2){}


        public void calcularTiempos(){
            double tiempoBase = 10;
            int misgramos = gramos;
            int gramosBase = 500;
            double tiempo;
            if (cocinado == 1){
                tiempo = ((misgramos*tiempoBase) / gramosBase);
                System.out.println("El tiempo para la carne casi cruda es de " + tiempo + " minutos");
            } else if (cocinado == 2) {
                double tiempo2 = ((misgramos*tiempoBase) / gramosBase) * 1.66;
                System.out.println("El tiempo para la carne al punto es de " + tiempo2 + " minutos");
            }else if (cocinado == 2) {
                double tiempo3 = (((misgramos*tiempoBase) / gramosBase) * 1.66)*1.66;
                System.out.println("El tiempo para la carne bien hecha es de " + tiempo3 + " minutos");
            }

            }





        }

    }
}
