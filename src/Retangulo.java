import java.util.ArrayList;

public class Retangulo extends Forma{

    private double base;
    private double altura;


    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.area = calculaArea();
        this.perimetro = calculaPerimetro();
        this.addForma(this);

    }
    private double calculaArea(){
        return this.base * this.altura;
    }
    private double calculaPerimetro(){
        return (this.base+this.altura) * 2;
    }

    @Override
    public String toString() {
        return "Retangulo: " + "\n"+
                "Area: " + area +"\n"+
                "Perimetro: " + perimetro +"\n"+
                "Base: " + base +"\n"+
                "Altura: " + altura +"\n";
    }
}