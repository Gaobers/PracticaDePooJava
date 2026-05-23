package Ejercicio5;

public class Empleado extends Personal {

    // Sobrescribimos metodo registrar
    @Override
    public void registrar() {
        System.out.println("Empleado registrado correctamente");
    }

    // Sobrescribimos metodo calcularSueldo
    @Override
    public void calcularSueldo() {
        double sueldo = 600.00;
        System.out.println("El sueldo del empleado es: $" + sueldo);
    }
}