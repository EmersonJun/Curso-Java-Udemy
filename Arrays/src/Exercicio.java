import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[3];
        System.out.println(Arrays.toString(notasAlunoA));

        notasAlunoA[0] = 9.9;
        notasAlunoA[1] = 9.3;
        notasAlunoA[2] = 3.9;

        System.out.println(Arrays.toString(notasAlunoA));

        double totalAlunoA = 0;
        for(int i = 0; i < notasAlunoA.length; i++){
            totalAlunoA += notasAlunoA[i];
        }
        System.out.println(totalAlunoA / notasAlunoA.length);
        System.out.println(notasAlunoA[notasAlunoA.length - 1]);

        double notaArmazenada = 5.9;
        double[] notasAlunoB = {4, 8, notaArmazenada, 9};
        System.out.println(Arrays.toString(notasAlunoB));
        double totalAlunoB = 0;
        for(int i = 0; i < notasAlunoA.length; i++){
            totalAlunoB += notasAlunoA[i];
        }
        System.out.println(totalAlunoB / notasAlunoB.length);
    }
}
