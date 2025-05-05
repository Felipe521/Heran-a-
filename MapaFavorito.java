public class MapaFavorito {
    private String nomeMapa;
    private int vezesJogado;

    public MapaFavorito(String nomeMapa, int vezesJogado) {
        this.nomeMapa = nomeMapa;
        this.vezesJogado = vezesJogado;
    }

    public void exibirMapa() {
        System.out.println("Mapa favorito: " + nomeMapa + " (jogado " + vezesJogado + " vezes)");
    }
}
