public class Produto {
    String nome;
    double preco;
    double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }
    
    Produto (){
        //construtor padrao
    }

    double precoComDesconto(double descontoDoGerente){
        return preco * (1 - (desconto + descontoDoGerente));
    }
    
    float precoComDesconto(){
        return (float) (preco * (1 - desconto));
    }

}
