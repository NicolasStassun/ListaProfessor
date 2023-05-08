import javax.swing.*;
import java.util.ArrayList;

public class Retangulo extends Quadrilateros{

    private static ArrayList<Retangulo> listaDeRetangulos = new ArrayList<>();

    public static void cadastrarRetangulo(){
        double lado1;
        double lado2;

        lado1 = (Double.parseDouble(JOptionPane.showInputDialog("Informe a base")));
        lado2 = (Double.parseDouble(JOptionPane.showInputDialog("Informe o altura")));

        Retangulo retanguloCadastrado = new Retangulo(lado1,lado2);

        listaDeRetangulos.add(retanguloCadastrado);

    }

    public Retangulo(double lado1,double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.area = calculaArea();
        this.perimetro = calculaPerimetro();
    }

    public static void listarQuadrados(){

        for (Retangulo i:
                listaDeRetangulos) {

            JOptionPane.showMessageDialog(null,(1+listaDeRetangulos.indexOf(i))+ "\n" + i.toString());

        }

    }

}
