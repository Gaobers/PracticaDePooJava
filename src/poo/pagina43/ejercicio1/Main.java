package poo.pagina43.ejercicio1;

class IntegranteSeleccion {
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;

    public IntegranteSeleccion(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public void concentrarse() {
        System.out.println(nombre + " se concentra");
    }

    public void viajar() {
        System.out.println(nombre + " viaja");
    }
}

class Futbolista extends IntegranteSeleccion {
    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void jugarPartido() {
        System.out.println(nombre + " juega el partido");
    }

    public void entrenar() {
        System.out.println(nombre + " entrena");
    }
}

class Entrenador extends IntegranteSeleccion {
    private String idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido() {
        System.out.println(nombre + " dirige el partido");
    }

    public void dirigirEntrenamiento() {
        System.out.println(nombre + " dirige el entrenamiento");
    }
}

class Masajista extends IntegranteSeleccion {
    private String titulacion;
    private int aniosExperiencia;

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public void darMasaje() {
        System.out.println(nombre + " da un masaje");
    }
}

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