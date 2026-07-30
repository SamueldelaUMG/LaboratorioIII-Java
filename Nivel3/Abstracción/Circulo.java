package Nivel3.Abstracción;

public class Circulo extends Figura {
    //EJERCICIO 5
    //Crear clase circulo

    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    public double area(){
        return Math.PI * radio*radio;
    }


}
