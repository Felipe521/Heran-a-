public class EstatisticaFortnite extends Estatistica {
    int abatesTotais;

    public EstatisticaFortnite(int partidasJogadas, int vitorias, int abatesTotais) {
        super(partidasJogadas, vitorias);
        this.abatesTotais = abatesTotais;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Fortnite - Partidas: " + partidasJogadas + ", Vitórias: " + vitorias + ", Abates: " + abatesTotais);
    }
}
