import java.util.ArrayList;

public class Equilatero extends Triangulo{

    private static ArrayList<Triangulo> equilateroLista = new ArrayList<>();

    public Equilatero(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
    }

    public static void addEquilatero(Triangulo Equilatero){
        equilateroLista.add(Equilatero);
    }



}
