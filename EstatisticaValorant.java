public class EstatisticaValorant extends Estatistica {
    double kdRatio;

    public EstatisticaValorant(int partidasJogadas, int vitorias, double kdRatio) {
        super(partidasJogadas, vitorias);
        this.kdRatio = kdRatio;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Valorant - Partidas: " + partidasJogadas + ", Vitórias: " + vitorias + ", K/D: " + kdRatio);
    }
}
