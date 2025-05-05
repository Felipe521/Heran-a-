public class Jogo {
    String nome;
    Estatistica estatistica;

    public Jogo(String nome, Estatistica estatistica) {
        this.nome = nome;
        this.estatistica = estatistica;
    }

    public void exibirResumoEstatisticas() {
        System.out.println("Jogo: " + nome);
        estatistica.exibirDetalhes(); // chamada polimórfica
    }
}
