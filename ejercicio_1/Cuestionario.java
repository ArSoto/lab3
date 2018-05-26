import java.util.ArrayList;
import java.util.Random;

public class Cuestionario {

    private ArrayList<Pregunta> preguntas = new ArrayList<>();
    private ArrayList<Pregunta> preguntasPrueba= new ArrayList<>();
    private Pregunta pregunta;
    private int suma = 0;
    Random random = new Random();
    int azar;

    public void crearPreguntas(){

        pregunta = new Pregunta("Escriba 20 numeros primos", 20);
        preguntas.add(pregunta);
        pregunta = new Pregunta("Nombre 10 organos del cuerpo", 30);
        preguntas.add(pregunta);
        pregunta = new Pregunta("nombre los musculos del brazo", 30);
        preguntas.add(pregunta);
        pregunta =new Pregunta("nombre los musculos de la cara", 50);
        preguntas.add(pregunta);
        pregunta =new Pregunta("nombre los huesos de la mano", 10);
        preguntas.add(pregunta);
        pregunta= new Pregunta("Nombre los huesos de las piernas ", 40);
        preguntas.add(pregunta);
        pregunta = new Pregunta("cantidad de vertebras del cuerpo humano ", 10);
        preguntas.add(pregunta);
        pregunta = new Pregunta("nombre de los huesos de los dedos", 20);

    }

    public void asignarPreguntas(){

        while (suma <100){
            azar = random.nextInt(preguntas.size());

            if ((preguntas.get(azar).getPuntje()+ suma <= 100) && preguntas.get(azar).isDisponible()){
                preguntasPrueba.add(preguntas.get(azar));
                suma+=pregunta.getPuntje();
                preguntas.get(azar).setDisponible(false);

            }

        }

    }

    public void imprimirPreguntas(){

        for (Pregunta pregunta: preguntasPrueba){
            System.out.println(pregunta.getPregunta()+ " \t\t puntaje: " + pregunta.getPuntje());
        }

    }









}
