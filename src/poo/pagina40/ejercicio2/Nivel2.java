package poo.pagina40.ejercicio2;
import java.util.Scanner;

class Nivel2 {

    public int puntaje;
    private String respuesta;
    private final String[] animales;
    private final Scanner ent;

    public Nivel2() {
        puntaje = 0;
        ent = new Scanner(System.in);

        animales = new String[4];
        animales[0] = "leon";
        animales[1] = "vaca";
        animales[2] = "conejo";
        animales[3] = "pato";
    }

    private void puntajeLeon() {
        if (respuesta.equals(animales[0])) {
            System.out.println("¡Correcto! Has ganado 20 puntos");
            puntaje += 20;
        } else {
            System.out.println("¡Incorrecto! La respuesta es: " + animales[0]);
            System.out.println("Has perdido 10 puntos");
            puntaje -= 10;
        }
    }

    private void puntajeVaca() {
        if (respuesta.equals(animales[1])) {
            System.out.println("¡Correcto! Has ganado 20 puntos");
            puntaje += 20;
        } else {
            System.out.println("¡Incorrecto! La respuesta es: " + animales[1]);
            System.out.println("Has perdido 10 puntos");
            puntaje -= 10;
        }
    }

    private void puntajeConejo() {
        if (respuesta.equals(animales[2])) {
            System.out.println("¡Correcto! Has ganado 20 puntos");
            puntaje += 20;
        } else {
            System.out.println("¡Incorrecto! La respuesta es: " + animales[2]);
            System.out.println("Has perdido 10 puntos");
            puntaje -= 10;
        }
    }

    private void puntajePato() {
        if (respuesta.equals(animales[3])) {
            System.out.println("¡Correcto! Has ganado 20 puntos");
            puntaje += 20;
        } else {
            System.out.println("¡Incorrecto! La respuesta es: " + animales[3]);
            System.out.println("Has perdido 10 puntos");
            puntaje -= 10;
        }
    }

    public void imprimePreguntas() {
        System.out.println("¿Es el rey de la selva?");
        respuesta = ent.nextLine();
        puntajeLeon();

        System.out.println("¿Es un animal que da leche?");
        respuesta = ent.nextLine();
        puntajeVaca();

        System.out.println("¿Es un animal que come zanahorias?");
        respuesta = ent.nextLine();
        puntajeConejo();

        System.out.println("¿Es un animal que hace cuac?");
        respuesta = ent.nextLine();
        puntajePato();
    }
}
