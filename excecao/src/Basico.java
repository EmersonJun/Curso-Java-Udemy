public class Basico {
    public static void main(String[] args) {
        Aluno a1 = null;
        
        try {
           imprimir(a1); 
        } catch (Exception e) {
            System.out.println("erro ao imprimir");
        }
        
        try {
           System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            System.out.println("ocorreu o erro: "+ e.getMessage());
            //e.printStackTrace();
        }
        
        
        System.out.println("fim:");
    }

    public static void imprimir(Aluno aluno){
        System.out.println(aluno.nome);
    }
}
