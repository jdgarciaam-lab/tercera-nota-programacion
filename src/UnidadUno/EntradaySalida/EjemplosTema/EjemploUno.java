package UnidadUno.EntradaySalida.EjemplosTema;

import java.util.Scanner;

public class EjemploUno {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");
        scanner.close();
    }
}
    

