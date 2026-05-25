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
