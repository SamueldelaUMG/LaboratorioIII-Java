package Nivel2.Ejercicios1_5;

public class Persona {

    //EJERCICIO 1
    //Crear clase Persona con atributos privados.

    private String nombre;
    private int edad;

    
    //EJERCICIO 2
    // Crear getters y setters.
    public String getNombre(String nombre){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad(int edad){
        return edad;
    }

    //EJERCICIO 3
    // Validar edad en setter.
    public void setEdad(int edad){
        if(edad>=0){
            this.edad = edad;
        }else{
            System.out.println("ERROR: La edad no puede ser negativa. ");
        }
    }
    //// Ejercicio 4
    /// Crear constructor básico.
    public Persona(String nombre, int edad){
        this.nombre= nombre;
        setEdad(edad);
    }

    //EJERCICIO 5
    //Metodo para mostrar datos
    public void mostrarDatos(){
        System.out.println("");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("");
    }

}
