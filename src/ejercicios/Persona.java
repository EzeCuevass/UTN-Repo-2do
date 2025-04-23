package ejercicios;
import java.util.Scanner;

public class Persona {
    String nombre;
    int edad;
    double altura;
    
    public Persona(String a, int b, double c){
        nombre = a;
        edad = b;
        altura = c;
    }
    public boolean esMayordeEdad(){
        if (edad>=18){
            return true;
        } else {
            return false;
        }
    }
    public double calcularIMC(){
        System.out.println("Introduce tu peso en kilos: ");
        Scanner input = new Scanner(System.in);
        int peso = input.nextInt();
        double imc = peso / (Math.pow(altura, 2));
        return imc;
    }
}
