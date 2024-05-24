import java.util.Arrays;

public class binaryTreeSearchh {
    public static void main(String[] args) throws Exception {
        // Criar um array com os valores pré-definidos

        /*
        int array[]= {17, 20, 26, 31, 44, 54, 55, 65, 77, 93};
        int resultado = binaryTreeSearch (array, 77);
        System.out.println(resultado);
         */

        // Criar um array com os valores aleatórios
        int quantidade = 1000;
        int[] vetor = new int[quantidade];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random()*quantidade);
        }

        long tempoInicial = System.currentTimeMillis();
        int resultado = binaryTreeSearch(vetor, 777);
        System.out.println(resultado);
        long tempoFinal = System.currentTimeMillis();

        System.out.println("Busca 'árvore binária' executada em = " + (tempoFinal - tempoInicial) + " ms");


        Arrays.sort(vetor);
    }

    

    // Função para busca na estratégia "árvore binária"
    public static int binaryTreeSearch(int arr[], int x){

        // variáveis
        int n = arr.length;
        int l = 0; //esquerdo
        int r = n - 1; //direita

        // Enquanto for possível "estreitar a árvore"
        while (l <= r){
            int mid = (l + r) / 2;

            // Se o número procurado estiver BEM no meio, ele retornará o índice (mid)
            if (arr[mid] == x){
                return mid;
            } else if(arr[mid] > x){ //número buscado é menor
                r = mid - 1;
            } else { //número buscado é maior
                l = mid + 1;
            }
        }
        return -1;
    }
}
