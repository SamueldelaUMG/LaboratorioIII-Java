package Nivel2.Ejercicios6_10;

public class Cuenta {
    //EJERCICIO 6
    //Crear clase Cuenta con saldo privado.
    private double saldo;


    //EJERCICIO 7
    //Crear método depositar.
    public void depositar(double cantidad){
        saldo = saldo + cantidad;
        System.out.println("Deposito realizado correctamente: Q." + cantidad);
    }

    //EJERCICIO8 yparte 9
    //Crear método retirar con validación.
    public void retirar(double cantidad){
        if(cantidad > 0 && cantidad<=saldo){
            saldo = saldo - cantidad;
            System.out.println("Retiro realizado correctamente:  Q."+cantidad);
        }else{
            System.out.println("ERROR: No es posible realizar el retiro de: Q."+ cantidad);

        }

    }
    public void mostrarSaldo(){
        System.out.println("Saldo actual: Q."+saldo);
    }
    
}
