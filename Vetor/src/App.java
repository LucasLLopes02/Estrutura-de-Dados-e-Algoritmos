public class App {
    public static void main(String[] args) throws Exception {
        // Usando a estrutura Vetor..
        Vetor meuVetor = new Vetor(10);
        System.out.println(meuVetor.tamanho());

        meuVetor.inserir(20);
        meuVetor.inserir(56);

        System.out.println(meuVetor.buscar(56));
        System.out.println(meuVetor.buscar(22));

        System.out.println(meuVetor.numero(0));

        System.out.println(meuVetor.numero(11));


    }
}