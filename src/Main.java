public class Main {
    public static void main(String[] args) {

        // Declaração Filme 1
        Filme filme1 = new Filme();

        filme1.nome = "Jogos Vorazes e o Cantigo da serpente e do passáro";
        filme1.anoDeLancamento = 2023;
        filme1.duracaoEmMinutos = 230;
        filme1.incluidoNoPlano = true;

        filme1.avalia(4.2);
        filme1.avalia(5.0);
        filme1.avalia(2.0);

        // Declaração Filme 2
        Filme filme2 = new Filme();

        filme2.nome = "A freira";
        filme2.anoDeLancamento = 2023;
        filme2.duracaoEmMinutos = 150;
        filme2.incluidoNoPlano = false;

        filme2.avalia(5.0);
        filme2.avalia(5.0);
        filme2.avalia(2.0);

        System.out.println(filme1.exibeFichaTecnica());
        System.out.println(filme2.exibeFichaTecnica());
    }
}