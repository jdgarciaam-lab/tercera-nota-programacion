package UnidadUno.EstructuraDeControl.EjercicioYEjemplosDeEjercicio;

public class EjercicioDos {
    public static void main(String[] args) {
         
        int contador = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                contador++;
            }
        }
        System.out.println("El total de numeros pares que se hay entre 1 y 100 es; "+contador);
    }
}