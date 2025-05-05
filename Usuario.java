import java.util.ArrayList;

public class Usuario {
    String nickname;
    ArrayList<Jogo> jogosVinculados;
    ArrayList<Partida> historicoPartidas;

    public Usuario(String nickname) {
        this.nickname = nickname;
        this.jogosVinculados = new ArrayList<>();
        this.historicoPartidas = new ArrayList<>();
    }

    public void vincularJogo(Jogo jogo) {
        jogosVinculados.add(jogo);
        System.out.println("Jogo " + jogo.nome + " vinculado ao perfil!");
    }

    public void adicionarPartida(Partida partida) {
        historicoPartidas.add(partida);
        System.out.println("Partida adicionada: " + partida.jogo.nome + " - Pontuação: " + partida.pontuacao);
    }

    public void verEstatisticasPorJogo() {
        for (Jogo jogo : jogosVinculados) {
            jogo.exibirResumoEstatisticas();
        }
    }

    public void verHistorico() {
        for (Partida partida : historicoPartidas) {
            partida.exibirResumoPartida();
        }
    }
}
