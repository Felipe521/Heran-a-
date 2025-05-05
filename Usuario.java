public abstract class Usuario {
    private String nome;
    private String nickname;
    private int idade;

    public Usuario(String nome, String nickname, int idade) {
        this.nome = nome;
        this.nickname = nickname;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getNickname() {
        return nickname;
    }

    public int getIdade() {
        return idade;
    }

    public abstract void exibirPerfil();
}
