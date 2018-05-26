public class Pregunta {
    private  String pregunta;
    private int puntje;
    private boolean disponible = true;


    public Pregunta(String pregunta, int puntje) {
        this.pregunta = pregunta;
        this.puntje = puntje;
    }

    public String getPregunta() {
        return pregunta;
    }

    public int getPuntje() {
        return puntje;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean uso) {
        this.disponible = uso;
    }
}

