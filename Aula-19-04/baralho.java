public class baralho {
    private int numero;
    private Naipe naipe;

    public baralho(int numero, Naipe naipe) {
        this.naipe = naipe; 
        this.numero = numero; 
    
    }
    public int getNumero() {
        return numero;
        
    }

    public void  setnumero (int numero) {
        this.numero = numero; 

    }

    public void  getNaipe (Naipe naipe) {
        this.naipe = naipe;

    }
        
    public void  ImprimirBaralho (){
        System.out.printlin("Sou" + numero + "de" + naipe)
    }
    
    

}