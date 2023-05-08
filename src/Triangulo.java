import java.util.ArrayList;

public class Triangulo extends Forma{

    private static ArrayList<Triangulo> triangulos = new ArrayList<>();

    private double lado1;
    private double lado2;
    private double lado3;
    private String tipo;


    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        vereficacaoTriangulo(this);
    }
    public void addTriangulo(Triangulo triangulo){
        triangulos.add(triangulo);
    }

    private void vereficacaoTriangulo(Triangulo triangulo){

        if (triangulo.lado1 == triangulo.lado2 && triangulo.lado2 == triangulo.lado3) {
            addTriangulo(triangulo);
            triangulo.tipo = "Equilatero";
            triangulo = new Equilatero(triangulo.lado1,triangulo.lado2,triangulo.lado3);
        } else if (triangulo.lado1 == triangulo.lado2 || triangulo.lado1 == triangulo.lado3 || triangulo.lado2 == triangulo.lado3) {
            addTriangulo(triangulo);
            triangulo.tipo = "Isosceles";
            triangulo = new Isoceles(triangulo.lado1,triangulo.lado2,triangulo.lado3);
        } else {
            addTriangulo(triangulo);
            triangulo.tipo = "Escaleno";
            triangulo = new Escaleno(triangulo.lado1,triangulo.lado2,triangulo.lado3);
        }

    }
    public static String listarTriangulos(){

        for (Triangulo i:
                triangulos) {

            return i.toString();

        }
        return "Não possui triangulos cadastrados";
    }

    public static String listarIsosceles(){

        for (Triangulo i:
                triangulos) {
            if(i.tipo.equals("Isosceles")) {
                return i.toString();
            }
        }
        return "Não possui triangulos isosceles cadastrados";
    }

    public static String listarEquilateros(){

        for (Triangulo i:
                triangulos) {

            if(i.tipo.equals("Equilatero")) {
                return i.toString();
            }

        }
        return "Não possui triangulos equilateros cadastrados";
    }

    public static String listarEscalenos(){

        for (Triangulo i:
                triangulos) {

            if(i.tipo.equals("Escaleno")) {
                return i.toString();
            }

        }
        return "Não possui triangulos escalenos cadastrados";
    }

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
