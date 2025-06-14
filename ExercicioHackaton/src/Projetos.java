import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Projetos {
    private static Projetos instancia;
    private List<Projeto> lista;

    private Projetos() {
        lista = new ArrayList<>();
    }

    public static Projetos getInstancia() {
        if (instancia == null) {
            instancia = new Projetos();
        }
        return instancia;
    }

    public void adicionar(Projeto projeto) {
        lista.add(projeto);
    }

    public List<Projeto> listar() {
        return lista;
    }

    public List<Projeto> listarAprovados(double notaMinima) {
        return lista.stream().filter(p -> p.getNotaFinal() >= notaMinima).collect(Collectors.toList());
    }

}
