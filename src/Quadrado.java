import java.util.ArrayList;

public class Quadrado extends Forma{

    private static ArrayList<Quadrado> quadrados = new ArrayList<>();

    private double base;

    public Quadrado(double base) {
        this.base = base;
        this.area = calculaArea();
        this.perimetro = calculaPerimetro();

        quadrados.add(this);
        this.addForma();

    }

    private double calculaArea(){
        return this.base * this.base;
    }
    private double calculaPerimetro(){
        return this.base * 4;
    }

    public static String listarQuadrados(){

        for (Quadrado i:
             quadrados) {

            return i.toString();

        }
        return "Não possui quadrados cadastrados";
    }

    @Override
    public String toString() {
        return "Quadrado: " + "\n"+
                "Area: " + area + "\n"+
                "Perimetro: " + perimetro + "\n"+
                "Base: " + base;
    }
}



