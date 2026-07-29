package Nivel2.Ejercicios6_10;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta();
        cuenta1.mostrarSaldo();
        cuenta1.depositar(500);
        cuenta1.mostrarSaldo();
        cuenta1.retirar(200);
        cuenta1.mostrarSaldo();
        cuenta1.retirar(0);
        cuenta1.mostrarSaldo();
        cuenta1.retirar(400);
        cuenta1.mostrarSaldo();
    }
    
}
