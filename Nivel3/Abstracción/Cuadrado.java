package Nivel3.Abstracción;

//EJERCICIO 3
//Crear clase cuadrado
public class Cuadrado extends Figura { /// si no llenas nada, te da error, porque cuadrado tiene la obligacion de
                                       /// cumplir con lo que heredo

    private double lado;
    // EJERCICIO 4
    // Implementar metodo area.

    public Cuadrado(double lado) {   //constructor que se ejecuta cuando creamos objeto con new
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

}
