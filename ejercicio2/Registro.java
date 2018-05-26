import java.util.ArrayList;
import java.util.Random;

public class Registro {
    ArrayList<Auto> autos = new ArrayList<>();
    Random random = new Random();
    Auto auto;
    String modelo[] = {"Peugeot 207","Mazda 2", "Jeep Full"};

    public void crearAuto(){
        String marca;
        auto= new Auto("Peugeot 207", random.nextInt(2001), 40, 1 );
        autos.add(auto);
        auto= new Auto("Mazda 2", random.nextInt(2001), 20, 2 );
        autos.add(auto);
        auto= new Auto("eep Full", random.nextInt(2001), 60, 3 );
        autos.add(auto);

        for (int i= 0; i<7; i++){

           marca = modelo[random.nextInt(3)];

        }


    }
}
