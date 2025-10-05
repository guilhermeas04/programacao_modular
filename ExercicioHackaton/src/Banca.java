import java.util.Map;

public class Banca implements Avaliavel {
    private Projeto projetoAvaliado;
    private Map<Jurado, Double> jurados;

    public Banca(Projeto projetoAvaliado, Map<Jurado, Double> jurados) {
        this.projetoAvaliado = projetoAvaliado;
        this.jurados = jurados;
    }

    public Map<Jurado, Double> getJurados() {
        return jurados;
    }

    public Projeto getProjetoAvaliado() {
        return projetoAvaliado;
    }

    @Override
    public void calcularNotaFinal() {
        if (jurados == null || jurados.isEmpty()) {
            projetoAvaliado.setNotaFinal(0); // ou lança exceção
            return;
        }

        double media = jurados.values().stream().mapToDouble(Double::doubleValue).average().orElse(0.0);

        projetoAvaliado.setNotaFinal(media);
    }

}
