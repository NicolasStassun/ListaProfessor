import java.util.ArrayList;

public class Equilatero extends Triangulo{

    public Equilatero(double lado1, double lado2, double lado3, Professor professor) {
        super(lado1, lado2, lado3, professor);
        this.area = calcularArea(lado1, lado2, lado3);
        this.perimetro = (lado1 + lado2 + lado3);
    }

    @Override
    public double calcularArea(double lado1, double lado2, double lado3){
        return (Math.sqrt(3) / 4) * lado1 * lado1;
    }


}
