public class ChecadaVsNaoChecada {
    public static void main(String[] args) {
        try {
            gerarErro1();            
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            gerarErro2();            
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
        System.out.println("fim:");
    }
    //execao nao checada ou verificada
    static void gerarErro1() throws RuntimeException{
        throw new RuntimeException("erro massa dma #1");
    }
    //execao checada ou verificada
    static void gerarErro2() throws Exception{
        throw new Exception("erro massa #2");
    }
}   