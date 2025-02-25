
public class JogoPedraPapelTesoura implements InterfaceJogo {

    @Override
    public void jogar(int rodadas, JogadorHumano jogador, JogadorMaquina maquina) {
        for (int i = 0; i < rodadas; i++) {
            System.out.println("\nRodada " + (i + 1));
            String escolhaJogador = jogador.escolherJogada();
            String escolhaMaquina = maquina.escolherJogada();

            System.out.println(jogador.getNome() + " escolheu: " + escolhaJogador);
            System.out.println(maquina.getNome() + " escolheu: " + escolhaMaquina);

            String resultado = determinarVencedor(escolhaJogador, escolhaMaquina);
            if (resultado.equals("jogador")) {
                jogador.incrementarVitoria();
            } else if (resultado.equals("máquina")) {
                maquina.incrementarVitoria();
            }
        }
        exibirResultado(jogador, maquina);
    }

    private String determinarVencedor(String escolhaJogador, String escolhaMaquina) {
        if (escolhaJogador.equals(escolhaMaquina)) {
            System.out.println("Empate!");
            return "empate";
        }

        if ((escolhaJogador.equals("pedra") && escolhaMaquina.equals("tesoura"))
                || (escolhaJogador.equals("papel") && escolhaMaquina.equals("pedra"))
                || (escolhaJogador.equals("tesoura") && escolhaMaquina.equals("papel"))) {
            System.out.println("Você venceu esta rodada!");
            return "jogador";
        } else {
            System.out.println("A máquina venceu esta rodada!");
            return "máquina";
        }
    }

    @Override
    public void exibirResultado(JogadorHumano jogador, JogadorMaquina maquina) {
        System.out.println("\nResultado Final:");
        System.out.println(jogador.getNome() + " venceu " + jogador.getVitorias() + " vezes.");
        System.out.println(maquina.getNome() + " venceu " + maquina.getVitorias() + " vezes.");

        if (jogador.getVitorias() > maquina.getVitorias()) {
            System.out.println("Parabéns! Você venceu o jogo!");
        } else if (jogador.getVitorias() < maquina.getVitorias()) {
            System.out.println("A máquina venceu o jogo. Tente novamente!");
        } else {
            System.out.println("O jogo terminou empatado!");
        }
    }
}
