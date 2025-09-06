package UnidadUno.OperadoresAritmeticos;

import java.text.DecimalFormat;

public class EjercicioUno {
    public static void main(String[] args) {
        double precioCamiseta = 25.0;
        double precioPantalon = 30.0;

        double descuentoGeneral = 0.15;
        double descuentoAdicional = 0.05; 

        double camisetaConDescuento = precioCamiseta - (precioCamiseta * descuentoGeneral);
        double pantalonConDescuento = precioPantalon - (precioPantalon * descuentoGeneral);

        double segundaCamisetaConDescuento = camisetaConDescuento - (camisetaConDescuento * descuentoAdicional);

        double total = camisetaConDescuento + pantalonConDescuento + segundaCamisetaConDescuento;

        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Precio de la primera camiseta con descuento: $" + df.format(camisetaConDescuento));
        System.out.println("Precio del pantalón con descuento: $" + df.format(pantalonConDescuento));
        System.out.println("Precio de la segunda camiseta con descuento adicional: $" + df.format(segundaCamisetaConDescuento));
        System.out.println("Precio total a pagar: $" + df.format(total));
    }
}
    
