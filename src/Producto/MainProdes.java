package Producto;

public class MainProdes {
    static void main() {
        Prodeslinea silla=new Prodeslinea();
        Prodeslinea mesa=new Prodeslinea();
        Prodeslinea comida=new Prodeslinea();
        silla.nombre="SILLA";
        silla.precio=35;
        silla.categoria="BUENO";
        mesa.nombre="MESA";
        mesa.precio=40;
        mesa.categoria="REGULAR";
        comida.nombre="COMIDA";
        comida.precio=100;
        comida.categoria="EXCELENTE";
        System.out.println("---PRODUCTOS DE TIENDA EN LINEA---");
        System.out.println("--PRODUCTO 1 SILLAS--");
        silla.mostrarInformacion();
        silla.mostrarPrecio();
        silla.mostrarCategoria();
        System.out.println("--PRODUCTO 2 MESAS--");
        mesa.mostrarInformacion();
        mesa.mostrarPrecio();
        mesa.mostrarCategoria();
        System.out.println("--PRODUCTO 3 COMIDAS--");
        comida.mostrarInformacion();
        comida.mostrarPrecio();
        comida.mostrarCategoria();
    }
}
