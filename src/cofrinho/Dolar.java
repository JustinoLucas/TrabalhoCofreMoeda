package cofrinho;

public class Dolar extends Moeda{

    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public double converterReal() {
        return valor * 6;
    }

    @Override
    public String info() {
        return "Dolar";
    }
}
