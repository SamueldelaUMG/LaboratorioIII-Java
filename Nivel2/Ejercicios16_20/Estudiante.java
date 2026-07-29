package Nivel2.Ejercicios16_20;

//EJERCICIO 16
//Crear clase Estudiante.
public class Estudiante {
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if (nota1 >= 0 && nota1 <= 100) {
            this.nota1 = nota1;
        } else {
            System.out.println("ERROR: La nota debe estar entre 0 y 100. ");
        }
    }
    //////////////////////////////////////

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if (nota2 >= 0 && nota2 <= 100) {
            this.nota2 = nota2;
        } else {
            System.out.println("ERROR: La nota debe estar entre 0 y 100. ");
        }
    }

    //////////////////////////////////
    ///
    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        if (nota3 >= 0 && nota3 <= 100) {
            this.nota3 = nota3;
        } else {
            System.out.println("ERROR: La nota debe estar entre 0 y 100. ");
        }
    }
    //////////////////////////////////
    ///
    ///

    /// EJERCICIO 18
    /// CALCULAR PROMEDIO
    public double calcularPromedio() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public void mostrarResultado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Promedio: " + calcularPromedio());
    }

}
