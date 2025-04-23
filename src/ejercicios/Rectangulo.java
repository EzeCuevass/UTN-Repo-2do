
package ejercicios;

public class Rectangulo {
    double ancho;
    double alto;
    
    public Rectangulo(double a, double b){
        ancho = a;
        alto = b;
    }
    public double area(){
        double arearect = ancho*alto;
        return arearect;
    }
    public double perimetro(){
        return (alto*2 + ancho*2);
    }
    public boolean esCuadrado(){
        return alto==ancho;
    }
}
