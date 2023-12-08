package br.com.filme.modelo;

public class Filme extends Titulo {

    private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public String exibeFichaTecnica() {
        return super.exibeFichaTecnica().concat("Diretor: " + diretor);
    }
}
