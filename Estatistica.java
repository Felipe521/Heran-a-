public abstract class Estatistica {
    int partidasJogadas;
    int vitorias;

    public Estatistica(int partidasJogadas, int vitorias) {
        this.partidasJogadas = partidasJogadas;
        this.vitorias = vitorias;
    }

    public abstract void exibirDetalhes();
}
