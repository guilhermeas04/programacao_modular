import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Repositório Singleton para todas as apresentações.
 * Segue padrão Singleton + encapsula a lista de apresentações.
 */
public class Apresentacoes {
    private static Apresentacoes instancia;
    private final List<Apresentacao> lista;

    private Apresentacoes() {
        lista = new ArrayList<>();
    }

    public static Apresentacoes getInstancia() {
        if (instancia == null) {
            instancia = new Apresentacoes();
        }
        return instancia;
    }

    public void adicionar(Apresentacao apresentacao) {
        lista.add(apresentacao);
    }

    public List<Apresentacao> listar() {
        return Collections.unmodifiableList(lista); // Retorna lista imutável
    }
}
