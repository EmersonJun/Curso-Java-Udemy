public class Motor {
    double fatorIngecao = 1;
    boolean ligado;

    int giros(){
        if (!ligado) {
            return 0;
        } else {
            return (int) Math.round(fatorIngecao * 3000);
        }
    }
}
