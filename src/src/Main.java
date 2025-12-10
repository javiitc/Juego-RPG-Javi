import java.util.Random;
import java.util.Scanner;
//Este código/juego RPG ha sido completado después de mucho sufrimiento y desesperación por todos los errores que salían cada 2x3, si tocas algo, probablemente deje de funcionar (por favor no lo hagas) :)
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
//En esta parte del programa declaramos todas las variables que vamos a utilizar más de una vez a lo largo del código
        int seleccionPersonaje;
        boolean confirmacion = true;
        int confirmar;
        int eleccionBatalla;
        int ataqueEnemigo;
        int dmgEnemigo;
        int dineroGanado;
        boolean juego = true;
        boolean pelea = true;
//Aquí declaramos el objeto Personaje y loe enemigos a los que nos vamos a enfrentar
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
//Aquí comienza el bucle principal, donde transcurre todo el juego
        while (juego) {
            //Este primer bucle, dentro del principal, es para elegir personaje, y una vez confirmes tu elección el bucle parará
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

            //En esta parte declaramos los arrays de las acciones que puede realizar nuestro personaje y las acciones del enemigo (que estás serán aleatorias)
            int[] iteraccion = {pnjSeleccionado.dmgAtaqueFisico, pnjSeleccionado.dmgAtaqueEspecial, pnjSeleccionado.dmgExpansionDominio, (int) pnjSeleccionado.multiplicadorCritico};
            int[] iteraccionEnemigo = {enemigoAzar.dmgAtaqueFisico, (int) enemigoAzar.multiplicadorCritico};

            System.out.println(pnjSeleccionado.nombre + " , tu deber es exorcizar a todas las maldiciones posibles que hay ahora mismo en Shibuya, de segundo o primer grado, e incluso al rey de las maldiciones \n" +
                    "(si es que logras derrotarlo) en caso de que te encuentres con él. Buena suerte!");
            System.out.println("\n" + "Has llegado a Shibuya, mientras observas la situación y te adentras en la ciudad, se ha puesto en tu camino" + enemigoAzar.nombre);
            //Inicia el bucle de la pelea
            while (pelea) {
                System.out.println("===== " + enemigoAzar.nombreBatalla + "=====");
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
              //Usamos swtich para todas las acciones que puede realizar nuestro personaje, cada una con sus diferentes efectos (ataque básico, especial, inventario,...)
                switch (eleccionBatalla) {
                    case 1:
                        System.out.println("Has atacado al enemigo!");
                        enemigoAzar.vidaPersonajes -= pnjSeleccionado.dmgAtaqueFisico;

                        if (enemigoAzar.vidaPersonajes > 0) {
                            ataqueEnemigo = random.nextInt(2);
                            dmgEnemigo = iteraccionEnemigo[ataqueEnemigo];
                            if (ataqueEnemigo == 0) {
                                System.out.println(enemigoAzar.nombreBatalla + "te ha hecho un ataque directo!");
                                pnjSeleccionado.vidaPersonajes -= dmgEnemigo;
                                System.out.println("Daño recibido: " + dmgEnemigo);
                            } else {
                                System.out.println(enemigoAzar.nombreBatalla + "ha potenciado su ataque con energía maldita y te ha hecho un golpe crítico");
                                pnjSeleccionado.vidaPersonajes -= (int) dmgEnemigo;
                                System.out.println("Daño recibido: " + dmgEnemigo);
                            }
                        }
                        break;

                    case 2:
                        System.out.println("Tecnica Maldita: " + pnjSeleccionado.tecnicaEspecial + " ha hecho un impacto directo!");
                        enemigoAzar.vidaPersonajes -= pnjSeleccionado.dmgAtaqueEspecial;
                        pnjSeleccionado.energiaMaldita -= 30;

                        if (enemigoAzar.vidaPersonajes > 0) {
                            ataqueEnemigo = random.nextInt(2);
                            dmgEnemigo = iteraccionEnemigo[ataqueEnemigo];
                            if (ataqueEnemigo == 0) {
                                System.out.println(enemigoAzar.nombreBatalla + "te ha hecho un ataque directo!");
                                pnjSeleccionado.vidaPersonajes -= dmgEnemigo;
                                System.out.println("Daño recibido: " + dmgEnemigo);
                            } else {
                                System.out.println(enemigoAzar.nombreBatalla + "ha potenciado su ataque con energía maldita y te ha hecho un golpe crítico");
                                pnjSeleccionado.vidaPersonajes -= (int) dmgEnemigo;
                                System.out.println("Daño recibido: " + dmgEnemigo);
                            }
                        }

                        break;

                    case 3:
                        System.out.println("Expansion de Dominio: " + pnjSeleccionado.expansionesDominio);
                        System.out.println(enemigoAzar.nombreBatalla + "ha sido encerrado en tu Expansion de dominio y ha recibido un daño descomunal!");
                        enemigoAzar.vidaPersonajes -= pnjSeleccionado.dmgExpansionDominio;
                        pnjSeleccionado.energiaMaldita -= 50;

                        if (enemigoAzar.vidaPersonajes > 0) {
                            ataqueEnemigo = random.nextInt(2);
                            dmgEnemigo = iteraccionEnemigo[ataqueEnemigo];
                            if (ataqueEnemigo == 0) {
                                System.out.println(enemigoAzar.nombreBatalla + "te ha hecho un ataque directo!");
                                pnjSeleccionado.vidaPersonajes -= dmgEnemigo;
                                System.out.println("Daño recibido: " + dmgEnemigo);
                            } else {
                                System.out.println(enemigoAzar.nombreBatalla + "ha potenciado su ataque con energía maldita y te ha hecho un golpe crítico");
                                pnjSeleccionado.vidaPersonajes -= (int) dmgEnemigo;
                                System.out.println("Daño recibido: " + dmgEnemigo);
                            }
                        }
                        break;

                    case 4:
                        System.out.println("Has usado Energia Maldita para potenciar el golpe!");
                        enemigoAzar.vidaPersonajes -= (int) pnjSeleccionado.multiplicadorCritico;
                        System.out.println("El enemigo ha recibido: " + pnjSeleccionado.multiplicadorCritico + " de daño!");
                        pnjSeleccionado.energiaMaldita -= 20;

                        if (enemigoAzar.vidaPersonajes > 0) {
                            ataqueEnemigo = random.nextInt(2);
                            dmgEnemigo = iteraccionEnemigo[ataqueEnemigo];
                            if (ataqueEnemigo == 0) {
                                System.out.println(enemigoAzar.nombreBatalla + "te ha hecho un ataque directo!");
                                pnjSeleccionado.vidaPersonajes -= dmgEnemigo;
                                System.out.println("Daño recibido: " + dmgEnemigo);
                            } else {
                                System.out.println(enemigoAzar.nombreBatalla + "ha potenciado su ataque con energía maldita y te ha hecho un golpe crítico");
                                pnjSeleccionado.vidaPersonajes -= (int) dmgEnemigo;
                                System.out.println("Daño recibido: " + dmgEnemigo);
                            }
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
                                        pnjSeleccionado.multiplicadorCritico = pnjSeleccionado.dmgAtaqueFisico * pnjSeleccionado.multiplicador;
                                    } else if (pnjSeleccionado.inventario[eleccionInventario] == objetos[2]) {
                                        System.out.println("El director Gakuganji y Utahime te estan ayudando con sus rituales! Tu daño fisico, de técnica Maldita y de la expansión de dominio ha aumentado considerablemente!");
                                        pnjSeleccionado.dmgAtaqueFisico += 50;
                                        pnjSeleccionado.dmgAtaqueEspecial += 40;
                                        pnjSeleccionado.dmgExpansionDominio += 35;
                                        pnjSeleccionado.multiplicadorCritico = pnjSeleccionado.dmgAtaqueFisico * pnjSeleccionado.multiplicador;
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
                        pelea = false;
                        break;
                }
               //En esta parte declaramos el fin de la pelea, dependiendo si ha sido el jugador el que ha ganado o ha perdido
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
                    //Dependiendo de si se quiere ir a otra pelea o ir a la tienda de objetos, el bucle de pelea volverá a empezar inmediatamente o nada más salir de la tienda
                    if (eleccionFinDePelea == 1) {
                        pelea = true;
                    } else {
                        Tienda.tiendaObjetos(pnjSeleccionado, objetos); //Para la tienda de objetos, llamamos a la función para que se ejecute (así quedaba más limpio el programa principal)
                        pelea = true;
                    }
                   //Al final de la pelea, hacemos que el personaje recupere un tercio de la vida máxima y la mitad de su energía maldita máxima
                    pnjSeleccionado.vidaPersonajes += (pnjSeleccionado.vidaMaxima / 3);
                    if (pnjSeleccionado.vidaPersonajes > pnjSeleccionado.vidaMaxima) {
                        pnjSeleccionado.vidaPersonajes = pnjSeleccionado.vidaMaxima;
                    }
                    pnjSeleccionado.energiaMaldita += (pnjSeleccionado.energiaMalditaMax / 2);
                    if (pnjSeleccionado.energiaMaldita > pnjSeleccionado.energiaMalditaMax) {
                        pnjSeleccionado.energiaMaldita = pnjSeleccionado.energiaMalditaMax;
                    }
                    //En esta parte declaramos un nuevo enemigo al azar entre los 3 que hay, y actualizamos tanto la vida como sus acciones de ataque
                    enemigoAleatorio = random.nextInt(3);
                    enemigoAzar = enemigos[enemigoAleatorio];
                    enemigos[enemigoAleatorio].vidaPersonajes = enemigos[enemigoAleatorio].vidaMaxEnemigo;
                    iteraccionEnemigo[0] = enemigoAzar.dmgAtaqueFisico;
                    iteraccionEnemigo[1] = (int) enemigoAzar.multiplicadorCritico;

                } else if (pnjSeleccionado.vidaPersonajes <= 0) {
                    System.out.println("Has fracasado en tu misión de exorcizar maldiciones");
                    pelea = false;
                }
            }
            //En caso que sea nuestro personaje el que pierde, el bucle pelea se detiene y pasamos a la ultima parte, de si se quiere volver a intentar o no
            System.out.println("Quieres volver a intentarlo?");
            System.out.println("1. SI | 2. NO ");

            int finalDeJuego = sc.nextInt();

            if (finalDeJuego == 1) { //En caso que SI, el bucle confirmación, para elegir personaje, se vuelve a activar y el de pelea también
                confirmacion = true;
                pelea = true;
                //Volvemos a declarar el nuevo personaje y los enemigos (si no es de esta forma, al momento de seleccionar nuevo personaje se guardarían los stats del primero seleccionado
                pnjSeleccionado = new Personajes();
                enemigoAleatorio = random.nextInt(3);
                enemigoAzar = enemigos[enemigoAleatorio];
                enemigos[enemigoAleatorio].vidaPersonajes = enemigos[enemigoAleatorio].vidaMaxEnemigo;
                iteraccionEnemigo[0] = enemigoAzar.dmgAtaqueFisico;
                iteraccionEnemigo[1] = (int) enemigoAzar.multiplicadorCritico;
            } else if (finalDeJuego == 2){ //En caso de que no el bucle principal del juego, se detiene y se acaba el programa
                System.out.println("Las maldiciones siempre seguirán ahí para cuando decidas volver a intentar exorcizarlas, hasta la próxima!");
                juego = false;
            }
        }
    }
}
