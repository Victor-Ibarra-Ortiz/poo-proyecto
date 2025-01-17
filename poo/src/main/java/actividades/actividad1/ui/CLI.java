package actividades.actividad1.ui;

import actividades.actividad1.process.StockManager;

import java.util.Scanner;

public class CLI {
    /**
     * Inicia la aplicacion
     */

    public static void runApp(){
        Scanner scanner = new Scanner(System.in);
        StockManager stockManager = new StockManager();
        showMenu();
        int opcion = scanner.nextInt(); scanner.nextLine();
    /**
     * 1. Agregar carro al catalogo
     * pedira al usuario el numero de puertas, color, modelo y marca del carro
     * El modelo se refiere al año del carro
     * La marca se refiere a la empresa del carro
     */

while (opcion != 3){
    switch (opcion){
        case 1:
            System.out.println("ingrese el numero de puertas del carro");
            int numeroPuertas = scanner.nextInt();scanner.nextLine();
            System.out.println("ingrese el color del carro");
            String color = scanner.nextLine();
            System.out.println("ingrese el modelo del carro");
            String modelo = scanner.nextLine();
            System.out.println("ingrese la marca del carro");
            String marca = scanner.nextLine();
            stockManager.addCar(modelo, marca, numeroPuertas, color);
            break;
        case 2:
        stockManager.printStok();
        break;
        default:
        System.out.println("opcion no valida");

    }
    showMenu();
    opcion = scanner.nextInt();
}
    /**
     * 2. Muestra el menu
     */
    }
    public static void showMenu(){
            System.out.println("""
            1. Agregar carro al catalogo
            2. Mostrar catalogo
            3. Salir
          """);
        }
    }