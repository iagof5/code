import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Barberia barberia = new Barberia();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Hacer reserva");
            System.out.println("2. Mostrar reservas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea después de nextInt()

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese su nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese su teléfono: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Ingrese la fecha y hora de la reserva (dd/mm/yyyy hh:mm): ");
                    String fechaHora = scanner.nextLine();
                    Cliente cliente = new Cliente(nombre, telefono, fechaHora);
                    barberia.hacerReserva(cliente);

                    break;


                case 2:
                    barberia.mostrarReservas();
                    break;
                case 3:
                    System.out.println("Saliendo del sistema.");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
