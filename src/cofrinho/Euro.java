package cofrinho;

public class Euro extends Moeda{

    public Euro(double valor) {
        super(valor);
    }

    @Override
    public double converterReal() {
        return valor * 6.35;
    }

    @Override
    public String info() {
        return "Euro";
    }
}
