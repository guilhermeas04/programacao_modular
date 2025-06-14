import java.util.ArrayList;
import java.util.List;

public class Instituicoes {
    private static Instituicoes instancia;
    private List<Instituicao> lista;

    private Instituicoes() {
        lista = new ArrayList<>();
    }

    public static Instituicoes getInstancia() {
        if (instancia == null) {
            instancia = new Instituicoes();
        }
        return instancia;
    }

    public void adicionar(Instituicao instituicao) {
        lista.add(instituicao);
    }

    public List<Instituicao> listar() {
        return lista;
    }

    public Instituicao buscarPorNome(String nome) {
        return lista.stream().filter(i -> i.getNome().equalsIgnoreCase(nome)).findFirst().orElse(null);
    }
}
