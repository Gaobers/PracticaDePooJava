package poo.pagina43.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Futbolista futbolista = new Futbolista(1, "Lionel", "Messi", 36, 10, "Delantero");
        Entrenador entrenador = new Entrenador(2, "Pep", "Guardiola", 53, "FED123");
        Masajista masajista = new Masajista(3, "Carlos", "Ramírez", 45, "Fisioterapia", 15);

        System.out.println("========== FUTBOLISTA ==========");
        System.out.println("Nombre completo: " + futbolista.nombre + " " + futbolista.apellidos);
        futbolista.concentrarse();
        futbolista.jugarPartido();
        futbolista.entrenar();

        System.out.println("\n========== ENTRENADOR ==========");
        System.out.println("Nombre completo: " + entrenador.nombre + " " + entrenador.apellidos);
        entrenador.viajar();
        entrenador.dirigirPartido();
        entrenador.dirigirEntrenamiento();

        System.out.println("\n========== MASAJISTA ==========");
        System.out.println("Nombre completo: " + masajista.nombre + " " + masajista.apellidos);
        masajista.concentrarse();
        masajista.darMasaje();
    }
}