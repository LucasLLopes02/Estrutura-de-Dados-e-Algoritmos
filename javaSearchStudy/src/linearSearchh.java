public class linearSearchh {
    public static void main(String[] args) throws Exception {
        // Criar um array com os valores pré-definidos

        int array[]= {17, 20, 26, 31, 44, 54, 55, 65, 77, 93};
        int resultado = linearSearch (array, 77);
        System.out.println(resultado);
         
        // Criar um array com os valores aleatórios





    }

    // Função para busca linear
    public static int linearSearch(int arr[], int x){
        int n = arr.length;

        // Percorrer o array
        for(int i=0; i<n; i++){
            if (arr[i] == x){
                // Retorna o índice caso tenha achado!
                return i;
            }
        }
        // Retorna -1 quando não achou
        return -1;

    }
}