public class Cliente {
    private String nombre;
    private String telefono;
    private String fechaHora;

    public Cliente(String nombre, String telefono, String fechaHora) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.fechaHora = fechaHora;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getFechaHora() {
        return fechaHora;
    }
}
