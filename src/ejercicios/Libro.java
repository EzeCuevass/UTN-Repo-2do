package ejercicios;

public class Libro {
    String titulo;
    String autor;
    int numeroDePaginas;
    int paginaActual;
    public Libro(String a, String b, int c, int d){
        titulo = a;
        autor = b;
        numeroDePaginas = c;
        paginaActual = d;
    }
    public void avanzarPagina(){
        if (paginaActual <= numeroDePaginas){
            paginaActual++;
        } else {
            System.out.println("No se puede avanzar mas paginas");
        }
    }
    public void retrocederPagina(){
        if (paginaActual >= numeroDePaginas){
            paginaActual = paginaActual -1;
        } else {
            System.out.println("No se puede retroceder mas paginas");
        }
    }
    public boolean libroTerminado(){
        if (paginaActual == numeroDePaginas){
            return true;
        } else {
            return false;
        }
    }
}
