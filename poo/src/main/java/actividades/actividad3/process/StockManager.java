package actividades.actividad3.process;

import actividades.actividad3.productos.Productos;

import java.util.ArrayList;
import java.util.List;
public class StockManager {
    private List<Productos> stock;

    public StockManager() {
        this.stock = new ArrayList<>();
    }
        //*impuesto de 16% */
    public void addProductos(String nombre, String descripcion, String codigo, String tipo, double precio) {
        double impuesto = precio * 0.16;
        Productos productos = new Productos(nombre, descripcion, codigo, tipo, precio, impuesto);
        stock.add(productos);
    }

    public List<Productos> getStock() {
        return stock;
    }

    public Productos productosNombre(String nombre) {
        for (Productos productos : stock) {
            if (productos.getNombre().equalsIgnoreCase(nombre)) {
                return productos;
            }
        }
        return null;
    }
}

