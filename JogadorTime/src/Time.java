//Importar a biblioteca de ArrayList
import java.util.ArrayList;

public class Time {
    private String nome;
    private ArrayList<Jogador> jogadores;

    //Construtor
    public Time(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<Jogador>();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Adiciona jogador
    public void addJogador(Jogador j) {
        this.jogadores.add(j);
    }

    //Remove jogador
    public void remJogador(Jogador j) {
        this.jogadores.remove(j);
    }

  //toString vai retornar o nome do time e a escalação completa
  public String toString() {
    String frase = this.nome + "\n";
    frase = frase + "Número de Jogadores: " + this.jogadores.size() + "\n\n";

    for(Jogador j: this.jogadores) {
      frase = frase + j + "\n";
    }
    
    return frase;
  }
}