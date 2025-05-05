// representa um jogo jogado por um usuário
public class Jogo {
    private String nome;
    private int tempoDeJogo; // em horas

    public Jogo(String nome, int tempoDeJogo) {
        this.nome = nome;
        this.tempoDeJogo = tempoDeJogo;
    }

    // exibe as informações sobre o jogo
    public void exibirInformacoes() {
        System.out.println("Jogo: " + nome + " | Tempo jogado: " + tempoDeJogo + " horas.");
    }
}
