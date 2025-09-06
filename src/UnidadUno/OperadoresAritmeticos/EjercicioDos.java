package UnidadUno.OperadoresAritmeticos;

public class EjercicioDos {
    public static void main(String[] args) {
        double saldoInicial = 1000.0;

        double retiroSemanal = 200.0;

        int semanas = 4;

        double saldoFinal = saldoInicial - (retiroSemanal * semanas);

        System.out.println("Saldo inicial: $" + saldoInicial);
        System.out.println("Retiro semanal: $" + retiroSemanal);
        System.out.println("Número de semanas: " + semanas);
        System.out.println("Saldo final lurgo de un mes: $" + saldoFinal);
    }
}
