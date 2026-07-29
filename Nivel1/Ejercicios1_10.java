package Nivel1;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Ejercicios1_10
 */
public class Ejercicios1_10 {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {

            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println(" NIVEL 1 - EJERCICIOS 1 AL 10");
            System.out.println("-----------------------------------------------");
            System.out.println("1. Capturar excepción al dividir entre cero");
            System.out.println("2. Validar entrada numérica con try-catch");
            System.out.println("3. Manejar error al convertir texto a número");
            System.out.println("4. Mostrar mensaje personalizado en excepción");
            System.out.println("5. Usar finally para mostrar mensaje final");
            System.out.println("6. Validar número positivo");
            System.out.println("7. Lanzar excepción si el número es negativo");
            System.out.println("8. Manejar excepción en un método");
            System.out.println("9. Validar edad");
            System.out.println("10. Validar contraseña");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;

                case 3:
                    ejercicio3();
                    break;

                case 4:
                    ejercicio4();
                    break;

                case 5:
                    ejercicio5();
                    break;

                case 6:
                    ejercicio6();
                    break;

                case 7:
                    ejercicio7();
                    break;

                case 8:
                    ejercicio8();
                    break;

                case 9:
                    ejercicio9();
                    break;

                case 10:
                    ejercicio10();
                    break;
                case 0:
                    System.out.println("Programa finalizado");
                    break;

                default:
                    System.out.println("Opcion  no valida");
                    break;
            }

        } while (opcion != 0);
        entrada.close();
    }

    public static void ejercicio1() {
        // Capturar excepción al dividir entre cero.
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Ejercicio 1");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        int numero1 = 10;
        int numero2 = 0;
        try {
            int resultado = numero1 / numero2;
            System.out.println("Resultado: " + numero1 + " / " + numero2 + " = " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir entre cero");
        }

    }

    public static void ejercicio2() {

        // Validar entrada numérica con try-catch.
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Ejercicio 2");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        try {
            System.out.println("Ingrese un numero entero: ");
            int numero = entrada.nextInt();

            System.out.println("El numero que ingreso fue: " + numero);

        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar solamente numeros enteros. ");
            entrada.nextLine();
        }

    }

    public static void ejercicio3() {
        // Manejar error al convertir texto a número.
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Ejercicio 2");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        try {
            System.out.println("Ingrese un numero: ");
            String texto = entrada.next();

            int numero = Integer.parseInt(texto);
            System.out.println("String convertido a int: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Error: El texto ingresado no es numero valido. ");
        }

    }

    public static void ejercicio4() {
        // Mostrar mensaje personalizado en excepción.
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Ejercicio 4");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        try {
            int numero1 = 20;
            int numero2 = 0;
            int resultado = numero1 / numero2;
            System.out.println("Resultoado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("UPSI... Ocurrio un error :(");
            System.out.println("No se puede dividir entre 0  >:(");
            System.out.println("Verifique los datos que ha ingreado. ");
        }

    }

    public static void ejercicio5() {
        // Usar finally para mostrar mensaje final.
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Ejercicio 5");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        try {
            int n1 = 15;
            int n2 = 0;
            int resultado = n1 / n2;
            System.out.println("Resultado" + resultado);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Error: No se puede dividir entre 0");

        } finally {
            System.out.println("Fin del ejercicio 5.    :)");
        }

    }

    public static void ejercicio6() {
        // Pedir número y validar que sea positivo (con excepción).
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Ejercicio 6");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        try {
            System.out.println("Ingrese un numero positivo: ");
            int numero = entrada.nextInt();
            if (numero < 0) {
                throw new Exception("El numero no puede ser negativo. ");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }
    }

    public static void ejercicio7() {
        // Crear método que lance excepción si número es negativo.
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Ejercicio 7");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        try {
            System.out.println("Ingrese un numero: ");
            int numero = entrada.nextInt();

            validarNumero(numero);
            System.out.println("Numero valido: " + numero);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static void ejercicio8() {
        // Manejar excepción en método.
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Ejercicio 8 (Validar si el segundo numero no es 0)");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        try {
            System.out.println("Ingrese el primer numero ");
            double n1 = entrada.nextInt();

            System.out.println("Ingrese el segundo numero: ");
            double n2 = entrada.nextInt();
            double resultado = dividir(n1, n2);
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static void ejercicio9() {

        // Validar edad (no negativa).
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Ejercicio 9");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        try {
            System.out.println("Ingrese su edad: ");
            int edad = entrada.nextInt();
            if (edad < 0) {
                throw new IllegalArgumentException("La edad no puede ser negativa >:(");

            }
            System.out.println("Edad: " + edad + " años");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());

        }
    }

    public static void ejercicio10() {
        // Validar contraseña mínima (usar excepción).
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Ejercicio 10");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        try{
            System.out.println("Ingrese una contraseña ");
            String contraseña = entrada.next();
            if(contraseña.length()<8){
                throw new IllegalArgumentException("La contraseña debe tener al menos 8 caracteres. ");
            }
            System.out.println("Contraseña definida. ");
        }catch(IllegalArgumentException e){
            System.out.println("Error: "+ e.getLocalizedMessage());


        }

    }

    public static void validarNumero(int numero) {
        throw new IllegalArgumentException("El numero no puede ser negativo. ");
    }

    public static double dividir(double n1, double n2) {
        if (n2 == 0) {
            throw new ArithmeticException("No se puede dividir entre cero. ");

        }
        return n1 / n2;
    }
}