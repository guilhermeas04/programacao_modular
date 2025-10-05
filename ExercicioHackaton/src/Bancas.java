import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Repositório Singleton para todas as bancas.
 */
public class Bancas {
    private static Bancas instancia;
    private final List<Banca> lista;

    private Bancas() {
        lista = new ArrayList<>();
    }

    public static Bancas getInstancia() {
        if (instancia == null) {
            instancia = new Bancas();
        }
        return instancia;
    }

    public void adicionar(Banca banca) {
        lista.add(banca);
    }

    public List<Banca> listar() {
        return Collections.unmodifiableList(lista);
    }
}
