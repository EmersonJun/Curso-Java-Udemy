import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("manu");

        lista.add(u1);
        lista.add(new Usuario("carlos"));
        lista.add(new Usuario("marcos"));
        System.out.println("tem? "+ lista.contains(new Usuario("marcos")));

        System.out.println(lista.get(2  ));

        for (Usuario usuarios : lista) {
            System.out.println(usuarios.nome);
        }
        lista.remove(2);
        
        
        for (Usuario usuarios : lista) {
            System.out.println("\n");
            System.out.println(usuarios.nome);
        }
    }

}
