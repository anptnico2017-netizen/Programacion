package Producto;

public class Prodeslinea {
    public String nombre;
    public double precio;
    String categoria;
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
    }
    public void mostrarPrecio() {
        System.out.println("Precio: " + precio);
    }
    void mostrarCategoria() {System.out.println("Categoria: "+categoria);}

}
