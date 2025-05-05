public class Streamer extends Usuario {
    private int seguidores;

    public Streamer(String nome, String nickname, int idade, int seguidores) {
        super(nome, nickname, idade);
        this.seguidores = seguidores;
    }

    @Override
    public void exibirPerfil() {
        System.out.println("\n== Streamer ==");
        System.out.println("Nome: " + getNome());
        System.out.println("Nick: " + getNickname());
        System.out.println("Idade: " + getIdade());
        System.out.println("Seguidores: " + seguidores);
    }
}
