import java.time.LocalDateTime;

public class Apresentacao {
    private Projeto projeto;
    private Avaliavel banca;
    private Sala local;
    private LocalDateTime dataHora;

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

    public void avaliar() {
        banca.calcularNotaFinal();
    }
}
