import java.util.ArrayList;

public class Professor {

    private ArrayList<Forma> formas = new ArrayList<>();

    private static String senha;

    public static String getSenha() {
        return senha;
    }
    public static void setSenha(String senha) {
        Professor.senha = senha;
    }

    public void addForma(Forma forma){
        formas.add(forma);
    }

    public ArrayList<Forma> getFormas() {
        return formas;
    }

    public void setFormas(ArrayList<Forma> formas) {
        this.formas = formas;
    }
}
