import java.util.Map;

/**
 * Representa uma banca avaliadora de um projeto.
 * Segue SRP: calcula nota final e mantém jurados.
 */
public class Banca implements Avaliavel {
    private final Projeto projetoAvaliado;
    private final Map<Jurado, Double> jurados;

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
            projetoAvaliado.setNotaFinal(0);
            return;
        }

        double media = jurados.values().stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);

        projetoAvaliado.setNotaFinal(media);
    }
}
