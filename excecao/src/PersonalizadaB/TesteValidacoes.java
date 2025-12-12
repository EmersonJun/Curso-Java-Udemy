package PersonalizadaB;

public class TesteValidacoes {
    public static void main(String[] args) {

        try {
            Aluno a1 = new Aluno("", -7, false);
            Validar.aluno(a1); 
        } catch (StringVaziaException | NumeroNegativoException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        } //catch ( e) {
        //     System.out.println(e.getMessage());
        // }
        // Validar.aluno(null);        extends ou try catch
        
        System.out.println("fim...");
    }
}
