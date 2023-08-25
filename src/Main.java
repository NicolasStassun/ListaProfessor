import javax.swing.*;

public class Main {

    static boolean retepicao;
    static boolean login;
    static Professor elvis = new Professor();

    public static void main(String[] args) {

        elvis.setSenha("123");

        do {
            login();
        } while (retepicao == true);


    }

    static int contLogin = 0;

    public static void login() {

        do {


            for (contLogin = 1; contLogin <= 3; contLogin++) {

                String senha = JOptionPane.showInputDialog("Informe a senha");

                if (senha.equals(Professor.getSenha())) {


                    menu();
                    login = true;


                }
                login = false;
                retepicao = false;

            }


        } while (login == true);

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

        } while (opcao != 3);
    }

    public static void menuListarFormas() {

        int opcao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("""
                    1 - Listar Quadrado
                    2 - Listar Retangulo
                    3 - Listar Circulo
                    4 - Mostrar menu de Triangulos
                    5 - Sair
                    """));

            switch (opcao) {

                case 1:
                    for (Forma quadrado :
                            elvis.getFormas()) {
                        if (quadrado instanceof Quadrado) {
                            JOptionPane.showMessageDialog(null, quadrado.toString());
                        }
                    }
                    break;
                case 2:
                    for (Forma retangulo :
                            elvis.getFormas()) {
                        if (retangulo instanceof Retangulo) {
                            JOptionPane.showMessageDialog(null, retangulo.toString());
                        }
                    }
                    break;
                case 3:
                    for (Forma circulo :
                            elvis.getFormas()) {
                        if (circulo instanceof Circulo) {
                            JOptionPane.showMessageDialog(null, circulo.toString());
                        }
                    }
                    break;
                case 4:

                    listarTriangulos();

                    break;

            }


        } while (opcao != 5);
    }

    public static void listarTriangulos() {

        int opcao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("""
                    1 - Listar Isosceles
                    2 - Listar Equilateros
                    3 - Listar Escalenos
                    4 - Listar todos os Triangulos
                    5 - Sair
                    """));

            switch (opcao) {

                case 1:
                    for (Forma isosceles :
                            elvis.getFormas()) {
                        if (isosceles instanceof Isoceles) {
                            JOptionPane.showMessageDialog(null, isosceles.toString());
                        }
                    }
                    break;
                case 2:
                    for (Forma equilatero :
                            elvis.getFormas()) {
                        if (equilatero instanceof Equilatero) {
                            JOptionPane.showMessageDialog(null, equilatero.toString());
                        }
                    }
                    break;
                case 3:
                    for (Forma escaleno :
                            elvis.getFormas()) {
                        if (escaleno instanceof Escaleno) {
                            JOptionPane.showMessageDialog(null, escaleno.toString());
                        }
                    }
                    break;
                case 4:
                    for (Forma triangulo :
                            elvis.getFormas()) {
                        if (triangulo instanceof Triangulo) {
                            JOptionPane.showMessageDialog(null, triangulo.toString());
                        }
                        break;

                    }


            };

        }while (opcao != 5) ;
    }

        public static void menuCadastrarFormas (){

            int opcao = 0;

            do {
                opcao = Integer.parseInt(JOptionPane.showInputDialog("""
                        1 - Cadastrar Quadrado
                        2 - Cadastrar Retangulo
                        3 - Cadastrar Circulo
                        4 - Cadastrar Triangulo
                        5 - Sair
                        """));

                switch (opcao) {

                    case 1:

                        double baseQuadrado = Double.parseDouble(JOptionPane.showInputDialog("Informe a medida da Base"));

                        Quadrado cadastrarQuadrado = new Quadrado(baseQuadrado, elvis);

                        break;
                    case 2:

                        double baseRetangulo = Double.parseDouble(JOptionPane.showInputDialog("Informe a medida da Base"));

                        double alturaRetangulo = Double.parseDouble(JOptionPane.showInputDialog("Informe a medida da Altura"));

                        Retangulo cadastrarRetangulo = new Retangulo(baseRetangulo, alturaRetangulo, elvis);


                        break;
                    case 3:

                        double raioCirculo = Double.parseDouble(JOptionPane.showInputDialog("Informe a medida do Raio"));

                        Circulo cadastrarCirculo = new Circulo(raioCirculo, elvis);

                        break;

                    case 4:

                        double lado1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a medida da Lado 1"));

                        double lado2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a medida da Lado 2"));

                        double lado3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a medida da Lado 3"));

                        if (lado1 == lado2 && lado2 == lado3) {
                            Equilatero equilatero = new Equilatero(lado1, lado2, lado3, elvis);
                        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                            Isoceles isoceles = new Isoceles(lado1, lado2, lado3, elvis);
                        } else {
                            Escaleno escaleno = new Escaleno(lado1, lado2, lado3, elvis);
                        }

                }

                break;

            } while (opcao != 5);


        }
    }
