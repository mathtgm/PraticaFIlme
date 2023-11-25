public class Filme {

    String nome;
    int anoDeLancamento;
    int duracaoEmMinutos;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public String exibeFichaTecnica() {
        return """
                ****************** %s ******************
                Ano de lançamento: %d
                Duração: %d min
                Incluido no plano: %b
                Nota: %.2f/5 (%d)
                """.formatted(nome.toUpperCase(), anoDeLancamento, duracaoEmMinutos, incluidoNoPlano, somaDasAvaliacoes / totalDeAvaliacoes, totalDeAvaliacoes);
    }
}
