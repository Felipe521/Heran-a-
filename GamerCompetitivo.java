public class GamerCompetitivo extends Usuario {
    private Estatisticas estatisticas;

    public GamerCompetitivo(String nome, String nickname, int idade, Estatisticas estatisticas) {
        super(nome, nickname, idade);
        this.estatisticas = estatisticas;
    }

    @Override
    public void exibirPerfil() {
        System.out.println("\n== Gamer Competitivo ==");
        System.out.println("Nome: " + getNome());
        System.out.println("Nick: " + getNickname());
        System.out.println("Idade: " + getIdade());
        estatisticas.exibirEstatisticas();
    }
}
