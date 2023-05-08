import java.util.ArrayList;

public class Retangulo extends Forma{

    private static ArrayList<Retangulo> retangulos = new ArrayList<>();

    private double base;
    private double altura;


    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.area = calculaArea();
        this.perimetro = calculaPerimetro();

        retangulos.add(this);
        this.addForma();

    }
    private double calculaArea(){
        return this.base * this.altura;
    }
    private double calculaPerimetro(){
        return (this.base+this.altura) * 2;
    }

    public static String listarRetangulos(){

        for (Retangulo i:
                retangulos) {

            return i.toString();

        }
        return "Não possui retangulos cadastrados";

    }

    @Override
    public String toString() {
        return "Retangulo: " + "\n"+
                "Area: " + area +"\n"+
                "Perimetro: " + perimetro +"\n"+
                "Base: " + base +"\n"+
                "Altura: " + altura +"\n";
    }
}