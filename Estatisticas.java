public class Estatisticas {
    private int partidas;
    private int vitorias;
    private double kdr;
    private MapaFavorito mapa;
    private ArmaFavorita arma;
    private PrecisaoTiros precisao;

    public Estatisticas(int partidas, int vitorias, double kdr, MapaFavorito mapa, ArmaFavorita arma, PrecisaoTiros precisao) {
        this.partidas = partidas;
        this.vitorias = vitorias;
        this.kdr = kdr;
        this.mapa = mapa;
        this.arma = arma;
        this.precisao = precisao;
    }

    public void exibirEstatisticas() {
        System.out.println("Partidas jogadas: " + partidas);
        System.out.println("Vitórias: " + vitorias);
        System.out.println("K/D Ratio: " + kdr);
        mapa.exibirMapa();
        arma.exibirArma();
        precisao.exibirPrecisao();
    }
}
