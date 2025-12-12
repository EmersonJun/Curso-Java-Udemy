public class CalculoTeste2 {
    public static void main(String[] args) {
        Calculos soma = (x, y) -> {return x + y;};
        System.out.println(soma.Calculos(3, 3));

        soma = (x, y) -> x - y;
        System.out.println(soma.legal());
        System.out.println(Calculos.muitoLegal());
    }
}
