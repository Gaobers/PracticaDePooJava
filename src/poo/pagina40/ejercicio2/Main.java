package poo.pagina40.ejercicio2;

public class Main {
    public static void main(String[] args) {
        Nivel1 obj = new Nivel1();
        Nivel2 obj2 = new Nivel2();

        obj.imprimePreguntas();
        obj2.imprimePreguntas();

        System.out.println("//***************MARCADOR***************\\");
        System.out.println("Nivel 1");
        System.out.println("Tu puntaje es: " + obj.puntaje);

        System.out.println("Nivel 2");
        System.out.println("Tu puntaje es: " + obj2.puntaje);

        System.out.println("Puntaje acumulado: " + (obj.puntaje + obj2.puntaje));
    }
}