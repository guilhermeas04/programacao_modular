import java.util.ArrayList;
import java.util.List;

public class Jurados {
    private static Jurados instancia;
    private List<Jurado> lista;

    private Jurados() {
        lista = new ArrayList<>();
    }

    public static Jurados getInstancia() {
        if (instancia == null) {
            instancia = new Jurados();
        }
        return instancia;
    }

    public void adicionar(Jurado jurado) {
        lista.add(jurado);
    }

    public List<Jurado> listar() {
        return lista;
    }

    public Jurado buscarPorNome(String nome) {
        return lista.stream().filter(j -> j.getNome().equalsIgnoreCase(nome)).findFirst().orElse(null);
    }
}
