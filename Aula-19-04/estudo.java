public class estudo {

    public static void main (string[] args ) {
        for (Naipe n : Naipe.values()){
            System.out.println(n);
        }

        baralho baralho = new baralho(numero:1,Naipe.OURO);
        baralho.imprimirbaralho();
    }
}