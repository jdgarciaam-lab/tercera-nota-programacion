package UnidadUno.EstructuraDeControl.EjercicioYEjemplosDeEjercicio;

import java.util.Scanner;

public class EjercicioCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("introduzca un número: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        scanner.close();
    }
}
