import java.util.ArrayList;

public class Circulo extends Forma{

    double raio;

    public Circulo(double raio, Professor professor) {
        this.raio = raio;
        this.area = calculaArea();
        this.perimetro = calculaPerimetro();
        professor.addForma(this);

    }
    private double calculaArea(){
        return (Math.PI*(this.raio * this.raio));
    }
    private double calculaPerimetro(){
        return (Math.PI*(2 * this.raio));
    }

    @Override
    public String toString() {
        return "Circulo: " + "\n"+
                "Raio: " + raio + "\n"+
                "Area: " + area + "\n"+
                "Perimetro: " + perimetro;
    }
}