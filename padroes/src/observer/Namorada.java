package observer;

public class Namorada implements ObservadorChegadaAniversariante{
    public void chegou(EventoChegadaAniversariante evento){
        System.out.println("avisar os convidados");
        System.out.println("apagar as luzes");
        System.out.println("esperar um pouco");
        System.out.println("surpresa");

        
    }
}
