import java.util.ArrayList;

public class Equilatero extends Triangulo{

    private static ArrayList<Triangulo> equilateroLista = new ArrayList<>();

    public Equilatero(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
        this.area = calculaArea(lado1);
        this.perimetro = (lado1 + lado2 + lado3);
        addEquilatero(this);

    }

    public static void addEquilatero(Triangulo Equilatero){
        equilateroLista.add(Equilatero);
    }

    public double calculaArea(double lado1) {
        return (Math.sqrt(3) / 4) * lado1 * lado1;
    }


}
