package PersonalizadaB;

@SuppressWarnings("serial")
public class NumeroNegativoException extends RuntimeException{
    String nomeDoAtributo;
    public NumeroNegativoException(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }
     @Override
    public String getMessage() {
        return String.format("o atributo '%s' está negativo ou inválido", nomeDoAtributo);
    }

}
