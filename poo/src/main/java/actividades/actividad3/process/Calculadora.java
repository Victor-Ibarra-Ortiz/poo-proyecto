package actividades.actividad3.process;

import actividades.actividad3.productos.Productos;

public class Calculadora {
    public static double calcularPrecio(double price, double profitMargin, double taxRate) {
        if (price < 0 || profitMargin < 0 || taxRate < 0) {
            throw new IllegalArgumentException("Ingrese numeros positivos.");
        }
        double priceWithProfit = price + (price * (profitMargin / 100));
        double tax = priceWithProfit * (taxRate / 100);
        double finalPrice = priceWithProfit + tax;
        return finalPrice;
    }

    public static double calcularPrecioTotal(Productos productos) {
        if (productos == null) {
            throw new IllegalArgumentException("Debe llenar el espacio.");
        }
        return productos.getPrecio() + productos.getImpuesto();
    }

    public static String compararProductos(Productos producto1, Productos producto2) {
        if (producto1 == null || producto2 == null) {
            throw new IllegalArgumentException("Ambos productos no deben de estar vacios.");
        }

        double precio1 = calcularPrecioTotal(producto1);
        double precio2 = calcularPrecioTotal(producto2);

        if (precio1 > precio2) {
            return "El primer producto es más caro.";
        } else if (precio1 < precio2) {
            return "El segundo producto es más caro.";
        } else {
            return "Ambos productos tienen el mismo precio.";
        }
    }
}