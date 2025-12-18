public class CaixaObjetoTeste {
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.guardar(2.3); //double -> Double

        Double coisa = (Double) caixaA.abrir();
        System.out.println(coisa);


        CaixaObjeto caixaB = new CaixaObjeto();
        caixaB.guardar("ola"); //double -> Double

        Double coisaB = (Double) caixaB.abrir();
        System.out.println(coisaB);
    }
}
