package actividades.actividad2.Retos.retos;

import java.util.HashMap;
import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un texto: ");
        String input = scanner.nextLine();

        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        scanner.close();

        System.out.println("Texto revertido: " + reversed);
        findFirstDuplicate(input);
    }
/*
 * reto 2
 */
    public static void findFirstDuplicate(String text) {
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            if (charIndexMap.containsKey(currentChar)) {
                int firstIndex = charIndexMap.get(currentChar);
                System.out.println("El primer carácter duplicado es '" + currentChar + "' y se duplicó en la posición " + (i));
                System.out.println("Apareció originalmente en la posición " + (firstIndex));
                return;
            } else {
                charIndexMap.put(currentChar, i);
            }
        }

        System.out.println("No hay caracteres duplicados en el texto.");
}
    /*
     * Reto 3
     */
    

        public static void findMinValue(String[] args) {
            int[] numbers = {10, 3, 5, 7, 2, 8};
    
            int mini = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < mini) {
                    mini = numbers[i];
                }
            }
            System.out.println("Lista original: " + java.util.Arrays.toString(numbers));
            System.out.println("El valor más pequeño es: " + mini);
        }
}
    

