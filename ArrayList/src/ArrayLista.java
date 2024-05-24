import java.util.ArrayList;
import java.util.Collections;

public class ArrayLista implements UmMonteDeNumero {
    private ArrayList<Integer> lista;

    // Construtor vai receber o tamanho do vetor e implementar com o tamanho pedido..
    public ArrayLista() {
        this.lista = new ArrayList<>();
    }

    @Override
    public int buscar(int n) {
        return lista.indexOf(n);
    }

    @Override
    public boolean inserir(int n) {
        return lista.add(n);
    }

    @Override
    public int numero(int index) {
        return lista.get(index);
    }

    @Override
    public void ordenar() {
        Collections.sort(lista);
    }

    @Override
    public int tamanho() {
        return lista.size();
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo os elementos");
        for(int numero: this.lista){
            System.out.println(numero);
        }
    }
}