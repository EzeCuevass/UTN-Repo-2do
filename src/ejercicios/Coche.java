package ejercicios;


public class Coche {
    String marca;
    String modelo;
    int kilometraje;
    double combustibleRestante;
    public Coche(String a, String b, int c, double d){
        marca = a;
        modelo = b;
        kilometraje = c;
        combustibleRestante = d;
    }
    public double kilometrosRestantes(double consumo){
        int kilometros = 0;
        double consumido = 0;
        while (consumido<=combustibleRestante){
            consumido = consumido +consumo;
            kilometros++;
        }
        return kilometros;
    }
    public void recargar(double carga){
        combustibleRestante = combustibleRestante + carga;
    }
}
