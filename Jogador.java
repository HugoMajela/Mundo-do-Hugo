
public abstract class Jogador {

    protected String nome;
    protected int vitorias=0;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getVitorias() {
        return vitorias;
    }

    
    public void incrementarVitoria() {
        vitorias++;
    }

    public abstract String escolherJogada();
}
