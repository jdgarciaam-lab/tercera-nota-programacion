package UnidadUno.EstructuraDeControl.EjercicioYEjemplosDeEjercicio;

import java.util.Scanner;

public class EjemploTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("Seleccione el numero de la operación:");
        int opcion = scanner.nextInt();

        System.out.print("Introduzca el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduzca el segundo número: ");
        int num2 = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("El resultado es : " + (num1 + num2));
                break;
            case 2:
                System.out.println("El resultado es : " + (num1 - num2));
                break;
            case 3:
                System.out.println("El resultado es : " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("El resultado es : " + (num1 / num2));
                } else {
                    System.out.println("Error: no se puede dividr por cero");
                }
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
        scanner.close();
    }
    
}
