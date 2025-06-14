import java.util.ArrayList;
import java.util.List;

public class Estudantes {
    private static Estudantes instancia;
    private List<Estudante> lista;

    private Estudantes() {
        lista = new ArrayList<>();
    }

    public static Estudantes getInstancia() {
        if (instancia == null) {
            instancia = new Estudantes();
        }
        return instancia;
    }

    public void adicionar(Estudante estudante) {
        lista.add(estudante);
    }

    public List<Estudante> listar() {
        return lista;
    }
}
