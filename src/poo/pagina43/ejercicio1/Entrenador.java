package poo.pagina43.ejercicio1;

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