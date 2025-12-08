import java.util.Scanner;

public class Tienda {
    public static void tiendaObjetos (Personajes personaje, String [] objetos) {
        Scanner sc = new Scanner(System.in);
        boolean tienda = true;
        while (tienda) {

            System.out.println("==== TIENDA DE OBJETOS ====");
            System.out.println("1. " + objetos [0] + ": 3 yenes ");
            System.out.println("2. " + objetos [1] + ": 5 yenes ");
            System.out.println("3. " + objetos [2] + ": 10 yenes ");
            System.out.println("4. " + objetos [3] + ": 3 yenes ");
            System.out.println("5. Salir");

            int seleccionTienda = sc.nextInt();

            if (seleccionTienda == 1) {
                System.out.println("Has comprado: " + objetos [0]);
                personaje.yenes -= 3;
                System.out.println("Yenes: " + personaje.yenes);
            } else if (seleccionTienda == 2) {
                System.out.println("Has comprado: " + objetos [1]);
            } else if (seleccionTienda == 3) {
                System.out.println();
            } else if (seleccionTienda == 4) {
                System.out.println();
            } else {
                tienda = false;
            }
        }
    }
}
