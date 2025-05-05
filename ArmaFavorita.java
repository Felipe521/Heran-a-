public class ArmaFavorita {
    private String nomeArma;
    private int eliminacoes;

    public ArmaFavorita(String nomeArma, int eliminacoes) {
        this.nomeArma = nomeArma;
        this.eliminacoes = eliminacoes;
    }

    public void exibirArma() {
        System.out.println("Arma favorita: " + nomeArma + " (" + eliminacoes + " eliminações)");
    }
}
