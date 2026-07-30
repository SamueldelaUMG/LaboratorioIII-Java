package Nivel3.Herencia;

public class Main {

    public static void main(String[] args) {

        Perro perro = new Perro();

        perro.nombre = "Firulais";
        perro.edad = 4;
        perro.sonido();

        System.out.println("Nombre: " + perro.nombre);
        System.out.println("Edad: " + perro.edad);

    }

}