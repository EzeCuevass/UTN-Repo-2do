package ejercicios;

public class Termometro {
    double temperatura;
    public Termometro(double a){
        temperatura = a;
    }
    public double celciusAFahrenheit(){
    return ((temperatura * 9/5)+32);
}
    public double fahrenheitACelcius(){
    return ((temperatura -32)*5/9);
}
    public void aumentarODisminuir(double grados){
        temperatura = temperatura + grados;
    }
}
