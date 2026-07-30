package Nivel3.Interfaces;

import Nivel3.Abstracción.Circulo;
import Nivel3.Abstracción.Cuadrado;
import Nivel3.Abstracción.Figura;

public class Main {
    //EJERCICIO 1
    //Usar varias figuras en lista

    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(5);
        System.out.println("AREA: " + cuadrado.area()+ " unidades cuadradas");

        Figura figura = new Cuadrado(10);
        System.out.println("AREA: "+ figura.area()+ " unidades cuadrados");

        //calcular area con polimorfismo
        //EJERCICIO 2
  


        ////////////////////////////////////////////////////////////////////////
        Vehiculo vehiculo1 = new Carro();
        Vehiculo vehiculo2 = new Moto();
        vehiculo1.acelerar();
        vehiculo2.acelerar();

    }

}
