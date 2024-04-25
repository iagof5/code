import java.util.ArrayList;

public class Barberia {
    private ArrayList<Cliente> listaReservas;

    public Barberia() {
        listaReservas = new ArrayList<>();
    }

    public void hacerReserva(Cliente cliente) {
        listaReservas.add(cliente);
        System.out.println("Reserva realizada para " + cliente.getNombre() + " el " + cliente.getFechaHora());
    }

    public void mostrarReservas() {
        if (listaReservas.isEmpty()) {
            System.out.println("No hay reservas.");
        } else {
            System.out.println("Reservas:");
            for (Cliente cliente : listaReservas) {
                System.out.println("Nombre: " + cliente.getNombre() + ", Teléfono: " + cliente.getTelefono() + ", Fecha y hora: " + cliente.getFechaHora());
            }
        }
    }
}
