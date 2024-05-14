public class Cliente {//declaramos unha clase cliente para poder introducir os seus datos.
    private String nombre;//declaramos nombre.
    private String telefono;//declaramos telefono.
    private String fechaHora;//declaramos fecha e hora.

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
