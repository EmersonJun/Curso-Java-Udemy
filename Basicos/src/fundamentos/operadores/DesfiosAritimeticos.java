package fundamentos.operadores;
public class DesfiosAritimeticos {
    public static void main(String[] args) {
        // int resultadofinal;

        // resultadofinal = (((int) Math.pow(6*(3+2), 2) / (3*2) - ((int) Math.pow((int) Math.pow(((1 - 5) * (2 - 7) / 2), 2), 3)) / (int) Math.pow(10, 3)));

        // System.out.println(resultadofinal);

        double n1 = Math.pow(6 * (3+2), 2);
        double denA = 3 * 2;
        double n2 = (1 - 5) * (2 - 7);
        double denB = 2;

        double superiorA = n1/denA;
        double superiorB = Math.pow(n2/denB, 2);

        double superior = Math.pow(superiorA - superiorB, 3);
        double inferior = Math.pow(10, 3);

        double resultadofinal = superior / inferior;
        System.out.println(resultadofinal);
    }
}
