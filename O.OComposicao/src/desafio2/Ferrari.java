package desafio2;

public class Ferrari extends Carro implements Esportivo, Luxo{
    private boolean ligarTurbo;
    private boolean ligarAr;
    public Ferrari(){
        super(300);
        setDelta(15);
    }
    // Ferrari(int velocidadeMaxima){
    //     super(velocidadeMaxima);
    //     delta = 15;
    // }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }
    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }
    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    public int getDelta(){
        if (ligarTurbo && !ligarAr) {
            return 30;
        } else if (ligarTurbo && ligarAr){
            return 20;
        } else if (!ligarTurbo && !ligarAr) {
            return 15;            
        } else{
            return 10;
        }
    }
    // @Override
    // void acelerar() {
    //     velocidade += 25;
    // }
    
}
