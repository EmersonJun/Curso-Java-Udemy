package encapsulamento;

public class Pessoa {
    private int idade;
    private String name;
    private String sobrenome;

    public Pessoa(int idade, String name, String sobrenome){
        this.idade = idade;
        this.name = name;
        this.sobrenome = sobrenome;
    }
    
    public int getIdade(){
        return idade;
    }
    public void setIdade(int novaIdade){
        if (novaIdade >= 0) {
            novaIdade = Math.abs(novaIdade);
            this.idade = novaIdade;    
        }   
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto(){
        return getName() +" "+ getSobrenome();
    }

    @Override
    public String toString() {
        return "Pessoa [idade=" + idade + ", name=" + name + "]";
    }
}
