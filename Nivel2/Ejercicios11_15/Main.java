package Nivel2.Ejercicios11_15;

public class Main {
    public static void main(String[] args) {
        Producto[] productos = new Producto[3];

        productos[0] = new Producto();
        productos[0].setNombre("Teclado Gamer");
        productos[0].setPrecio(150);

        productos[1] = new Producto();
        productos[1].setNombre("Teclado Mecánico");
        productos[1].setPrecio(350);

        productos[2] = new Producto();
        productos[2].setNombre("Monitor");
        productos[2].setPrecio(1200);

        for(int i=0; i<productos.length; i++){
            productos[i].mostrarProducto();
            System.out.println("--------------------------");
        }
    }


}
