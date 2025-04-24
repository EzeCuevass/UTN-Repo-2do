package ejercicios;

public class Pelota {
    String marca;
    double circunferencia;
    
    public Pelota(String a, double b){
        marca = a;
        circunferencia = b;
    }
    public boolean compararPelotas(Pelota pelota2){
        if (circunferencia == pelota2.circunferencia){
            return true;
        } else { 
            return false;
        }
    }
    public void inflarPelota(double aumento) {
        circunferencia = circunferencia + aumento;
    }
}

