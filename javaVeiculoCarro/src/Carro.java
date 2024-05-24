public class Carro extends Veiculo {
    //Atributos
    private String placa;

    //Construtores
    public Carro(){   
    }

    public Carro(String marca, String modelo, String cor, int ano, long numChassi, String placa) {
        super(marca, modelo, cor, ano, numChassi);
        this.placa = placa;
    }

    //Getters and Setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    // método locomover
    public void locomover() {
        // System.out.println("O "+marca+" "+modelo+" está se locomovendo!");
        // desafio faz o locomover ficar assim, responder assim: O Fiat Uno Vivace preto
        // ano 2012 está se locomovendo!
        System.out.println("O " + this.getMarca() + " " + this.getModelo() + " " + this.getCor() + " ano " + this.getAno() + " de placa "+this.getPlaca()+" está rodando!");
    }
    
}
