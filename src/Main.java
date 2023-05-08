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
                    1 - Cadastrar Círculo
                    2 - Cadastrar Triângulo
                    3 - Cadastrar Retângulo
                    4 - Cadastrar Quadrado
                    5 - Listar as formas
                    6 - Logout
                    """));

            switch (opcao) {

                case 1:


                    break;

                case 2:


                    break;


                case 3:



                    break;

                case 4:



                    break;

                case 5:


                    break;

                case 6:


                    login = false;
                    contLogin = 0;
                    JOptionPane.showMessageDialog(null, "Logout concluído");

                    break;

            }

        } while (opcao != 6);
    }

}
