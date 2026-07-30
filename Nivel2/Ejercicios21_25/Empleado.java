package Nivel2.Ejercicios21_25;

public class Empleado {

    //EJERCICIO 21
    private String nombre;
    private double salario;

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        //Validar salario positivo.
        //EJERCICIO 23
        if(salario >0){
            this.salario = salario;
        }else{
            System.out.println("ERROR: El salario debe ser mayor que cero. ");
        }
    }

//EJERCICIO 24
//Mostrar datos
    public void mostrarDatos(){
        System.out.println("Nombre del empleado: "+ nombre);
        System.out.println("Salario: Q."+ salario);
    }

    
}
