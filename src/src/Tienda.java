import java.util.Scanner;

public class Tienda {
    public static void tiendaObjetos(Personajes personaje, String[] objetos) {
        Scanner sc = new Scanner(System.in);
        boolean tienda = true;
        while (tienda) {

            System.out.println("===== TIENDA =====");
            System.out.println("Yenes: " + personaje.yenes);
            System.out.println("1. " + objetos[0] + " - 10 yenes");
            System.out.println("2. " + objetos[1] + " - 15 yenes");
            System.out.println("3. " + objetos[2] + " - 10 yenes");
            System.out.println("4. " + objetos[3] + " - 15 yenes");
            System.out.println("5. Salir");

            int compra = sc.nextInt();

            if (compra == 5) {
                System.out.println("Hasta otra!");
                tienda = false;

            } else if (compra == 1 || compra == 2) {
                int precio = (compra == 1) ? 10 : 15;

                if (personaje.yenes >= precio) {

                    boolean agregado = false;

                    for (int i = 0; i < personaje.inventario.length; i++) {

                        if (personaje.inventario[i] == null) {

                            personaje.inventario[i] = objetos[compra - 1];
                            personaje.yenes -= precio;
                            System.out.println("Compraste: " + objetos[compra - 1]);
                            agregado = true;
                            break;
                        }

                    }

                    if (!agregado) {
                        System.out.println("No tienes más espacio en tu inventario");
                    }

                } else {
                    System.out.println("No tienes suficiente dinero, derrota maldiciones para conseguir más yenes");
                }
            }
        }
    }
}
