public class ParParesTeste {
    public static void main(String[] args) {
        Pares<Integer, String> resultadoConcurso = new Pares<>();


        resultadoConcurso.adicionar(1, "maria");
        resultadoConcurso.adicionar(2, "amr");
        resultadoConcurso.adicionar(3, "safaf");
        resultadoConcurso.adicionar(4, "asd");
        resultadoConcurso.adicionar(5, "sdsa");

        System.out.println(resultadoConcurso.getValor(1));
    } 
}
