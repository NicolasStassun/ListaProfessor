import java.util.ArrayList;

public class Forma {

    private static ArrayList<Forma> formas = new ArrayList<>();

    double area;
    double perimetro;

    public void addForma(){
        formas.add(this);
    }
}
