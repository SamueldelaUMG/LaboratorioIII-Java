package Nivel2.Ejercicios16_20;

public class Main {
    public static void main(String[] args) {
        
        Estudiante estudiante = new Estudiante();

        estudiante.setNombre("Samuel");
        estudiante.setNota1(90);
        estudiante.setNota2(80);
        estudiante.setNota3(100);
        estudiante.mostrarResultado();
        System.out.println("");
        System.out.println("");


        Estudiante estudiante2 = new Estudiante();

        estudiante2.setNombre("Samuel");
        estudiante2.setNota1(90);
        estudiante2.setNota2(80);
        estudiante2.setNota3(200);
        estudiante2.mostrarResultado();
    }    
}
