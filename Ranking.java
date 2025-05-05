import java.util.ArrayList;

public class Ranking {
    Jogo jogo;
    ArrayList<Usuario> topPlayers;

    public Ranking(Jogo jogo) {
        this.jogo = jogo;
        this.topPlayers = new ArrayList<>();
    }

    public void adicionarUsuario(Usuario usuario) {
        topPlayers.add(usuario);
    }

    public void exibirRanking() {
        System.out.println("Ranking para o jogo: " + jogo.nome);
        for (Usuario u : topPlayers) {
            System.out.println("- " + u.nickname);
        }
    }
}
