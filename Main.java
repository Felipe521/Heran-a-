import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Usuario usuario = new Usuario("FelipePro");

        // Criando jogos e estatísticas
        Jogo valorant = new Jogo("Valorant", new EstatisticaValorant(100, 60, 1.35));
        Jogo fortnite = new Jogo("Fortnite", new EstatisticaFortnite(80, 40, 500));

        usuario.vincularJogo(valorant);
        usuario.vincularJogo(fortnite);

        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Ver estatísticas por jogo");
            System.out.println("2. Adicionar nova partida");
            System.out.println("3. Ver histórico de partidas");
            System.out.println("4. Vincular novo jogo");
            System.out.println("5. Sair");
            System.out.print("Escolha: ");
            opcao = input.nextInt();
            input.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    usuario.verEstatisticasPorJogo();
                    break;
                case 2:
                    System.out.print("Digite a data da partida: ");
                    String data = input.nextLine();
                    System.out.println("Escolha o jogo:");
                    for (int i = 0; i < usuario.jogosVinculados.size(); i++) {
                        System.out.println((i + 1) + ". " + usuario.jogosVinculados.get(i).nome);
                    }
                    int jogoIndex = input.nextInt() - 1;
                    System.out.print("Digite a pontuação: ");
                    int pontuacao = input.nextInt();
                    usuario.adicionarPartida(new Partida(data, usuario.jogosVinculados.get(jogoIndex), pontuacao));
                    break;
                case 3:
                    usuario.verHistorico();
                    break;
                case 4:
                    System.out.print("Nome do novo jogo: ");
                    String nomeJogo = input.nextLine();
                    // Adicionando com estatística genérica (valorant por padrão)
                    Jogo novoJogo = new Jogo(nomeJogo, new EstatisticaValorant(0, 0, 0));
                    usuario.vincularJogo(novoJogo);
                    break;
                case 5:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        input.close();
    }
}
