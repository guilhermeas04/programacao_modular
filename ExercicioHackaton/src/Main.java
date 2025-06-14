import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // singletons 
        Equipes equipes = Equipes.getInstancia();
        Estudantes estudantes = Estudantes.getInstancia();
        Projetos projetos = Projetos.getInstancia();
        Jurados juradosRepo = Jurados.getInstancia();
        Bancas bancas = Bancas.getInstancia();
        Apresentacoes apresentacoes = Apresentacoes.getInstancia();
        Salas salas = Salas.getInstancia();
        Instituicoes instituicoes = Instituicoes.getInstancia();

        // Instituicoes
        Universidade puc = new Universidade("PUC-Minas");
        Universidade ufmg = new Universidade("UFMG");
        Empresa empresaJurados = new Empresa("Avaliadores");

        instituicoes.adicionar(puc);
        instituicoes.adicionar(ufmg);
        instituicoes.adicionar(empresaJurados);

        // Equipe 1 - PUC
        Equipe equipe1 = new Equipe("Equipe PUC");
        for (String nome : List.of("Guilherme", "Gabriel", "Gustavo", "João", "Pedro")) {
            Estudante estudante = new Estudante(nome, puc);
            equipe1.adicionar(estudante);
            estudantes.adicionar(estudante);
        }
        equipes.adicionar(equipe1);

        // Equipe 2 - UFMG
        Equipe equipe2 = new Equipe("Equipe UFMG");
        for (String nome : List.of("Miguel", "Julia", "Luisa", "Marcos", "Henrique")) {
            Estudante estudante = new Estudante(nome, ufmg);
            equipe2.adicionar(estudante);
            estudantes.adicionar(estudante);
        }
        equipes.adicionar(equipe2);

        // Orientadores
        Profissional orientador1 = new Profissional("Carlos", "12345678900", puc);
        Profissional orientador2 = new Profissional("Lucas", "00987654321", ufmg);

        // Projetos
        Projeto projeto1 = new Projeto(orientador1, equipe1, 0);
        Projeto projeto2 = new Projeto(orientador2, equipe2, 0);
        projetos.adicionar(projeto1);
        projetos.adicionar(projeto2);

        // Jurados
        Jurado j1 = new Jurado("Jurado A", "111", empresaJurados);
        Jurado j2 = new Jurado("Jurado B", "222", empresaJurados);
        Jurado j3 = new Jurado("Jurado C", "333", empresaJurados);
        Jurado j4 = new Jurado("Jurado D", "444", empresaJurados);
        juradosRepo.adicionar(j1);
        juradosRepo.adicionar(j2);
        juradosRepo.adicionar(j3);
        juradosRepo.adicionar(j4);

        // Notas por jurado para cada projeto
        Map<Jurado, Double> notasProjeto1 = Map.of(
            j1, 0.0,
            j2, 8.5,
            j3, 7.5,
            j4, 5.0
        );

        Map<Jurado, Double> notasProjeto2 = Map.of(
            j1, 10.0,
            j2, 10.0,
            j3, 10.0,
            j4, 10.0
        );

        // Bancas
        Banca banca1 = new Banca(projeto1, new HashMap<>(notasProjeto1));
        Banca banca2 = new Banca(projeto2, new HashMap<>(notasProjeto2));
        bancas.adicionar(banca1);
        bancas.adicionar(banca2);

        // Salas
        Sala sala1 = new Sala("Lab 101");
        Sala sala2 = new Sala("Lab 202");
        salas.adicionar(sala1);
        salas.adicionar(sala2);

        // Apresentações
        Apresentacao apresentacao1 = new Apresentacao(projeto1, banca1, sala1, LocalDateTime.now());
        Apresentacao apresentacao2 = new Apresentacao(projeto2, banca2, sala2, LocalDateTime.now());
        apresentacoes.adicionar(apresentacao1);
        apresentacoes.adicionar(apresentacao2);

        // Avaliação de todas as apresentações
        apresentacoes.listar().forEach(Apresentacao::avaliar);

        // Listar projetos aprovados (nota final ≥ 7)
        System.out.println("\n\nProjetos com notas >= 7:");
        projetos.listar().stream().filter(p -> p.getNotaFinal() >= 7).forEach(p -> System.out.printf("- %s: %.2f%n",p.getEquipe().getNome(), p.getNotaFinal()));
    }
}
