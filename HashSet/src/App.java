import java.util.HashSet;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        HashMapExemplo1();
    }

    public static void HashSetExemplo1() {
        HashSet<String> cars = new HashSet<String>();
        System.out.println(cars.add("Volvo"));
        System.out.println(cars.add("BMW"));
        System.out.println(cars.add("Ford"));
        System.out.println(cars.add("BMW"));
        System.out.println(cars.add("Mazda"));
        System.out.println(cars);
    }

    public static void HashSetExemplo2() {
        HashSet<Produto> catalogo = new HashSet<Produto>();
        
        //Criei um objeto do tipo Produto com dados do Nintendo Switch
        Produto oProdSwitch = new Produto("Nintendo", "Switch", 1899);
        System.out.println(catalogo.add(oProdSwitch));

        //Criei um objeto do tipo Produto com dados do Master
        Produto oProdMaster = new Produto("Tectoy", "Master System", 360.05f);
        System.out.println(catalogo.add(oProdMaster));

        //Tentando colocar o objeto do Switch DE NOVO!
        System.out.println(catalogo.add(oProdSwitch));

        System.out.println("Número de produtos na coleção: "+catalogo.size());

        //Isso aqui não é copiar!!!
        //Produto oProdSwitchClone = oProdSwitch;

        //Mudei o preço
        oProdSwitch.setPreco(2000);
        System.out.println(catalogo.add(oProdSwitch));

        System.out.println("Número de produtos na coleção: "+catalogo.size());

        try {
            Produto oProdSwitchClone = (Produto) oProdSwitch.clone();
            oProdSwitchClone.setPreco(2400);
            System.out.println(catalogo.add(oProdSwitchClone));

            System.out.println("Número de produtos na coleção: "+catalogo.size());            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }  

    public static void HashMapExemplo1() {
        Produto oProdXbox = new Produto("Microsoft", "Xbox Series X 1tb Standard Cor Preto", 3890f);
        
        HashMap<String, Produto> catalogoComChave = new HashMap<String, Produto>();
        System.out.println(catalogoComChave.put("xboxChurrasqueira", oProdXbox));

        System.out.println("Produtos na coleção: "+catalogoComChave.size());

        System.out.println(catalogoComChave.get("xboxChurrasqueira"));
    }
}