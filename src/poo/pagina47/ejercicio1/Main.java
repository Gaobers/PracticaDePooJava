package poo.pagina47.ejercicio1;

public class Main {

    public static void main(String[] args) {

        // Creamos objetos
        Vehiculo automovil = new Automovil();
        Vehiculo barco = new Barco();
        Vehiculo avion = new Avion();

        // Aplicamos polimorfismo
        automovil.mover();
        barco.mover();
        avion.mover();
    }
}