import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int aluno = 0;
        double nota = 0;
        double media = 0;

        while (nota != -1) {
            System.out.println("insira uma nota para o aluno:");
            nota = scanner.nextDouble();
            
            if (nota <= 10 && nota >= 0) {
               media += nota; 
               aluno++;
            }
        }

        double m = media / aluno;
        System.out.println("media: " +m);
        scanner.close();
        // do{
        //     System.out.printf("insira a nota do aluno %d:\nPara sair digite -1\n", aluno++);
        //     nota = scanner.nextDouble();

        //     double media = (nota += nota) /aluno;
        //     System.out.println("media: "+media);

        // } while (!sair.equalsIgnoreCase("-1"));
        // System.out.println("obrigado pelas notas");
    }
}
