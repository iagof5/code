/**
 * Clase que representa la barbería y maneja las reservas.
 */
class Barberia {
    private ArrayList<Cliente> listaReservas;

    /**
     * Constructor que inicializa la lista de reservas.
     */
    public Barberia() {
        listaReservas = new ArrayList<>();
    }

    /**
     * Realiza una reserva para un cliente.
     *
     * @param cliente El cliente para el cual se realiza la reserva.
     */
    public void hacerReserva(Cliente cliente) {
        listaReservas.add(cliente);
        System.out.println("Reserva realizada para " + cliente.getNombre() + " el " + cliente.getFechaHora());
    }

    /**
     * Muestra todas las reservas existentes.
     */
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
