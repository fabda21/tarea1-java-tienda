import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] productos = {"Camisa", "Pantalón", "Zapatos", "Gorra", "Mochila"};
        double[] precios = {350.0, 550.0, 1200.0, 180.0, 700.0};
        boolean[] carrito = new boolean[productos.length];
        int opcion;
        do {
            System.out.println("\n==== MENÚ DE TIENDA ====");
            System.out.println("1. Ver productos disponibles");
            System.out.println("2. Agregar producto al carrito");
            System.out.println("3. Ver total a pagar");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Lista de Productos ---");
                    for (int i = 0; i < productos.length; i++) {
                        System.out.println((i + 1) + ". " + productos[i] + " - L " + precios[i]);
                    }
                    break;

                case 2:
                    System.out.println("Funcionalidad en desarrollo...");
                    break;

                case 3:
                    System.out.println("Funcionalidad en desarrollo...");
                    break;

                case 4:
                    System.out.println("Gracias por visitarnos.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);
    }
}