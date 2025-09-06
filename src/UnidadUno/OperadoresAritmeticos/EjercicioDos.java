package UnidadUno.OperadoresAritmeticos;

public class EjercicioDos {
    public static void main(String[] args) {
        // Dinero inicial en la cuenta
        double saldoInicial = 1000.0;

        // Cantidad a retirar cada semana
        double retiroSemanal = 200.0;

        // Número de semanas en un mes (4 semanas)
        int semanas = 4;

        // Cálculo del saldo final después de los retiros
        double saldoFinal = saldoInicial - (retiroSemanal * semanas);

        // Mostrar resultados
        System.out.println("Saldo inicial: $" + saldoInicial);
        System.out.println("Retiro semanal: $" + retiroSemanal);
        System.out.println("Número de semanas: " + semanas);
        System.out.println("Saldo final lurgo de un mes: $" + saldoFinal);
    }
}
