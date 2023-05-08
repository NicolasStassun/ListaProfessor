import java.util.ArrayList;

public class Isoceles extends Triangulo{

    private static ArrayList<Triangulo> isocelesLista = new ArrayList<>();

    public Isoceles(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
    }

    public static void addIsoceles(Triangulo Isoceles){
        isocelesLista.add(Isoceles);
    }

}
