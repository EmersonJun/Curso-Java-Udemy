public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a;

        a++;
        b--;

        System.out.println(a + " " + b);

        Data d1 = new Data(23, 05, 2006);
        Data d2 = d1;

        d1.dia = 15;
        d2.mes = 6;
        d1.ano = 2005;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        VoltarDataParaValorPadrao(d1);

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        int c = 5;
        AlterarPrimitivo(c);
        System.out.println(c);
    }
    static void VoltarDataParaValorPadrao(Data d){
        d.dia = 15;
        d.mes = 12;
        d.ano = 1979;   
    }
    static void AlterarPrimitivo(int a){
        a++;
    }
}
