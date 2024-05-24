public class Moto extends Veiculo {
    //Atributos
    private String placa;

    //Construtores
    public Moto(){   
    }

    public Moto(String marca, String modelo, String cor, int ano, long numChassi, String placa) {
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
}
