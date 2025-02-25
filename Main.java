
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            JogoPedraPapelTesoura jogo = new JogoPedraPapelTesoura();
            JogadorMaquina maquina = new JogadorMaquina();
            maquina.setNome("Patrão Filipe");

            JogadorHumano eu = new JogadorHumano();

            System.out.println("Digite seu nome:");
            String nome = scanner.nextLine();
            eu.setNome(nome);

            System.out.println("Quantas rodadas deseja jogar?");
            int rodadas = scanner.nextInt();
            
            jogo.jogar(rodadas, eu, maquina);
        } catch (Exception e) {
            System.out.println("Erro inesperado. Verifique a entrada e tente novamente.");
        } finally {
            scanner.close();
        }
    }
}
