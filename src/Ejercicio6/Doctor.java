package Ejercicio6;

public class Doctor implements Profesion {

    // Implementamos el metodo
    @Override
    public void calcularSueldo() {

        double sueldo = 1200.00;

        System.out.println("El sueldo del doctor es: $" + sueldo);
    }
}