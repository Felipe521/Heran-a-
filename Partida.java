public class Partida {
    String data;
    Jogo jogo;
    int pontuacao;

    public Partida(String data, Jogo jogo, int pontuacao) {
        this.data = data;
        this.jogo = jogo;
        this.pontuacao = pontuacao;
    }

    public void exibirResumoPartida() {
        System.out.println("Data: " + data + " | Jogo: " + jogo.nome + " | Pontuação: " + pontuacao);
    }
}
