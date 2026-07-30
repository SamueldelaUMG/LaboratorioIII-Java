package Nivel2.Ejercicios21_25;

public class Main {

    public static void main(String[] args) {
        // EJERCICIO 25
        // CREAR VARIOS OBJETOS

        Empleado[] empleados = new Empleado[3];

        empleados[0] = new Empleado();
        empleados[1] = new Empleado();
        empleados[2] = new Empleado();

        empleados[0].setNombre("Samuel");
        empleados[0].setSalario(5500);

        empleados[1].setNombre("Maria");
        empleados[1].setSalario(5000);

        empleados[2].setNombre("Carlos");
        empleados[2].setSalario(4500);

        for(int i= 0; i< empleados.length; i++){
            empleados[i].mostrarDatos();
            System.out.println("------------------");
        }

    }

}
