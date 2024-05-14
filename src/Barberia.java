import java.util.ArrayList;

public class Barberia {//declaramos a clase barberia na cal se van gardar as reservas.
    private ArrayList<Cliente> listaReservas;

    public Barberia() {
        listaReservas = new ArrayList<>();//creamos un arraylist xa que non sabemos cantos clientes reservaran, eso cun array normal seria complicado xa que ocuparia demasiado espacio.
    }

    public void hacerReserva(Cliente cliente) {
        listaReservas.add(cliente);
        System.out.println("Reserva realizada para " + cliente.getNombre() + " el " + cliente.getFechaHora());
    }

    public void mostrarReservas() {//aqui mostraranse as reservas ao pulsar o numero 2.
        if (listaReservas.isEmpty()) {
            System.out.println("No hay reservas.");//en caso de non ter reservas o programa faranolo saber.
        } else {
            System.out.println("Reservas:");
            for (Cliente cliente : listaReservas) {
                System.out.println("Nombre: " + cliente.getNombre() + ", Teléfono: " + cliente.getTelefono() + ", Fecha y hora: " + cliente.getFechaHora());
            }
        }
    }
}
