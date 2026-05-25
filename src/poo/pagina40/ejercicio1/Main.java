package poo.pagina40.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Animal perro = new Animal("Max", 1, 4);

        System.out.println("Nombre: " + perro.getNombre());
        System.out.println("Orden: " + perro.getOrden());
        System.out.println("Extremidades: " + perro.getExtremidades());
    }
}
