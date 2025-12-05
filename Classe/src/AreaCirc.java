public class AreaCirc {
    final static double pi = 3.14;
    double raio;
    public AreaCirc(double raio) {
        this.raio = raio;
    }

    double area(){
        return pi * Math.pow(raio, 2);
    }
    static double area(double raio){
        return pi * Math.pow(raio, 2);
    }    
}
