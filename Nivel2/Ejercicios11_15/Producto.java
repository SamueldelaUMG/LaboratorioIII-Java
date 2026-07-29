package Nivel2.Ejercicios11_15;

public class Producto {

    // EJERCICIO 11
    private String nombre;
    private double precio;

    // EJERCICIO 12
    // Encapsular precio.

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        // EJERCICIO 13
        // this.precio = precio;
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("ERROR: El precio debe ser mayor a 0");
        }

    }



    // EJERCICIO 14
    // Crear método mostrar producto.
    public void mostrarProducto() {
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Precio: Q."+precio);
    }
}
 