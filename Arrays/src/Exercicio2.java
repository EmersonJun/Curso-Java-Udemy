import java.util.Arrays;
public class Exercicio2 {

    public static void main(String[] args) {
        double[] notasAlunoA = new double[3];
        System.out.println(Arrays.toString(notasAlunoA));

        notasAlunoA[0] = 9.9;
        notasAlunoA[1] = 9.3;
        notasAlunoA[2] = 3.9;

        System.out.println(Arrays.toString(notasAlunoA));

        double totalAlunoA = 0;
        for (double d : notasAlunoA) {
                totalAlunoA += d;
        }
        System.out.println(totalAlunoA / notasAlunoA.length);


        double[] notasAlunoB = {4, 8, 5.9, 9};
        System.out.println(Arrays.toString(notasAlunoB));
        double totalAlunoB = 0;
        for (double d2 : notasAlunoB) {
            totalAlunoB += d2;
        }
        System.out.println(totalAlunoB / notasAlunoB.length);
    }
}
