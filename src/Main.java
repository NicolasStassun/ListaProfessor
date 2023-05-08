import javax.swing.*;

public class Main {

    static boolean retepicao = true;
    static boolean login = true;

    public static void main(String[] args) {


        do {
            login();
        }while (retepicao == true);


    }

    static int contLogin = 0;

    public static void login() {

        do {


            for (contLogin = 0; contLogin <= 3; contLogin++) {

                String senha = JOptionPane.showInputDialog("Informe a senha");

                if (senha.equals(Professor.getSenha())) {


                    menu();
                    login = true;


                }

            }

            retepicao = false;

        }while (login == true) ;

    }
    public static void menu() {
        int opcao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("""
                    1 - Cadastro de Formas
                    2 - Listar Formas
                    3 - Logout
                    """));

            switch (opcao) {

                case 1:

                    menuCadastrarFormas();

                    break;

                case 2:

                    menuListarFormas();

                    break;

                case 3:


                    login = false;
                    contLogin = 0;
                    JOptionPane.showMessageDialog(null, "Logout concluído");

                    break;

            }

        } while (opcao != 6);
    }
    public static void menuListarFormas() {

        int opcao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("""
                    1 - Cadastrar Quadrado
                    2 - Cadastrar Retangulo
                    3 - Cadastrar Circulo
                    4 - Cadastrar Triangulo
                    5 - Sair
                    """));

            switch (opcao){

                case 1:

                    JOptionPane.showMessageDialog(null,Quadrado.listarQuadrados());

                    break;
                case 2:

                    JOptionPane.showMessageDialog(null,Retangulo.listarRetangulos());

                    break;
                case 3:

                    JOptionPane.showMessageDialog(null,Circulo.listarCirculos());

                    break;
                case 4:

                    listarTriangulos();

                    break;

            }


        }while (opcao!=5);
    }

    public static void listarTriangulos(){

        int opcao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("""
                    1 - Listar Isosceles
                    2 - Listar Equilateros
                    3 - Listar Escalenos
                    4 - Listar todos os Triangulos
                    5 - Sair
                    """));

            switch (opcao){

                case 1:

                    JOptionPane.showMessageDialog(null,Triangulo.listarIsosceles());

                    break;
                case 2:

                    JOptionPane.showMessageDialog(null,Triangulo.listarEquilateros());

                    break;
                case 3:

                    JOptionPane.showMessageDialog(null,Triangulo.listarEscalenos());

                    break;
                case 4:

                    JOptionPane.showMessageDialog(null,Triangulo.listarTriangulos());

                    break;

            }


        }while (opcao!=5);

    }

    public static void menuCadastrarFormas(){

        int opcao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("""
                    1 - Cadastrar Quadrado
                    2 - Cadastrar Retangulo
                    3 - Cadastrar Circulo
                    4 - Cadastrar Triangulo
                    5 - Sair
                    """));

            switch (opcao){

                case 1:

                    double baseQuadrado = Double.parseDouble(JOptionPane.showInputDialog("Informe a medida da Base"));

                    Quadrado cadastrarQuadrado = new Quadrado(baseQuadrado);

                    break;
                case 2:

                    double baseRetangulo = Double.parseDouble(JOptionPane.showInputDialog("Informe a medida da Base"));

                    double alturaRetangulo = Double.parseDouble(JOptionPane.showInputDialog("Informe a medida da Altura"));

                    Retangulo cadastrarRetangulo = new Retangulo(baseRetangulo,alturaRetangulo);

                    break;
                case 3:

                    double raioCirculo = Double.parseDouble(JOptionPane.showInputDialog("Informe a medida do Raio"));

                    Circulo cadastrarCirculo = new Circulo(raioCirculo);

                    break;

                case 4:

                    double lado1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a medida da Lado 1"));

                    double lado2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a medida da Lado 2"));

                    double lado3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a medida da Lado 3"));

                    Triangulo cadastrarTriangulo = new Triangulo(lado1,lado2,lado3);

                    break;
            }


        }while (opcao!=5);


    }

}
