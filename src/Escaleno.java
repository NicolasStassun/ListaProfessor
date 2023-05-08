import java.util.ArrayList;

public class Escaleno extends Triangulo{

    private static ArrayList<Triangulo> escalenoLista = new ArrayList<>();

    public Escaleno(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
        this.area = calcularArea(lado1, lado2, lado3);
        this.perimetro = lado1 + lado2 + lado3;
        addEscaleno(this);
    }

    public static void addEscaleno(Triangulo Escaleno){
        escalenoLista.add(Escaleno);
    }

    public double calcularArea(double lado1, double lado2, double lado3) {
        double p = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
    }

}
