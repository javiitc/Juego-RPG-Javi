import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int seleccionPersonaje = sc.nextInt();

        System.out.println("=== Bienvenido al mundo de Jujutsu Kaisen ===. \n" +
                "Este mundo esta lleno de maldiciones que nacen de las malas emociones de las personas. Tu deber como hechicero es derrotar a todas las maldiciones posibles y no morir en el intento, \n" +
                "pero cuidado, hay maldiciones muy fuertes que solo un hechicero de primer grado o de grado especial podría hacerles frente. \n" +
                "Derrota a las que puedas, y espero que no te encuentres con el rey de las maldiciones, Sukuna");
        System.out.println("Ahora elige un hechicero para continuar (Ten en cuenta que cada uno tiene caracteristicas y ataques unicos)");
        System.out.println("1. Satoru Gojo \n" +
                "2. Yuta Okkotusu \n" +
                "3. Yuji Itadori \n" +
                "4. Toji Fushiguro");

        seleccionPersonaje = sc.nextInt();

        Personajes pnjSeleccionado = new Personajes();

        pnjSeleccionado.check_PJ(pnjSeleccionado.);
    }
}
