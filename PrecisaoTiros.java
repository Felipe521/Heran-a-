public class PrecisaoTiros {
    private int tirosCabeca;
    private int tirosPeito;
    private int tirosPerna;

    public PrecisaoTiros(int tirosCabeca, int tirosPeito, int tirosPerna) {
        this.tirosCabeca = tirosCabeca;
        this.tirosPeito = tirosPeito;
        this.tirosPerna = tirosPerna;
    }

    public void exibirPrecisao() {
        int total = tirosCabeca + tirosPeito + tirosPerna;
        if (total == 0) {
            System.out.println("Sem dados de precisão.");
            return;
        }

        System.out.println("Precisão de Tiros:");
        System.out.printf("Cabeça: %.2f%% | Peito: %.2f%% | Perna: %.2f%%\n",
                (tirosCabeca * 100.0) / total,
                (tirosPeito * 100.0) / total,
                (tirosPerna * 100.0) / total);
    }
}
