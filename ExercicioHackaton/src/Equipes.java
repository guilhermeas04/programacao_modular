import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Repositório Singleton para todas as equipes.
 */
public class Equipes {
    private static Equipes instancia;
    private final List<Equipe> lista;

    private Equipes() {
        lista = new ArrayList<>();
    }

    public static Equipes getInstancia() {
        if (instancia == null) {
            instancia = new Equipes();
        }
        return instancia;
    }

    public void adicionar(Equipe equipe) {
        lista.add(equipe);
    }

    public List<Equipe> listar() {
        return Collections.unmodifiableList(lista);
    }
}
