import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // criando elementos auxiliares
        MapaFavorito mapa = new MapaFavorito("Dust II", 80);
        ArmaFavorita arma = new ArmaFavorita("AK-47", 320);
        PrecisaoTiros precisao = new PrecisaoTiros(150, 200, 50);

        Estatisticas statsFelipe = new Estatisticas(150, 90, 2.5, mapa, arma, precisao);

        Usuario felipe = new GamerCompetitivo("Felipe", "FeLiX", 19, statsFelipe);
        Usuario isabelle = new GamerCasual("Isabelle", "PrincessIza", 18);
        Usuario joao = new Streamer("João", "JowLive", 25, 15000);

        Trakker trakker = new Trakker();
        trakker.adicionarUsuario(felipe);
        trakker.adicionarUsuario(isabelle);
        trakker.adicionarUsuario(joao);

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU TRAKKER ---");
            System.out.println("1. Ver perfil de todos os usuários");
            System.out.println("2. Ver perfil de um usuário específico");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    trakker.mostrarRelatorio();
                    break;
                case 2:
                    System.out.print("Digite o nickname: ");
                    String nick = sc.nextLine();
                    boolean encontrado = false;
                    for (Usuario u : trakker.getUsuarios()) {
                        if (u.getNickname().equalsIgnoreCase(nick)) {
                            u.exibirPerfil(); // chamada polimórfica
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Usuário não encontrado.");
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
