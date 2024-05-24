public class App {
    public static void main(String[] args) throws Exception {
        // Instanciar um objeto do tipo Jogador...
        Jogador allejo = new Jogador((short) 7, "Allejo", "atacante");
        System.out.println(allejo);

        System.out.println("Nome do Jogador: "+allejo.getNome());

        Time oBrasilDeVerdade = new Time("Seleção Brasileira");
        // Escalação do time AGORA (ninguém, 0 jogadores)
        System.out.println(oBrasilDeVerdade);
    
        oBrasilDeVerdade.addJogador(allejo);
        System.out.println(oBrasilDeVerdade);
    
        Jogador daSilva = new Jogador((short) 1, "Da Silva", "goleiro");
        oBrasilDeVerdade.addJogador(daSilva);
        System.out.println(oBrasilDeVerdade);

        Jogador j3 = new Jogador((short) 11, "Gomez", "atacante");
        Jogador j4 = new Jogador((short) 17, "Canell", "M/F");
        oBrasilDeVerdade.addJogador(j3);
        oBrasilDeVerdade.addJogador(j4);
      
        System.out.println(oBrasilDeVerdade);

        //Remover o "Canell"
        oBrasilDeVerdade.remJogador(j4);

        System.out.println(oBrasilDeVerdade);
    }
}