import br.com.filme.modelo.Filme;

public class Main {
    public static void main(String[] args) {

        // Declaração Filme 1
        Filme filme1 = new Filme();

        filme1.setNome("Jogos Vorazes e o Cantigo da serpente e do passáro");
        filme1.setAnoDeLancamento(2023);
        filme1.setDuracaoEmMinutos(230);
        filme1.setIncluidoNoPlano(true);

        filme1.avalia(4.2);
        filme1.avalia(5.0);
        filme1.avalia(2.0);

        // Declaração Filme 2
        Filme filme2 = new Filme();

        filme2.setNome("A freira");
        filme2.setAnoDeLancamento(2023);
        filme2.setDuracaoEmMinutos(150);
        filme2.setIncluidoNoPlano(false);

        filme2.avalia(5.0);
        filme2.avalia(5.0);
        filme2.avalia(2.0);

        System.out.println(filme1.exibeFichaTecnica());
        System.out.println(filme2.exibeFichaTecnica());
    }
}