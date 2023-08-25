import java.util.ArrayList;

public class Forma {

    private ArrayList<Forma> formas = new ArrayList<>();

    double area;
    double perimetro;

    public void addForma(Forma forma){
        formas.add(forma);
    }

    public ArrayList<Forma> getFormas() {
        return formas;
    }

    public void setFormas(ArrayList<Forma> formas) {
        this.formas = formas;
    }
}
