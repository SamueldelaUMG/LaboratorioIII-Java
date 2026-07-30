package Nivel3.Abstracción;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(5);

        System.out.println("Area del cuadrado: "+ cuadrado.area()+" unidades cuadradas");


        Circulo circulo = new Circulo(5);
        System.out.println("Area del circulo: "+ circulo.area() + " unidades cuadradas");
    }
    
}
