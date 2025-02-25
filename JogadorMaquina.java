import java.util.Random;

public class JogadorMaquina extends Jogador {
    private final String[] opcoes = {"pedra", "papel", "tesoura"};
    
    @Override
    public String escolherJogada() {
        Random random = new Random();
        return opcoes[random.nextInt(opcoes.length)];
    }
}