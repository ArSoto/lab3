public class Persona {
    private String nombre;
    private String fechaIngreso;
    private String fechaSalida;

    public Persona(String nombre, String fechaSalida) {
        this.nombre = nombre;
        this.fechaSalida = fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }


    public String getNombre() {
        return nombre;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }
}
