package UnidadUno.EntradaySalida.EjerciciosEjemplosDeEjercicios;

import java.util.Scanner;

public class ProyectoMini {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar los números al usuario
        System.out.print("Ingrese el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double num3 = sc.nextDouble();

        // Calcular la media
        double media = (num1 + num2 + num3) / 3;

        // Mostrar el resultado
        System.out.println("\nLa media de los tres números es: " + media);

        sc.close();
    }
}
