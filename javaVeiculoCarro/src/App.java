public class App {
    public static void main(String[] args) throws Exception {
        // CLasse abstrata não deixa eu fazer um objeto a partir dela... o comando abaixo dá erro...
        //Veiculo meuVeiculo = new Veiculo();

        Carro meuCarro = new Carro("Fiat", "Uno Vivace", "preto", 2012, 1212121777552121l, "ABC-1DEF");
        meuCarro.locomover();
        
    }
}