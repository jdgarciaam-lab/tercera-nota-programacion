package UnidadUno.EntradaySalida;

import java.util.Scanner;

public class EjercicioPractico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        System.out.print("Ingrese su altura en metros (ejemplo 1.75): ");
        double altura = sc.nextDouble();

        System.out.println("\n--- Datos Personales ---");
        System.out.println("Hola " + nombre + ", tienes " + edad + " años y mides " + altura + " metros.");

        sc.close();
    }
    
}
