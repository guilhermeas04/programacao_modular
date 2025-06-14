public class Profissional extends Pessoa {
    private String cpf;

    public Profissional(String nome, String cpf, Instituicao instituicao) {
        super(nome, instituicao);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
