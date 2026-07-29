package Nivel1;

import java.util.Scanner;

import javax.sound.midi.MidiUnavailableException;

import java.util.InputMismatchException;

public class Ejercicios11_20 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {

            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println(" NIVEL 1 - EJERCICIOS 11 AL 20");
            System.out.println("-----------------------------------------------");
            System.out.println("11. Leer arreglo y capturar índice fuera de rango");
            System.out.println("12. Manejar múltiples excepciones");
            System.out.println("13. Usar throw manualmente");
            System.out.println("14. Crear excepción personalizada simple");
            System.out.println("15. Lanzar excepción personalizada");
            System.out.println("16. Validar que texto no esté vacío");
            System.out.println("17. Manejar error al acceder a charAt");
            System.out.println("18. Validar división segura con método");
            System.out.println("19. Validar número mayor a 100");
            System.out.println("20. Simular error controlado con throw");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = entrada.nextInt();

            switch (opcion) {

                case 11:
                    ejercicio11();
                    break;

                case 12:
                    ejercicio12();
                    break;

                case 13:
                    ejercicio13();
                    break;

                case 14:
                    ejercicio14();
                    break;

                case 15:
                    ejercicio15();
                    break;

                case 16:
                    ejercicio16();
                    break;

                case 17:
                    ejercicio17();
                    break;

                case 18:
                    ejercicio18();
                    break;

                case 19:
                    ejercicio19();
                    break;

                case 20:
                    ejercicio20();
                    break;

                case 0:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        entrada.close();

    }

    public static void ejercicio11() {
        // Leer arreglo y capturar índice fuera de rango.
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Ejercicio 11");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        int[] numeros = { 10, 20, 30, 40, 50 };
        try {
            System.out.println("Ingrese un indice de arreglos (0 a 4): ");
            int indice = entrada.nextInt();

            System.out.println("El valor de la posicion " + indice + " es: " + numeros[indice]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR: El indice esta fuera de rango del arreglo");
        }

    }

    public static void ejercicio12() {
        // Manejar múltiples excepciones (catch múltiples).
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Ejercicio 11");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        try {
            System.out.println("Ingrese su edad: ");
            int edad = entrada.nextInt();

            if (edad < 0) {
                throw new IllegalArgumentException("La edad no puede ser negativa. ");
            }

            System.out.println("Edad valida: " + edad + " años");
        } catch (InputMismatchException e) {
            System.out.println("ERROR: Ingresar unicamente numeros enteros. ");
            entrada.nextLine();

        } catch (IllegalArgumentException e) {
            System.out.println("EROOR: " + e.getMessage());
        }

    }

    public static void ejercicio13() {
        // Usar throw manualmente.
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Ejercicio 13");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        try {
            System.out.println("Ingrese un numero entero PAR. ");
            int numero = entrada.nextInt();

            if (numero % 2 != 0) {
                throw new IllegalArgumentException("El numero debe ser par. ");

            }
            System.out.println("El numero " + numero + " ha sido validado");
        } catch (InputMismatchException e) {
            System.out.println("ERROR: Ddebe ingresar un numero entero");
            entrada.nextLine();
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    }

    public static void ejercicio14() {
        // Crear excepción personalizada simple.

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Ejercicio 14");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        System.out.println("La excepción personalizada fue creada correctamente.");
        System.out.println("Se utilizará en el ejercicio 15.");

    }

    public static void ejercicio15() {
        // Lanzar excepción personalizada.
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Ejercicio 15");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        try {
            System.out.println("Ingrese una nota: ");
            int nota = entrada.nextInt();

            validarNota(nota);
            System.out.println("Nota valida");

        } catch (InputMismatchException e) {
            System.out.println("ERROR: Ingresar unicamente un numero entero. ");
            entrada.nextLine();
        } catch (MiExcepcion e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    }

    public static void ejercicio16() {
        // Validar que texto no esté vacío.
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Ejercicio 16");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        entrada.nextLine();

        try {
            System.out.println("Ingrese un texto: ");
            String texto = entrada.nextLine();

            if (texto.trim().isEmpty()) {
                throw new IllegalArgumentException("El texto no puede estar vacio. ");

            }
            System.out.println("Texto validad: " + texto);
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());

        }

    }

    public static void ejercicio17() {
        // Manejar error al acceder a charAt.
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Ejercicio 17");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        entrada.nextLine();
        try {
            System.out.println("Ingrese un palabra: ");
            String palabra = entrada.nextLine();

            System.out.println("Ingrese la posicion que desea consultar: ");
            int posicion = entrada.nextInt();

            char letra = palabra.charAt(posicion);
            System.out.println("El caracter es: " + letra);

        } catch (InputMismatchException e) {
            System.out.println("ERROR:  Ingresar unicamente un numero entero");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("ERROR: la posicione seleccionada no existe");

        }

    }

    public static void ejercicio18() {
        // Validar división segura con método.
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Ejercicio 18 (DIVIDIR SEGURO)");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        try {
            System.out.println("Ingrese el primer numero");
            double numero1 = entrada.nextDouble();
            System.out.println("ingrese el segundo numero : ");
            double numero2 = entrada.nextDouble();

            double resultado = dividirSeguro(numero1, numero2);
            System.out.println("RESULTADO: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("ERROR: Ingresar unicamente numeros");
            entrada.nextLine();

        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    }

    public static void ejercicio19() {
        // Validar número mayor a 100.

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Ejercicio 19");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        try {
            System.out.println("Ingrese un numero mayor que 100: ");
            int numero = entrada.nextInt();

            if (numero <= 100) {
                throw new IllegalArgumentException("El numero debe ser mayor que 100. ");

            }
            System.out.println("Numero validado: " + numero);

        } catch (InputMismatchException e) {
            System.out.println("ERROR: Debe de ingresar un numero entero. ");
            entrada.nextLine();

        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public static void ejercicio20() {
        // Simular error controlado con throw.
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Ejercicio 20");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        try{
            System.out.println("Iniciando proceso...");
            throw new Exception("Se produjo un error controlado. ");

        }catch (Exception e){
            System.out.println("ERROR: "+e.getMessage());
        }

    }

    //////////////////////////////////////////////////////////
    /// Metodo para validar nota
    public static void validarNota(int nota) throws MiExcepcion {
        if (nota < 0 || nota > 100) {
            throw new MiExcepcion("La nota debe estar entre 0 y 100. ");
        }
    }

    //////////////////////////////////////////////////////////
    /// metodo del ejercicio 18
    public static double dividirSeguro(double numero1, double numero2) {
        if (numero2 == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero ");
        }
        return numero1 / numero2;

    }

}

class MiExcepcion extends Exception {
    public MiExcepcion(String mensaje) {
        super(mensaje);
    }
}
