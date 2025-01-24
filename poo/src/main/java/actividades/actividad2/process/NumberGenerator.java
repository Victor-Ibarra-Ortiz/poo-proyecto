package actividades.actividad2.process;

import java.util.ArrayList;

public class NumberGenerator {
    /*
     * Genera los numeros pares de 0 al 100
     */
    public static void generadorNumeros() {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for (int i=0; i<=100; i+=2){
            lista.add(i);
            }
        System.out.print(lista);
        }
    }

