/**
 * Clase que representa un cliente de la barbería.
 */
class Cliente {
    private String nombre;
    private String telefono
    private String fechaHora;

    /**
     * Constructor que inicializa los datos del cliente.
     *
     * @param nombre    El nombre del cliente.
     * @param telefono  El teléfono del cliente.
     * @param fechaHora La fecha y hora de la reserva.
     */
    public Cliente(String nombre, String telefono, String fechaHora) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.fechaHora = fechaHora;
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el teléfono del cliente.
     *
     * @return El teléfono del cliente.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Obtiene la fecha y hora de la reserva del cliente.
     *
     * @return La fecha y hora de la reserva.
     */
    public String getFechaHora() {
        return fechaHora;
    }
}
