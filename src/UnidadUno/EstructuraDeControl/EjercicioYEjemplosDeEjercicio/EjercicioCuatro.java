package UnidadUno.EstructuraDeControl.EjercicioYEjemplosDeEjercicio;

import java.util.Scanner;

public class EjercicioCuatro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("introduzca un número: ");
        int numero = scanner.nextInt();

        int factorial = 1;
        int i = 1;
        while (i <= numero) {
            factorial *= i;
            i++;
        }
        System.out.println("El factorial del numero ingresado  es: " + factorial);
        scanner.close();
    }
}
