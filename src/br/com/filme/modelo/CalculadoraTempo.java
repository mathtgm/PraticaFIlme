package br.com.filme.modelo;

public class CalculadoraTempo {

    private int tempoTotal = 0;

    public void inclui(Titulo titulo) {
        tempoTotal += titulo.getDuracaoEmMinutos();
    }

    public int getTempoTotal() {
        return tempoTotal;
    }
}
