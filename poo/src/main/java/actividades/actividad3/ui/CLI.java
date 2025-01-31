package actividades.actividad3.ui;

import actividades.actividad3.process.StockManager;
import actividades.actividad3.productos.Productos;
import actividades.actividad3.process.Calculadora;

import java.util.List;
import java.util.Scanner;

public class CLI {
    private Scanner scanner;
    private StockManager stockManager;

    public CLI() {
        scanner = new Scanner(System.in);
        stockManager = new StockManager();
    }
    //* corre el programa*\
    public void runApp() {
        while (true) {
            showMenu();
            String opcion = scanner.nextLine();
            switch (opcion) {
                case "1":
                    listaProductos();
                    break;
                case "2":
                    addProduct();
                    break;
                case "3":
                    compararProductos();
                    break;
                case "4":
                    calcularPrecio();
                    break;
                case "5":
                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        }
    }
    //* muestra el menu*\
    private void showMenu() {
        System.out.println("\nMenú Principal:");
        System.out.println("1. Mostrar Stock");
        System.out.println("2. Agregar Producto");
        System.out.println("3. Comparar Productos");
        System.out.println("4. Calcular precio recomendado");
        System.out.println("5. Salir");
        System.out.print("Selecciona una opción: ");
    }

    private void listaProductos() {
        List<Productos> stock = stockManager.getStock();
        if (stock.isEmpty()) {
            System.out.println("No hay productos.");
            return;
        }
        for (Productos productos : stock) {
            System.out.println("Nombre: " + productos.getNombre() + ", Descripción: " + productos.getDescripcionString() +
                    ", Código: " + productos.getCodigo() + ", Tipo: " + productos.getTipoString() + ", Precio: " + productos.getPrecio() +
                    ", Impuesto: " + productos.getImpuesto());
        }
    }
    //* pide al usuario llenar las siguientes opciones para poder hacer su producto */
    private void addProduct() {
        try {
            System.out.print("Nombre del producto: ");
            String nombre = scanner.nextLine();
            System.out.print("Descripción: ");
            String descripcion = scanner.nextLine();
            System.out.print("Código (10 dígitos): ");
            String codigo = scanner.nextLine();
            System.out.print("Tipo de producto: ");
            String tipo = scanner.nextLine();
            System.out.print("Precio: ");
            double precio = Double.parseDouble(scanner.nextLine());

            stockManager.addProductos(nombre, descripcion, codigo, tipo, precio);
            System.out.println("Producto agregado con éxito.");
        } catch (Exception e) {
            System.out.println("Error al agregar producto: " + e.getMessage());
        }
    }

    private void compararProductos() {
        try {
            System.out.print("Ingresa el nombre del primer producto: ");
            String nombre1 = scanner.nextLine();
            System.out.print("Ingresa el nombre del segundo producto: ");
            String nombre2 = scanner.nextLine();

            Productos producto1 = stockManager.productosNombre(nombre1);
            Productos producto2 = stockManager.productosNombre(nombre2);

            if (producto1 == null || producto2 == null) {
                System.out.println("Uno o ambos productos no fueron encontrados.");
                return;
            }

            String compararResultados = Calculadora.compararProductos(producto1, producto2);
            System.out.println(compararResultados);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void calcularPrecio() {
        try {
            System.out.print("Ingresa el precio del producto: ");
            double precio = Double.parseDouble(scanner.nextLine());
            System.out.print("Ingresa el porcentaje de utilidad deseado: ");
            double profitMargin = Double.parseDouble(scanner.nextLine());
    
            // Calculla el precio con un impuesto del 16%*\
            double finalprecio = Calculadora.calcularPrecio(precio, profitMargin, 16);
            System.out.println("El precio final recomendado es: " + finalprecio);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
