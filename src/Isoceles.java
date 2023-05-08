import java.util.ArrayList;

public class Isoceles extends Triangulo{

    private static ArrayList<Triangulo> isocelesLista = new ArrayList<>();

    public Isoceles(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
        calcularArea(lado1,lado2);
        this.perimetro = (lado1 + lado2 + lado3);
        addIsoceles(this);

    }

    public static void addIsoceles(Triangulo Isoceles){
        isocelesLista.add(Isoceles);
    }

    public double calcularArea(double lado1,double lado2) {
        return (lado1 * Math.sqrt(lado2 * lado2 - (lado1 * lado1 / 4))) / 2;
    }
}
