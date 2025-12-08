import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        //offer e add adicionam elementos na fila
        //a diferenca e o comportamento de quando a fila esta cheia
        fila.add("ana"); //lanca uma execao
        fila.offer("bia"); //retorna falso
        

        // a diferenca ocorre quando a fila esta vazia
        System.out.println(fila.peek()); //retorna falso
        System.out.println(fila.peek());
        System.out.println(fila.element()); //lanca uma execao
        System.out.println(fila.element());


        // fila.clear();
        // fila.isEmpty();
        // fila.size();

        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
    }
}
