import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<Usuario>();

        usuarios.add(new Usuario("carlos"));
        usuarios.add(new Usuario("pedrp"));
        usuarios.add(new Usuario("joao"));

        boolean result = usuarios.add(new Usuario("joao"));
        System.out.println(result);
    }
}
