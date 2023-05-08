import javax.swing.*;
import java.util.ArrayList;

public class Quadrado extends Quadrilateros{

    private static ArrayList<Quadrado> listaDeQuadrados = new ArrayList<>();

    public static void cadastrarQuadrado(){
        double lado;

        lado = (Double.parseDouble(JOptionPane.showInputDialog("Informe o lado")));

        Quadrado quadradoCadastrado = new Quadrado(lado);

        listaDeQuadrados.add(quadradoCadastrado);

    }

    public Quadrado(double lado) {
        this.lado1 = lado;
        this.lado2 = lado;
        this.area = calculaArea();
        this.perimetro = calculaPerimetro();
    }
    
    public static void listarQuadrados(){

        for (Quadrado i:
             listaDeQuadrados) {

            JOptionPane.showMessageDialog(null,(1+listaDeQuadrados.indexOf(i))+ "\n" + i.toString());

        }
        
    }

    @Override
    public String toString() {
        return "Lado: " + lado1 + "\n"+
                "Area: " + area + "\n"+
                "Perimetro: " + perimetro;
    }
}
