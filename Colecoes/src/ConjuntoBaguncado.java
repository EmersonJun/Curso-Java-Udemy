import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        HashSet conjunto = new HashSet<>();
        
        conjunto.add("Teste");
        conjunto.add(1.3);
        conjunto.add('x');
        conjunto.add(1);
        conjunto.add(true);

        System.out.println("o tamanho é: "+ conjunto.size());

        conjunto.add("Teste");
        conjunto.add('x');

        System.out.println("o tamanho é: "+ conjunto.size());

        conjunto.remove("teste");
        conjunto.remove("Teste");
        conjunto.remove('x');

        System.out.println("o tamanho é: "+ conjunto.size());

        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(true));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        // conjunto.addAll(nums); //uniao entre dois conjuntos
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);
    }
}
