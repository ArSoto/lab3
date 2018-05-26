import java.util.ArrayList;

public class Auto {
    private String marca;
    private int kilometraje;
    private int estanque;
    private int estacionamiento;
    private boolean disponile = true;
    ArrayList<Persona> personas= new ArrayList<>();

    public Auto(String marca, int kilometraje, int estanque, int estacionamiento) {
        this.marca = marca;
        this.kilometraje = kilometraje;
        this.estanque = estanque;
        this.estacionamiento = estacionamiento;
    }


    public int getKilometraje() {
        return kilometraje;
    }

    public boolean isDisponile() {
        return disponile;
    }

    public String getMarca() {
        return marca;
    }

    public int getEstanque() {
        return estanque;
    }

    public int getEstacionamiento() {
        return estacionamiento;
    }
}
