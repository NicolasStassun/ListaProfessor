import javax.swing.*;

public class Main {

    static boolean retepicao = true;
    static boolean login = true;
    static private int senha = 123;

    public static void main(String[] args) {


        do {
            login();
        }while (retepicao == true);


    }

    static int contLogin = 0;

    public static void login() {

        do {


            for (contLogin = 0; contLogin < 3; contLogin++) {

                int login = Integer.parseInt(JOptionPane.showInputDialog("Informe a senha"));

                if (login == senha) {



                    menu();


                }

            }

            retepicao = false;

        }while (login == true) ;
    }
    public static void menu(){

        int opcao = Integer.parseInt(JOptionPane.showInputDialog("""
                1 - Cadastrar Círculo
                2 - Cadastrar Triângulo
                3 - Cadastrar Retângulo
                4 - Cadastrar Quadrado
                5 - Listar as formas
                6 - Logout
                """));

        switch (opcao){

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
                JOptionPane.showMessageDialog(null,"Logout concluído");

                break;

        }

    }

}
