public class Aviao extends Veiculo {
    //Atributos
    private String prefixo;

    //Construtores
    public Aviao(){   
    }

    public Aviao(String marca, String modelo, String cor, int ano, long numChassi, String prefixo) {
        super(marca, modelo, cor, ano, numChassi);
        this.prefixo = prefixo;
    }

    //Getters and Setters
    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }
    
    // método locomover
    public void locomover() {
        System.out.println("O " + this.getMarca() + " " + this.getModelo() + " " + this.getCor() + " ano " + this.getAno() +" está voando!");
    }
}
