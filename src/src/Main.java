import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int seleccionPersonaje;
        boolean confirmacion = true;
        int confirmar;
        int eleccionBatalla;
        int ataqueEnemigo;
        int dmgEnemigo;
        int dineroGanado;
        boolean juego = true;
        boolean pelea = true;

        Personajes pnjSeleccionado = new Personajes();
        Personajes[] enemigos = new Personajes[3];
        enemigos[0] = new Personajes("Segundo Grado");
        enemigos[1] = new Personajes("Primer Grado");
        enemigos[2] = new Personajes("Sukuna");
        int enemigoAleatorio = random.nextInt(3);
        Personajes enemigoAzar = enemigos[enemigoAleatorio];


        String[] objetos = {"Ritual Inverso Maldito", "Bendición de Utahime", "Potenciador de Utahime y el director Gakuganji", "Dedo de Sukuna"};


        System.out.println("=== Bienvenido al mundo de Jujutsu Kaisen ===. \n" +
                "Este mundo esta lleno de maldiciones que nacen de las malas emociones de las personas. Tu deber como hechicero es exorcizar a todas las maldiciones posibles y no morir en el intento, \n" +
                "Ahora mismo esta ocurriendo un incidente en Shibuya, las maldiciones están atacando la ciudad, y se necesitan a todos los hechiceros posibles para arreglar la situación. \n" +
                "Exorciza a todas las maldiciones que puedas, y cuidado con el rey de las maldiciones, Sukuna");

        while (juego) {
            while (confirmacion) {
                System.out.println("Ahora elige un hechicero para continuar (Ten en cuenta que cada uno tiene caracteristicas y ataques unicos)");
                System.out.println("1. Satoru Gojo \n" +
                        "2. Yuta Okkotusu \n" +
                        "3. Yuji Itadori \n" +
                        "4. Toji Fushiguro");

                seleccionPersonaje = sc.nextInt();

                pnjSeleccionado.check_PJ(seleccionPersonaje);

                System.out.println(pnjSeleccionado.descripcionPersonaje + "\n" +
                        "------------------------------------------------------- \n" +
                        "Vida máxima: " + pnjSeleccionado.vidaPersonajes + "\n" +
                        "Energia Maldita: " + pnjSeleccionado.energiaMaldita + "\n" +
                        "Daño Ataque fisico: " + pnjSeleccionado.dmgAtaqueFisico + "\n" +
                        "Técnica Maldita: " + pnjSeleccionado.tecnicaEspecial + " | Daño: " + pnjSeleccionado.dmgAtaqueEspecial + "\n" +
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


            int[] iteraccion = {pnjSeleccionado.dmgAtaqueFisico, pnjSeleccionado.dmgAtaqueEspecial, pnjSeleccionado.dmgExpansionDominio, (int) pnjSeleccionado.multiplicadorCritico};
            int[] iteraccionEnemigo = {enemigoAzar.dmgAtaqueFisico, (int) enemigoAzar.multiplicadorCritico};

            System.out.println(pnjSeleccionado.nombre + " , tu deber es exorcizar a todas las maldiciones posibles que hay ahora mismo en Shibuya, de segundo o primer grado, e incluso al rey de las maldiciones \n" +
                    "(si es que logras derrotarlo) en caso de que te encuentres con él. Buena suerte!");
            System.out.println("\n" + "Has llegado a Shibuya, mientras observas la situación y te adentras en la ciudad, se ha puesto en tu camino" + enemigoAzar.nombre);

            while (pelea) {
                System.out.println("=====" + enemigoAzar.nombreBatalla + "=====");
                System.out.println("PS: " + enemigoAzar.vidaPersonajes);
                System.out.println("====== " + pnjSeleccionado.nombre + " ======");
                System.out.println("PS: " + pnjSeleccionado.vidaPersonajes + " | Energia Maldita: " + pnjSeleccionado.energiaMaldita);
                System.out.println("1. Ataque Fisico \n" +
                        "2. Técnica maldita: " + pnjSeleccionado.tecnicaEspecial + "\n" +
                        "3. Expansión de dominio: " + pnjSeleccionado.expansionesDominio + "\n" +
                        "4. Potenciar golpe con energia Maldita (critico)" + "\n" +
                        "5. Abrir inventario" + "\n" +
                        "6. Dominio Simple: Bloqueo" + "\n" +
                        "7. Rendirse");

                eleccionBatalla = sc.nextInt();

                switch (eleccionBatalla) {
                    case 1:
                        System.out.println("Has atacado al enemigo!");
                        enemigoAzar.vidaPersonajes -= pnjSeleccionado.dmgAtaqueFisico;

                        ataqueEnemigo = random.nextInt(2);
                        dmgEnemigo = iteraccionEnemigo[ataqueEnemigo];
                        if (ataqueEnemigo == 0) {
                            System.out.println(enemigoAzar.nombreBatalla + "te ha hecho un ataque directo!");
                            pnjSeleccionado.vidaPersonajes -= enemigoAzar.dmgAtaqueFisico;
                            System.out.println("Daño recibido: " + dmgEnemigo);
                        } else {
                            System.out.println(enemigoAzar.nombreBatalla + "ha potenciado su ataque con energía maldita y te ha hecho un golpe crítico");
                            pnjSeleccionado.vidaPersonajes -= (int) enemigoAzar.multiplicadorCritico;
                            System.out.println("Daño recibido: " + dmgEnemigo);
                        }
                        break;

                    case 2:
                        System.out.println("Tecnica Maldita: " + pnjSeleccionado.tecnicaEspecial + " ha hecho un impacto directo!");
                        enemigoAzar.vidaPersonajes -= pnjSeleccionado.dmgAtaqueEspecial;
                        pnjSeleccionado.energiaMaldita -= 30;

                        ataqueEnemigo = random.nextInt(2);
                        dmgEnemigo = iteraccionEnemigo[ataqueEnemigo];
                        if (ataqueEnemigo == 0) {
                            System.out.println(enemigoAzar.nombreBatalla + "te ha hecho un ataque directo!");
                            pnjSeleccionado.vidaPersonajes -= enemigoAzar.dmgAtaqueFisico;
                            System.out.println("Daño recibido: " + dmgEnemigo);
                        } else {
                            System.out.println(enemigoAzar.nombreBatalla + "ha potenciado su ataque con energía maldita y te ha hecho un golpe crítico");
                            pnjSeleccionado.vidaPersonajes -= (int) enemigoAzar.multiplicadorCritico;
                            System.out.println("Daño recibido: " + dmgEnemigo);
                        }
                        break;

                    case 3:
                        System.out.println("Expansion de Dominio: " + pnjSeleccionado.expansionesDominio);
                        System.out.println(enemigoAzar.nombreBatalla + "ha sido encerrado en tu Expansion de dominio y ha recibido un daño descomunal!");
                        enemigoAzar.vidaPersonajes -= pnjSeleccionado.dmgExpansionDominio;
                        pnjSeleccionado.energiaMaldita -= 50;

                        ataqueEnemigo = random.nextInt(2);
                        dmgEnemigo = iteraccionEnemigo[ataqueEnemigo];
                        if (ataqueEnemigo == 0) {
                            System.out.println(enemigoAzar.nombreBatalla + "te ha hecho un ataque directo!");
                            pnjSeleccionado.vidaPersonajes -= enemigoAzar.dmgAtaqueFisico;
                            System.out.println("Daño recibido: " + dmgEnemigo);
                        } else {
                            System.out.println(enemigoAzar.nombreBatalla + " ha potenciado su ataque con energía maldita y te ha hecho un golpe crítico");
                            pnjSeleccionado.vidaPersonajes -= (int) enemigoAzar.multiplicadorCritico;
                            System.out.println("Daño recibido: " + dmgEnemigo);
                        }
                        break;

                    case 4:
                        System.out.println("Has usado Energia Maldita para potenciar el golpe!");
                        enemigoAzar.vidaPersonajes -= (int) pnjSeleccionado.multiplicadorCritico;
                        System.out.println("El enemigo ha recibido: " + pnjSeleccionado.multiplicadorCritico + " de daño!");
                        pnjSeleccionado.energiaMaldita -= 20;

                        ataqueEnemigo = random.nextInt(2);
                        dmgEnemigo = iteraccionEnemigo[ataqueEnemigo];
                        if (ataqueEnemigo == 0) {
                            System.out.println(enemigoAzar.nombreBatalla + " te ha hecho un ataque directo!");
                            pnjSeleccionado.vidaPersonajes -= enemigoAzar.dmgAtaqueFisico;
                            System.out.println("Daño recibido: " + dmgEnemigo);
                        } else {
                            System.out.println(enemigoAzar.nombreBatalla + " ha potenciado su ataque con energía maldita y te ha hecho un golpe crítico");
                            pnjSeleccionado.vidaPersonajes -= (int) enemigoAzar.multiplicadorCritico;
                            System.out.println("Daño recibido: " + dmgEnemigo);
                        }
                        break;

                    case 5:
                        System.out.println("==== Inventario ====");
                        boolean tieneObjetos = false;

                        for (int i = 0; i < pnjSeleccionado.inventario.length; i++) {
                            if (pnjSeleccionado.inventario[i] != null) {
                                System.out.println((i + 1) + ". " + pnjSeleccionado.inventario[i]);
                                tieneObjetos = true;
                            }
                        }

                        if (!tieneObjetos) {
                            System.out.println("Tu inventario está vacío");
                        } else {
                            System.out.println("Selecciona un objeto para usar (o 0 para salir):");
                            int seleccionObjeto = sc.nextInt();

                            if (seleccionObjeto > 0 && seleccionObjeto <= pnjSeleccionado.inventario.length) {

                                int eleccionInventario = seleccionObjeto - 1;

                                if (pnjSeleccionado.inventario[eleccionInventario] != null) {
                                    System.out.println("Has usado: " + pnjSeleccionado.inventario[eleccionInventario]);

                                    if (pnjSeleccionado.inventario[eleccionInventario] == objetos[0]) {
                                        System.out.println("Has usado el Ritual Inverso Maldito para recuperar salud");
                                        pnjSeleccionado.vidaPersonajes += 80;
                                        if (pnjSeleccionado.vidaPersonajes > pnjSeleccionado.vidaMaxima) {
                                            System.out.println("Has recuperado el máximo de vida");
                                        }
                                    } else if (pnjSeleccionado.inventario[eleccionInventario] == objetos[1]) {
                                        System.out.println("Has recibido la bendición de Utahime, tu daño fisico y de técnica Maldita ha aumentado!");
                                        pnjSeleccionado.dmgAtaqueFisico += 25;
                                        pnjSeleccionado.dmgAtaqueEspecial += 15;
                                    } else if (pnjSeleccionado.inventario[eleccionInventario] == objetos[2]) {
                                        System.out.println("El director Gakuganji y Utahime te estan ayudando con sus rituales! Tu daño fisico, de técnica Maldita y de la expansión de dominio ha aumentado considerablemente!");
                                        pnjSeleccionado.dmgAtaqueFisico += 50;
                                        pnjSeleccionado.dmgAtaqueEspecial += 40;
                                        pnjSeleccionado.dmgExpansionDominio += 35;
                                    } else if (pnjSeleccionado.inventario[eleccionInventario] == objetos[3]) {
                                        System.out.println("Has consumido un dedo de Sukuna! Tu energia maldita ha sido recuperada en su totalidad");
                                        pnjSeleccionado.energiaMaldita = pnjSeleccionado.energiaMalditaMax;
                                    }

                                    pnjSeleccionado.inventario[eleccionInventario] = null;
                                }
                            }
                        }
                        break;

                    case 6:
                        System.out.println("Has hecho uso del Dominio Simple para bloquear el ataque enemigo");

                        ataqueEnemigo = random.nextInt(2);
                        dmgEnemigo = iteraccionEnemigo[ataqueEnemigo];
                        if (ataqueEnemigo == 0) {
                            System.out.println(enemigoAzar.nombreBatalla + " te ha hecho un ataque directo!");
                            System.out.println("Debido al Dominio Simple no has recibido daño.");
                        } else {
                            System.out.println(enemigoAzar.nombreBatalla + " ha potenciado su ataque con energía maldita y te ha hecho un golpe crítico");
                            System.out.println("Debido al Dominio Simple no has recibido daño.");
                        }
                        break;

                    case 7:
                        System.out.println("Has decidido retirarte de la batalla y la maldición se ha ido a por ciudadanos inocentes.");
                        pnjSeleccionado.yenes -= 3;
                        break;
                }

                if (enemigoAzar.vidaPersonajes <= 0) {
                    pelea = false;
                    dineroGanado = random.nextInt(6);
                    pnjSeleccionado.yenes += dineroGanado;
                    System.out.println("Has logrado exorcizar a la maldición! \n" +
                            "Has obtenido " + dineroGanado + " yenes \n" +
                            "Ahora, puedes pasar por la tienda antes de seguir exorcizando maldiciones.");
                    System.out.println("1. Siguiente batalla");
                    System.out.println("2. Ir a la tienda de objetos");

                    int eleccionFinDePelea = sc.nextInt();

                    if (eleccionFinDePelea == 1) {
                        pelea = true;
                    } else {
                        Tienda.tiendaObjetos(pnjSeleccionado, objetos);
                        pelea = true;
                    }

                    pnjSeleccionado.vidaPersonajes += (pnjSeleccionado.vidaMaxima / 3);
                    if (pnjSeleccionado.vidaPersonajes > pnjSeleccionado.vidaMaxima) {
                        pnjSeleccionado.vidaPersonajes = pnjSeleccionado.vidaMaxima;
                    }
                    pnjSeleccionado.energiaMaldita += (pnjSeleccionado.energiaMalditaMax / 2);
                    if (pnjSeleccionado.energiaMaldita > pnjSeleccionado.energiaMalditaMax) {
                        pnjSeleccionado.energiaMaldita = pnjSeleccionado.energiaMalditaMax;
                    }
                    enemigoAleatorio = random.nextInt(3);
                    enemigoAzar = enemigos[enemigoAleatorio];
                    enemigos[enemigoAleatorio].vidaPersonajes = enemigos[enemigoAleatorio].vidaMaxEnemigo;

                } else if (pnjSeleccionado.vidaPersonajes <= 0) {
                    System.out.println("Has fracasado en tu misión de exorcizar maldiciones");
                    pelea = false;
                }
            }
            System.out.println("Quieres volver a intentarlo?");
            System.out.println("1. SI | 2. NO ");

            int finalDeJuego = sc.nextInt();

            if (finalDeJuego == 1) {
                confirmacion = true;
                pelea = true;

                pnjSeleccionado = new Personajes();
                enemigoAleatorio = random.nextInt(3);
                enemigoAzar = enemigos[enemigoAleatorio];
                enemigos[enemigoAleatorio].vidaPersonajes = enemigos[enemigoAleatorio].vidaMaxEnemigo;
            } else if (finalDeJuego == 2){
                System.out.println("Las maldiciones siempre seguirán ahí para cuando decidas volver a intentar exorcizarlas, hasta la próxima!");
                juego = false;
            }
        }
    }
}
