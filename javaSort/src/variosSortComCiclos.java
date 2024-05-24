import java.io.IOException;

public class variosSortComCiclos {
    public static void main(String[] args) {
        int[] vetor = {10, 30, -26, 7, -5, 12, 8, 9, 0, 11, -2, -21, 15, 13, 14, 5, 6, -4, -17, 20}; // Números fornecidos diretamente

        long tempoInicial = System.currentTimeMillis();

        // Escolha o algoritmo de ordenação descomentando a linha correspondente

        // bubbleSort(vetor);
        // selectionSort(vetor);
        // insertionSort(vetor);
        // quickSort(vetor, 0, vetor.length - 1);

        long tempoFinal = System.currentTimeMillis();

        System.out.println("Vetor ordenado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("\n");

        System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");
    }

    // Métodos de ordenação e contagem de ciclos aqui...



    private static void bubbleSort(int vetor[]) {
        int ciclos = 0;
        boolean troca = true;
        int aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                ciclos++;
                if (vetor[i] > vetor[i + 1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;
                }
            }
        }
        System.out.println("Ciclos do Bubble Sort: " + ciclos);
    }

    public static void selectionSort(int[] array) {
        int ciclos = 0;
        for (int fixo = 0; fixo < array.length - 1; fixo++) {
            int menor = fixo;

            for (int i = menor + 1; i < array.length; i++) {
                ciclos++;
                if (array[i] < array[menor]) {
                    menor = i;
                }
            }
            if (menor != fixo) {
                int t = array[fixo];
                array[fixo] = array[menor];
                array[menor] = t;
            }
        }
        System.out.println("Ciclos do Selection Sort: " + ciclos);
    }

    public static void insertionSort(int[] vetor) {
        int ciclos = 0;
        int j;
        int key;
        int i;

        for (j = 1; j < vetor.length; j++) {
            key = vetor[j];
            for (i = j - 1; (i >= 0) && (vetor[i] > key); i--) {
                ciclos++;
                vetor[i + 1] = vetor[i];
            }
            vetor[i + 1] = key;
        }
        System.out.println("Ciclos do Insertion Sort: " + ciclos);
    }

    private static void quickSort(int[] vetor, int inicio, int fim) {
        int ciclos = 0;
        if (inicio < fim) {
            int posicaoPivo = separar(vetor, inicio, fim, ciclos);
            quickSort(vetor, inicio, posicaoPivo - 1);
            quickSort(vetor, posicaoPivo + 1, fim);
        }
        System.out.println("Ciclos do Quick Sort: " + ciclos);
    }

    private static int separar(int[] vetor, int inicio, int fim, int ciclos) {
        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            ciclos++;
            if (vetor[i] <= pivo)
                i++;
            else if (pivo < vetor[f])
                f--;
            else {
                int troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }
}
