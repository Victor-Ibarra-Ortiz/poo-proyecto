package actividades.actividad1.models;
/**
 * numero de puertas que puede tener el carro de 2 a 5
 */
public class Car {
    private String modelo;
    private String marca;
    private int numeroPuertas;
    private String color;

    @Override
    public String toString(){
        return "Car{" +
        "modelo='" + modelo + '\'' +
        ", marca='" + marca + '\'' +
        ", numeroPuertas=" + numeroPuertas +
        ", color='" + color + '\'' +
        '}';
    }

    public Car(String modelo, String marca, int numeroPuertas, String color){
        this.modelo = modelo;
        this.marca = marca;
        this.numeroPuertas = numeroPuertas;
        this.color = color;
    }
    /**
     * @param numeroPuertas Aqui se valida el número de puertas del carro creado
     * @throws IllegalArgumentException si el número de puertas es menor a 2 o mayor a 5
    */

    public int getNumeroPuertas(){
        return numeroPuertas;
    }
    
    public void setNumeroPuertas(int numeroPuertas){
        if (numeroPuertas < 2 || numeroPuertas > 5){
            throw new IllegalArgumentException("El numero de puertas debe ser mayor a 2 y menor a 5");
        }
        this.numeroPuertas = numeroPuertas;
    }
    /**
     * 
     * 
    */
    public String getModelo(){return modelo; }
    public void setModelo(String modelo){this.modelo = modelo; }

    public String getMarca(){return marca; }
    public void setMarca(String marca){this.marca = marca; }

    public String getColor(){return color; }
    public void setColor(String color){this.color = color; }
}
