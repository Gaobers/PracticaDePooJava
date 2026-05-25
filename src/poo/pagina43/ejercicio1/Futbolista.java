package poo.pagina43.ejercicio1;

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