import java.util.ArrayList;

public class Escaleno extends Triangulo{

    private static ArrayList<Triangulo> escalenoLista = new ArrayList<>();

    public Escaleno(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
    }

    public static void addEscaleno(Triangulo Escaleno){
        escalenoLista.add(Escaleno);
    }

}
