import java.util.Scanner;

public class Tienda {
    public static void tiendaObjetos(Personajes personaje, String[] objetos) {
        Scanner sc = new Scanner(System.in);
        boolean tienda = true;
        int [] costes = {3, 5, 20, 3};
        while (tienda) {

            System.out.println("===== TIENDA =====");
            System.out.println("Yenes: " + personaje.yenes);
            System.out.println("1. " + objetos[0] + " - 3 yenes");
            System.out.println("2. " + objetos[1] + " - 5 yenes");
            System.out.println("3. " + objetos[2] + " - 10 yenes");
            System.out.println("4. " + objetos[3] + " - 3 yenes");
            System.out.println("5. Salir");

            int compra = sc.nextInt();

            if (compra == 5) {
                System.out.println("Hasta otra!");
                tienda = false;

            } else if (compra == 1 || compra == 2 || compra == 3 || compra == 4) {
                int precio = costes [compra - 1];

                if (personaje.yenes >= precio) {

                    boolean espacioOcupado = false;

                    for (int i = 0; i < personaje.inventario.length; i++) {

                        if (personaje.inventario[i] == null) {

                            personaje.inventario[i] = objetos[compra - 1];
                            personaje.yenes -= precio;
                            System.out.println("Has obtenido: " + objetos[compra - 1]);
                            espacioOcupado = true;
                            break;
                        }
                    }

                    if (!espacioOcupado) {
                        System.out.println("No tienes más espacio en tu inventario");
                    }

                } else {
                    System.out.println("No tienes suficiente dinero, derrota maldiciones para conseguir más yenes");
                }
            }
        }
    }
}
