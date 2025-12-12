@FunctionalInterface
public interface Calculos {

    public double Calculos (double a, double b);

    default String legal(){
        return "legal";
    }
    static String muitoLegal(){
        return "legal";
    }
}
