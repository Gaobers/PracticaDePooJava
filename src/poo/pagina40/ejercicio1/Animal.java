package poo.pagina40.ejercicio1;

class Animal{
    private String nombre;
    private int orden;
    private int extremidades;

    public Animal(String aNombre, int aOrden, int aExtremidades){
        nombre = aNombre;
        orden = aOrden;
        extremidades = aExtremidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public int getExtremidades() {
        return extremidades;
    }

    public void setExtremidades(int extremidades) {
        this.extremidades = extremidades;
    }
}