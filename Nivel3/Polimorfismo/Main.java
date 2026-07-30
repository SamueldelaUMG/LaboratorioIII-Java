package Nivel3.Polimorfismo;

public class Main {

    public static void main(String[] args) {
        Animal[] animales = new Animal[3];

        animales[0] = new Perro();
        animales[1] = new Gato();
        animales[2] = new Animal();

        //EJERCICIO 4
        //RECORRER LISTA Y EJECUTAR METODO
        for(int i=0; i<animales.length; i++){
            animales[i].sonido();
        }



        //ejercicio 5
        Animal animal1= new Perro();
        Animal animal2= new Gato();

        animal1.sonido();
        animal2.sonido();
    }

}
