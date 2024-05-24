public class Vetor implements UmMonteDeNumero {
    // Já que a classe chama "Vetor" vamos usar..um vetor para resolver
    int vetor[];
    int indiceDaVez;

    // Construtor vai receber o tamanho do vetor e implementar com o tamanho pedido..
    public Vetor(int tamanho) {
        this.vetor = new int[tamanho];
        this.indiceDaVez = 0;
    }

    @Override
    public int buscar(int n) {
        int tamanho = this.vetor.length;

        //Percorrer o array
        for(int i=0; i<tamanho; i++){
            if (this.vetor[i] == n){
                // Retorna o índice caso tenha achado!
                return i;
            }
        }
        // Retorna -1 quando NÃO ACHOU!
        return -1;
    }

    @Override
    public void inserir(int n) {
        this.vetor[this.indiceDaVez] = n;
        this.indiceDaVez++;
    }

    @Override
    public int numero(int index) {
        return this.vetor[index];
    }

    @Override
    public void ordenar() {
        boolean troca = true;
        int aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < this.vetor.length - 1; i++) {
                if (this.vetor[i] > this.vetor[i + 1]) {
                    aux = this.vetor[i];
                    this.vetor[i] = this.vetor[i + 1];
                    this.vetor[i + 1] = aux;
                    troca = true;
                }
            }
        }
    }

    @Override
    public int tamanho() {
        return this.vetor.length;
    }

}