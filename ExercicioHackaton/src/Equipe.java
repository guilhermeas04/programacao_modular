import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Representa uma equipe de estudantes.
 */
public class Equipe {
    private final String nome;
    private final List<Estudante> membros;

    public Equipe(String nome) {
        this.nome = nome;
        this.membros = new ArrayList<>();
    }

    public void adicionar(Estudante estudante) {
        membros.add(estudante);
    }

    public List<Estudante> getMembros() {
        return Collections.unmodifiableList(membros);
    }

    public String getNome() {
        return nome;
    }
}
