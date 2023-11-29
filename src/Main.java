import br.com.filme.modelo.Filme;
import br.com.filme.modelo.Serie;
import br.com.filme.modelo.Titulo;

public class Main {
    public static void main(String[] args) {

        // Declaração Filme 1
        Filme filme1 = new Filme();

        filme1.setNome("Jogos Vorazes e o Cantigo da serpente e do passáro");
        filme1.setAnoDeLancamento(2023);
        filme1.setDuracaoEmMinutos(230);
        filme1.setIncluidoNoPlano(true);
        filme1.setDiretor("Diretor Genérico 1");


        filme1.avalia(4.2);
        filme1.avalia(5.0);
        filme1.avalia(2.0);

        // Declaração Serie 1
        Serie serie1 = new Serie();

        serie1.setNome("Arrow");
        serie1.setAtiva(false);
        serie1.setAnoDeLancamento(2015);
        serie1.setEpisodiosTemporada(20);
        serie1.setTemporadas(6);
        serie1.setMinutosEpisodios(50);
        serie1.setIncluidoNoPlano(true);

        serie1.avalia(5);
        serie1.avalia(4.5);
        serie1.avalia(4.5);

        System.out.println(filme1.exibeFichaTecnica());
        System.out.println(serie1.exibeFichaTecnica());
    }
}