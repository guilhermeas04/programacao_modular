import java.time.LocalDateTime;

/**
 * Representa uma apresentação de projeto em uma banca.
 * Segue o princípio SRP: apenas mantém dados e aciona a avaliação.
 */
public class Apresentacao {
    private final Projeto projeto;
    private final Avaliavel banca;
    private final Sala local;
    private final LocalDateTime dataHora;

    public Apresentacao(Projeto projeto, Avaliavel banca, Sala local, LocalDateTime dataHora) {
        this.projeto = projeto;
        this.banca = banca;
        this.local = local;
        this.dataHora = dataHora;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public Avaliavel getBanca() {
        return banca;
    }

    public Sala getLocal() {
        return local;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    /**
     * Avalia o projeto usando a banca associada.
     */
    public void avaliar() {
        banca.calcularNotaFinal();
    }
}
