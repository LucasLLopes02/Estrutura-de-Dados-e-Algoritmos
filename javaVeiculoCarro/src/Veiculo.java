public abstract class Veiculo {
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    protected long numChassi;

    //Construtores
    public Veiculo() {
    }
    
    public Veiculo(String marca, String modelo, String cor, int ano, long numChassi) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.numChassi = numChassi;
    }

    //Getters and Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public long getNumChassi() {
        return numChassi;
    }

    public void setNumChassi(long numChassi) {
        this.numChassi = numChassi;
    }

     
    // método locomover
  public void locomover() {
    // System.out.println("O "+marca+" "+modelo+" está se locomovendo!");
    // desafio faz o locomover ficar assim, responder assim: O Fiat Uno Vivace preto
    // ano 2012 está se locomovendo!
    System.out
        .println("O " + this.getMarca() + " " + this.getModelo() + " " + this.getCor() + " ano " + this.getAno() + " está se locomovendo!");
    }
}
