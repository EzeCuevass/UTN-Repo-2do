package ejercicios;

public class CuentaBancaria {
    private double saldo;
    private String titular;
    private int numeroDeCuenta;
    
    public CuentaBancaria(double a, String b, int c){
        saldo = a;
        titular = b;
        numeroDeCuenta = c;
    }
    
    public double cargar(int carga){
        saldo = saldo + carga;
        return saldo;
    }
    public double retirar(int retiro){
        if (retiro <= saldo){
            saldo = saldo - retiro;
        } else {
            System.out.println("Error al retirar dinero, saldo insuficiente");
        }
        return saldo;
    }
    public double getSaldo(){
        return saldo;
    }
}
