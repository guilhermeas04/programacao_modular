import java.util.ArrayList;
import java.util.List;

public class Bancas {
    private static Bancas instancia;
    private List<Banca> lista;

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
        return lista;
    }
}
