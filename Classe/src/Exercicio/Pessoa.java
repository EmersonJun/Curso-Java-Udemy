package Exercicio;

public class Pessoa {
        String nome;
        double peso;

        public Pessoa(String nome, double peso) {
            this.nome = nome;
            this.peso = peso;
        }

        void Comer(Comida comida){
            if (comida != null) {
                this.peso += comida.pesoComida;
            }
        }
        String apresentar(){
            return "ola sou o " +nome+ " e tenho o peso de " +peso+ "kg"; 
        }
}
