public class CaixaInt<I> extends Caixa<I>{
    public static void main(String[] args) {
        CaixaInt<String>caixaA = new CaixaInt<>();
        caixaA.guardar("coisab");

        String coisaA = caixaA.abrir();
        System.out.println(coisaA);
    }
}
