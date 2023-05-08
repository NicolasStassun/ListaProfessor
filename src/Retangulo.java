import java.util.ArrayList;

public class Retangulo extends Forma{

    private static ArrayList<Retangulo> retangulos = new ArrayList<>();

    private double base;
    private double altura;


    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.area = calculaArea();
        this.perimetro = calculaPerimetro();

        retangulos.add(this);
        this.addForma();

    }
    private double calculaArea(){
        return this.base * this.altura;
    }
    private double calculaPerimetro(){
        return (this.base+this.altura) * 2;
    }
}