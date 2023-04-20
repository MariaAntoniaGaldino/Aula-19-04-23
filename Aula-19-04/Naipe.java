public enum Naipe {
    OURO   ("vermelho"),
    PAUS   ("preto"),
    COPAS  ("vermelho")
    ESPADAS("preto");

    Naipe (String cor){
        this.cor = cor; 
    }

    private String cor;
    public String getcor (){
        return this.cor;
    }
}