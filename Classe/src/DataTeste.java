public class DataTeste {
    public static void main(String[] args) {
        Data dataAtual = new Data(28, 11, 2025);
        Data aniversario = new Data();

        String dataFinal = dataAtual.obterDataFormatada();
        String aniversarioFinal = aniversario.obterDataFormatada();
        System.out.println(dataFinal);
        System.out.println(aniversarioFinal);
    }
}
