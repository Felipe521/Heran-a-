public class GamerCasual extends Usuario {
    public GamerCasual(String nome, String nickname, int idade) {
        super(nome, nickname, idade);
    }

    @Override
    public void exibirPerfil() {
        System.out.println("\n== Gamer Casual ==");
        System.out.println("Nome: " + getNome());
        System.out.println("Nick: " + getNickname());
        System.out.println("Idade: " + getIdade());
        System.out.println("Estatísticas não disponíveis para jogadores casuais.");
    }
}
