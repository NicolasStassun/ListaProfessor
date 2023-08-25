public class Professor {

    private static Forma formas = new Forma();

    private static String senha;

    public static String getSenha() {
        return senha;
    }
    public static void setSenha(String senha) {
        Professor.senha = senha;
    }

    public static Forma getForma() {
        return formas;
    }

    public static void setForma(Forma forma) {
        Professor.formas = forma;
    }
}
