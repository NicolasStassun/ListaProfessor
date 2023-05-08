import java.util.ArrayList;

public class Circulo extends Forma{

    private static ArrayList<Circulo> circulos = new ArrayList<>();

    double raio;

    public Circulo(double raio) {
        this.raio = raio;
        this.area = calculaArea();
        this.perimetro = calculaPerimetro();

        circulos.add(this);
        this.addForma();

    }
    private double calculaArea(){
        return (Math.PI*(this.raio * this.raio));
    }
    private double calculaPerimetro(){
        return (Math.PI*(2 * this.raio));
    }
}
