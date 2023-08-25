import java.util.ArrayList;

public abstract class Triangulo extends Forma{

    private double lado1;
    private double lado2;
    private double lado3;
    private String tipo;


    public Triangulo(double lado1, double lado2, double lado3, Professor professor) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        professor.addForma(this);
    }

    public abstract double calcularArea(double lado1, double lado2, double lado3);

    @Override
    public String toString() {
        return "Triangulo" +"\n"+
                "Area: " + area +"\n"+
                "Perimetro: " + perimetro +"\n"+
                "Lado 1: " + lado1 +"\n"+
                "Lado 2:" + lado2 +"\n"+
                "Lado 3:" + lado3 +"\n"+
                "Tipo: " + tipo;
    }
}
