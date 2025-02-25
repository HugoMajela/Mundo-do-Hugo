
import java.util.Scanner;

public class JogadorHumano extends Jogador {
    private String escolha;

    @Override
    public String escolherJogada() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println(nome + ", escolha: Pedra, Papel ou Tesoura");
                escolha = scanner.nextLine().trim().toLowerCase();
                
                if (escolha.equals("pedra") || escolha.equals("papel") || escolha.equals("tesoura")) {
                    break;
                } else {
                    System.out.println("Opção inválida! Escolha novamente.");
                }
            } catch (Exception e) {
                System.out.println("Erro ao processar sua escolha. Tente novamente.");
                scanner.nextLine();
            }
        }
        return escolha;
    }
}
