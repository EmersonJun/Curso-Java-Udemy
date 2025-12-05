public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
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
