import java.util.ArrayList;

public class Isoceles extends Triangulo{

    public Isoceles(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
        calcularArea(lado1,lado2, lado3);
        this.area = calcularArea(lado1,lado2, lado3);
        this.perimetro = (lado1 + lado2 + lado3);
    }
    @Override
    public double calcularArea(double lado1,double lado2, double lado3) {
        return (lado1 * Math.sqrt(lado2 * lado2 - (lado1 * lado1 / 4))) / 2;
    }
}
