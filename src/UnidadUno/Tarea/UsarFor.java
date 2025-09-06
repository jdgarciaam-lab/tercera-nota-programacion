package UnidadUno.Tarea;

import java.util.Scanner;

public class UsarFor {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] marcas = new String[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese la marca del carro #" + (i + 1) + ": ");
            marcas[i] = sc.nextLine();
        }

        System.out.println("\n--- Marcas ingresadas ---");
        for (int i = 0; i < 3; i++) {
            System.out.println("Carro #" + (i + 1) + ": " + marcas[i]);
        }
        sc.close();
     }
    
}
