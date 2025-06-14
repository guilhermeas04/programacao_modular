public class Projeto {
    private Profissional orientador;
    private Equipe equipe;
    private double notaFinal;

    public Projeto(Profissional orientador, Equipe equipe, double notaFinal) {
        this.orientador = orientador;
        this.equipe = equipe;
        this.notaFinal = notaFinal;
    }
    public Projeto(Profissional orientador, Equipe equipe) {
        this(orientador, equipe, 0.0);
    }


    public Profissional getOrientador() {
        return orientador;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
}
