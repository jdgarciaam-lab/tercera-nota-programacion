package UnidadUno.OperadoresAritmeticos;

import java.text.DecimalFormat;

public class EjercicioUno {
    public static void main(String[] args) {
        // Precios originales
        double precioCamiseta = 25.0;
        double precioPantalon = 30.0;

        // Descuentos
        double descuentoGeneral = 0.15; // 15%
        double descuentoAdicional = 0.05; // 5% adicional en la segunda camiseta

        // Precios con descuento general
        double camisetaConDescuento = precioCamiseta - (precioCamiseta * descuentoGeneral);
        double pantalonConDescuento = precioPantalon - (precioPantalon * descuentoGeneral);

        // Segunda camiseta con el 5% adicional
        double segundaCamisetaConDescuento = camisetaConDescuento - (camisetaConDescuento * descuentoAdicional);

        // Total a pagar
        double total = camisetaConDescuento + pantalonConDescuento + segundaCamisetaConDescuento;

        // Formateo para mostrar solo 2 decimales
        DecimalFormat df = new DecimalFormat("#.00");

        // Mostrar resultados
        System.out.println("Precio de la primera camiseta con descuento: $" + df.format(camisetaConDescuento));
        System.out.println("Precio del pantalón con descuento: $" + df.format(pantalonConDescuento));
        System.out.println("Precio de la segunda camiseta con descuento adicional: $" + df.format(segundaCamisetaConDescuento));
        System.out.println("Precio total a pagar: $" + df.format(total));
    }
}
    
