package ejercicios;

public class Circulo {
    double radio;
    double pi = 3.14159265;
    
    public Circulo(double a){
        radio = a;
    }
    public double area(){
        return (Math.pow(radio, 2)*pi);
    }
    public double circunferencia(){
        return (2*radio*pi);
    }
    public void escalar(double porcentaje){
        radio = radio * (1 + porcentaje/100);
    }
}
