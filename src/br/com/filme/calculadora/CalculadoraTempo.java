package br.com.filme.calculadora;

import br.com.filme.modelo.Titulo;

public class CalculadoraTempo {

    private int tempoTotal = 0;

    public void inclui(Titulo titulo) {
        tempoTotal += titulo.getDuracaoEmMinutos();
    }

    public int getTempoTotal() {
        return tempoTotal;
    }
}
