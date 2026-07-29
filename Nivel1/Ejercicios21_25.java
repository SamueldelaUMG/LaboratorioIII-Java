package Nivel1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicios21_25 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {

            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println(" NIVEL 1 - EJERCICIOS 21 AL 25");
            System.out.println("-----------------------------------------------");
            System.out.println("21. Crear método que valide email simple");
            System.out.println("22. Validar longitud de texto con excepción");
            System.out.println("23. Controlar error en entrada de usuario");
            System.out.println("24. Reintentar lectura si ocurre error");
            System.out.println("25. Crear pequeño menú con manejo de errores");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            try {

                opcion = entrada.nextInt();

                switch (opcion) {

                    case 21:
                        ejercicio21();
                        break;

                    case 22:
                        ejercicio22();
                        break;

                    case 23:
                        ejercicio23();
                        break;

                    case 24:
                        ejercicio24();
                        break;

                    case 25:
                        ejercicio25();
                        break;

                    case 0:
                        System.out.println("Programa finalizado.");
                        break;

                    default:
                        System.out.println("Opción no válida.");

                }

            } catch (InputMismatchException e) {

                System.out.println("Error: Debe ingresar un número.");

                entrada.nextLine();

                opcion = -1;

            }

        } while (opcion != 0);

        entrada.close();

    }

    /////////////////////////////////////////////////////////////////

    public static void validarEmail(String email) {

        if (!email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("Correo electrónico inválido.");
        }

    }

    // ===========================
    // EJERCICIOS
    // ===========================

    public static void ejercicio21() {

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Ejercicio 21");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        entrada.nextLine();

        try {

            System.out.print("Ingrese un correo electrónico: ");
            String email = entrada.nextLine();

            validarEmail(email);

            System.out.println("Correo válido.");

        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());

        }

    }

    public static void ejercicio22() {

        // Validar longitud de texto con excepción.
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Ejercicio 22");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        entrada.nextLine();
        try {
            System.out.println("Ingrese un texto");
            String texto = entrada.nextLine();
            if (texto.length() < 5) {
                throw new IllegalArgumentException("El texto debe tener al menos 5 caracteres");

            }
            System.out.println("Texto validado");
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    }

    public static void ejercicio23() {
        // Controlar error en entrada de usuario.
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Ejercicio 23");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        try {
            System.out.println("Ingrese un numero entero: ");
            int numero = entrada.nextInt();

            System.out.println("Numeero Ingresado: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("ERROR: Ingresar unicamente numeros enteros. ");
            entrada.nextLine();
        }
    }

    public static void ejercicio24() {
        // Reintentar lectura si ocurre error.
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Ejercicio 24");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        boolean datoCorrecto = false;
        do {
            try {
                System.out.println("Ingrese un numero entero: ");
                int numero = entrada.nextInt();

                System.out.println("El numero ingresado es: " + numero);
                datoCorrecto = true;
            } catch (InputMismatchException e) {
                System.out.println("ERROR: ingresar unicamente un numero entero");
                entrada.nextLine();
            }

        } while (datoCorrecto == false);
    }

    public static void ejercicio25() {

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Ejercicio 25");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        int opcion;

        do {
            try {
                System.out.println("\n Mini MENU");
                System.out.println("1. Saludar");
                System.out.println("2. Mostrar la fecha");
                System.out.println("3. Mostrar un mensaje");
                System.out.println("0. Salir");
                System.out.print("Seleccione una opción: ");
                opcion= entrada.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Hola, Bienvenido :)");
                        break;

                    case 2:
                        System.out.println("Hoy es 29 de julio de 2026");
                        break;

                    case 3:
                        System.out.println("Hola mundo");
                        break;
                    case 0:
                        System.out.println("Saliendo del menu...");
                        break;
                
                    default:
                        System.out.println("ERROR: Opcion no existe");
                }

            } catch (InputMismatchException e) {
                System.out.println("ERROR: Debe ingresar un numero. ");
                entrada.nextLine();
                opcion= -1;

            }
        } while (opcion != 0);

    }

}