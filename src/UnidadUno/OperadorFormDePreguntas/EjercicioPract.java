package UnidadUno.OperadorFormDePreguntas;

import java.util.Scanner;

public class EjercicioPract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 < num3) {
            System.out.println(" El primer número (" + num1 + ") es mayor que el segundo (" + num2 + ") y menor que el tercero (" + num3 + ").");
        }
         else {
            System.out.println(" La condición no se cumple.");
        }

        sc.close();
    }
    
}
