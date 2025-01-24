package actividades.actividad2.ui;

import actividades.actividad2.process.NameValidator;

import actividades.actividad2.process.NumberGenerator;

import java.util.Scanner;

public class CLI {

    public static void showMenu(){
        System.out.println("\n Menu:");
        System.out.println("1. Validar nombre"); 
        System.out.println("2. Genera numeros pares");
        System.out.println("3. Salir");      
    }

    public static void runApp(){
        showMenu();
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        scanner.nextLine();
        while(option != 3){
            switch(option){
                /*
                 * Validar nombre que este en la base de datos
                 */
                case 1:
                    System.out.println("Ingresa un nombre: ");
                    String name = scanner.nextLine();
                    if(NameValidator.validateName(name)){
                        System.out.println("-El nombres si esta en la base de datos-");
                    }else{
                        System.out.println("-Nombre no esta en la base de datos-");
                    }
                                        break;
                                case 2:
                                /*
                                 * Generar numeros pares de 0 al 100
                                 */
                                    System.out.println("Los numeros pares de 0 al 100: ");
                                    NumberGenerator.generadorNumeros();
                                    break;
                                default:
                                    System.out.println("Opción no válida ");
                                    break;
                            }
                            showMenu();
                            option = scanner.nextInt();
                            scanner.nextLine();
                        }
                        scanner.close();
                    }
                }
