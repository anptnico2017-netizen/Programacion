package Producto;

public class MainProdes {
    static void main() {
        Prodes silla=new Prodes();
        Prodes mesa=new Prodes();
        Prodes comida=new Prodes();
        silla.nombre="SILLA";
        silla.precio=35;
        silla.categoria="BUENO";
        mesa.nombre="MESA";
        mesa.precio=40;
        mesa.categoria="REGULAR";
        comida.nombre="COMIDA";
        comida.precio=100;
        comida.categoria="EXCELENTE";
        silla.mostrarInformacion();
        silla.mostrarCategoria();
        mesa.mostrarInformacion();
        mesa.mostrarCategoria();
        comida.mostrarInformacion();
        comida.mostrarCategoria();
    }
}
