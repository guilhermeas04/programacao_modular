import java.util.ArrayList;
import java.util.List;

public class Salas {
    private static Salas instancia;
    private List<Sala> lista;

    private Salas() {
        lista = new ArrayList<>();
    }

    public static Salas getInstancia() {
        if (instancia == null) {
            instancia = new Salas();
        }
        return instancia;
    }

    public void adicionar(Sala sala) {
        lista.add(sala);
    }

    public List<Sala> listar() {
        return lista;
    }

}
