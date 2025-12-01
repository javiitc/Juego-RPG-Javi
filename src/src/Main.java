import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int seleccionPersonaje;
        boolean confirmacion = true;
        int confirmar ;
        Personajes pnjSeleccionado = new Personajes();


        System.out.println("=== Bienvenido al mundo de Jujutsu Kaisen ===. \n" +
                "Este mundo esta lleno de maldiciones que nacen de las malas emociones de las personas. Tu deber como hechicero es derrotar a todas las maldiciones posibles y no morir en el intento, \n" +
                "pero cuidado, hay maldiciones muy fuertes que solo un hechicero de primer grado o de grado especial podría hacerles frente. \n" +
                "Derrota a las que puedas, y espero que no te encuentres con el rey de las maldiciones, Sukuna");

        while (confirmacion) {
            System.out.println("Ahora elige un hechicero para continuar (Ten en cuenta que cada uno tiene caracteristicas y ataques unicos)");
            System.out.println("1. Satoru Gojo \n" +
                    "2. Yuta Okkotusu \n" +
                    "3. Yuji Itadori \n" +
                    "4. Toji Fushiguro");

            seleccionPersonaje = sc.nextInt();

            pnjSeleccionado.check_PJ(seleccionPersonaje);

            System.out.println( pnjSeleccionado.descripcionPersonaje + "\n" +
                    "Vida máxima: " + pnjSeleccionado.vidaPersonajes + "\n" +
                    "Energia Maldita: " + pnjSeleccionado.energiaMaldita + "\n" +
                    "Daño Ataque fisico: " + pnjSeleccionado.dmgAtaqueFisico + "\n" +
                    "Ataque especial: " + pnjSeleccionado.tecnicaEspecial + " | Daño: " + pnjSeleccionado.dmgAtaqueEspecial + "\n" +
                    "Expansión de Dominio: " + pnjSeleccionado.expansionesDominio + " | Daño: " + pnjSeleccionado.dmgExpansionDominio + "\n");

            System.out.println("Confirmar selección?");
            System.out.println("1. SI | 2. NO");

            confirmar = sc.nextInt();

            if (confirmar == 1) {
                confirmacion = false;
            }
        }

        System.out.println(pnjSeleccionado.descripcionPersonaje);
    }
}
