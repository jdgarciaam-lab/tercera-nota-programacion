package UnidadUno.EstructuraDeControl.EjercicioYEjemplosDeEjercicio;

import java.util.Scanner;

public class EjemploTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione una operación colocando un numero del 1-4:");
        System.out.println("1. la operacion es suma");
        System.out.println("2. la operacion es resta");
        System.out.println("3. la operacion es multiplicar");
        System.out.println("4. la operacion es dividir");
        int opcion = scanner.nextInt();

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Error: División por cero");
                }
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
        scanner.close();
    }
    
}

