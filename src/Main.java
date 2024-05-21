import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Barberia barberia = new Barberia();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú:");//mostramos o menu por pantalla.
            System.out.println("1. Hacer reserva");//mostramos opcion 1.
            System.out.println("2. Mostrar reservas");//mostramos opcion 2.
            System.out.println("3. Salir");//mostramos opcion 3.
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();//o usuario elixe a opcion  desexada e o programa leea.
            scanner.nextLine();  

            switch (opcion) {//aqui 
                case 1://opcion 1, facer reserva, na cal a continuacion nos pide os datos.
                    System.out.print("Ingrese su nombre: ");
                    String nombre = scanner.nextLine();//guardamos nombre.
                    System.out.print("Ingrese su teléfono: ");
                    String telefono = scanner.nextLine();//guardamos telefono.
                    System.out.print("Ingrese la fecha y hora de la reserva (dd/mm/yyyy hh:mm): ");
                    String fechaHora = scanner.nextLine();//guardamos fecha y hora.
                    Cliente cliente = new Cliente(nombre, telefono, fechaHora);
                    barberia.hacerReserva(cliente);

                    break;


                case 2://opcion 2, mostrar reserva, na que podremos ver as reservas que xa estan feitas.
                    barberia.mostrarReservas();
                    break;
                case 3://opcion 3, salir, nesta opcion sairiamos do programa.
                    System.out.println("Saliendo del sistema.");
                    return;
                default://no caso de introducir un numero que non entra dentro das opcions o programaa lanzara un erro e pediranos que introduzcamos un novo numero.
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
