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
        Personajes [] enemigos = new Personajes[3];
        enemigos [0] = new Personajes("Segundo Grado");
        enemigos [1] = new Personajes("Primer Grado");
        enemigos [2] = new Personajes("Sukuna");
        int enemigoAleatorio = random.nextInt(3);
        Personajes enemigoAzar = enemigos[enemigoAleatorio];

        String [] objetos = {"Ritual Inverso Maldito", "Bendición de Utahime", "Potenciador de Utahime y el director Gakuganji", "Ritual Inverso Maldito (energía maldita)"};


        System.out.println("=== Bienvenido al mundo de Jujutsu Kaisen ===. \n" +
                "Este mundo esta lleno de maldiciones que nacen de las malas emociones de las personas. Tu deber como hechicero es exorcizar a todas las maldiciones posibles y no morir en el intento, \n" +
                "Ahora mismo esta ocurriendo un incidente en Shibuya, las maldiciones están atacando la ciudad, y se necesitan a todos los hechiceros posibles para arreglar la situación. \n" +
                "Exorciza a todas las maldiciones que puedas, y cuidado con el rey de las maldiciones, Sukuna");

        while (confirmacion) {
            System.out.println("Ahora elige un hechicero para continuar (Ten en cuenta que cada uno tiene caracteristicas y ataques unicos)");
            System.out.println("1. Satoru Gojo \n" +
                    "2. Yuta Okkotusu \n" +
                    "3. Yuji Itadori \n" +
                    "4. Toji Fushiguro");

            seleccionPersonaje = sc.nextInt();

            pnjSeleccionado.check_PJ(seleccionPersonaje);

            System.out.println( pnjSeleccionado.descripcionPersonaje + "\n" +
                    "------------------------------------------------------- \n" +
                    "Vida máxima: " + pnjSeleccionado.vidaPersonajes + "\n" +
                    "Energia Maldita: " + pnjSeleccionado.energiaMaldita + "\n" +
                    "Daño Ataque fisico: " + pnjSeleccionado.dmgAtaqueFisico + "\n" +
                    "Ataque especial: " + pnjSeleccionado.tecnicaEspecial + " | Daño: " + pnjSeleccionado.dmgAtaqueEspecial + "\n" +
                    "Expansión de Dominio: " + pnjSeleccionado.expansionesDominio + " | Daño: " + pnjSeleccionado.dmgExpansionDominio + "\n" +
                    "Daño de golpe crítico: " + (int) pnjSeleccionado.multiplicadorCritico);

            System.out.println("-------------------------------------------------------");
            System.out.println("Confirmar selección?");
            System.out.println("1. SI | 2. NO");

            confirmar = sc.nextInt();

            if (confirmar == 1) {
                confirmacion = false;
            }
        }

        int [] iteraccion = {pnjSeleccionado.dmgAtaqueFisico, pnjSeleccionado.dmgAtaqueEspecial, pnjSeleccionado.dmgExpansionDominio, (int) pnjSeleccionado.multiplicadorCritico};

        System.out.println(pnjSeleccionado.nombre + " , tu deber es exorcizar a todas las maldiciones posibles que hay ahora mismo en Shibuya, de segundo o primer grado, e incluso al rey de las maldiciones \n" +
                          "(si es que logras derrotarlo) en caso de que te encuentres con él. Buena suerte!");

        while (true) {
            System.out.println("\n" + "Has llegado a Shibuya, mientras observas la situación y te adentras en la ciudad, y se ha puesto en tu camino" + enemigoAzar.nombre);
            System.out.println("=====" + enemigoAzar.nombreBatalla + "=====");
            System.out.println("PS: " + enemigoAzar.vidaPersonajes);
            System.out.println("========================" + pnjSeleccionado.nombre + "========================");
            System.out.println("PS: " + pnjSeleccionado.vidaPersonajes + " | Energia Maldita: " + pnjSeleccionado.energiaMaldita);
            System.out.println("1. Ataque Fisico \n" +
                               "2. Técnica especial: " + pnjSeleccionado.tecnicaEspecial + "\n" +
                               "3. Expansión de dominio: " + pnjSeleccionado.expansionesDominio + "\n" +
                               "4. Abrir inventario" + "\n" +
                               "5. Rendirse");
            break;
        }

    }
}
