package ejercicios;

public class Reloj {
    int hora;
    int minuto;
    int segundo;
    public Reloj(int a, int b, int c){
        hora = a;
        minuto = b;
        segundo = c;
    }
    public void ajustarHora(int nuevaHora){
        hora = nuevaHora;
    }
    public void ajustarMinuto(int nuevoMinuto) {
        minuto = nuevoMinuto;
    }
    public void ajustarSegundo(int nuevoSegundo) {
        segundo = nuevoSegundo;
    }
    public void aumentarSegundo(){
        if (hora >= 24){
            hora = 0;
            if (minuto >=60){
                minuto = 0;
                hora++;
                if (segundo >=60) {
                    segundo = 0;
                    minuto ++;
                }
            }
        }
    }
}
