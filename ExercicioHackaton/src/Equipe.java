import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private String nome;
    private List<Estudante> membros;

    public Equipe(String nome) {
        this.nome = nome;
        this.membros = new ArrayList<>();
    }

    public void adicionar(Estudante estudante) {
        membros.add(estudante);
    }

    public List<Estudante> getMembros() {
        return membros;
    }

    public String getNome() {
        return nome;
    }
}
