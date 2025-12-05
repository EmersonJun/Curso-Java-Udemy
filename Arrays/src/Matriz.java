import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("quantas alunos voce quer informar");
        int ArrayDeAlunos = scanner.nextInt();
        System.out.println("quantas notas voce quer informar");
        int ArrayDeNotas = scanner.nextInt();
        
        // double[] alunos = new double[ArrayDeAlunos];
        // double[] notas = new double[ArrayDeNotas]; 
        double[][] notasDaTurma =new double[ArrayDeAlunos][ArrayDeNotas];

        double total = 0;
        for(int i = 0; i < notasDaTurma.length; i++){
            for(int a = 0; a < notasDaTurma[i].length; a++){
                System.out.printf("Digite a nota %d do aluno %d: ", a+1, i+1);
                notasDaTurma[i][a] = scanner.nextDouble();
                total += notasDaTurma[i][a];
            }
        }
        double media = total / (ArrayDeAlunos * ArrayDeNotas);
        System.out.println(media);

        scanner.close();
    }
}
