package PersonalizadaA;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException{
    
    String nomeDoAtributo;

    public StringVaziaException(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }
    @Override
    public String getMessage() {
        return String.format("o atributo '%s' está vazio", nomeDoAtributo);
    }
}
