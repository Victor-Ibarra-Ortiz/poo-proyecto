package actividades.actividad1.process;

import actividades.actividad1.models.Car;

import java.util.ArrayList;

public class StockManager{
    ArrayList<Car> stock;

    public StockManager() {
        this.stock = new ArrayList<>();
    }
/**
     Genera un onjeto con los datos del carro y se agrega a un catalogo
        @param modelo año del carro
        @param marca empresa del carro
        @param numeroPuertas
        @param color
        */
    
    public void addCar(String modelo, String marca, int numeroPuertas, String color){
        Car car= new Car(modelo, marca, numeroPuertas, color);
        stock.add(car);
    }
    /**
     * Imprime el catalogo de carros
     */
    public void printStok(){
        System.out.print("Catalogo de carros");
        System.out.println(stock);
    }
}