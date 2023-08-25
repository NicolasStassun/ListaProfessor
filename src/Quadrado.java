import java.util.ArrayList;

public class Quadrado extends Forma{

    private double base;

    public Quadrado(double base) {
        this.base = base;
        this.area = calculaArea();
        this.perimetro = calculaPerimetro();
        this.addForma(this);

    }

    private double calculaArea(){
        return this.base * this.base;
    }
    private double calculaPerimetro(){
        return this.base * 4;
    }

    @Override
    public String toString() {
        return "Quadrado: " + "\n"+
                "Area: " + area + "\n"+
                "Perimetro: " + perimetro + "\n"+
                "Base: " + base;
    }
}



