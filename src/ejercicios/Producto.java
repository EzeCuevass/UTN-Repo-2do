package ejercicios;

public class Producto {
   String nombre;
   double precio;
   int cantidadEnStock;
   public Producto(String a, double b, int c){
       nombre = a;
       precio = b;
       cantidadEnStock = c;
   }
   public double hacerDescuento(int descuento){
       return ((descuento/100)*precio);
   }
   public void venderProducto(int cantidad){
       if (cantidad < cantidadEnStock){
           cantidadEnStock = cantidadEnStock - cantidad;
           System.out.println("Venta Exitosa!");
       } else{
           System.out.println("Stock Insuficiente");
       }
   }
}
