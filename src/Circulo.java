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
    public static String listarCirculos(){

        for (Circulo i:
                circulos) {

            return i.toString();

        }
        return "Não possui cirulos cadastrados";
    }

    @Override
    public String toString() {
        return "Circulo: " + "\n"+
                "Raio: " + raio + "\n"+
                "Area: " + area + "\n"+
                "Perimetro: " + perimetro;
    }
}