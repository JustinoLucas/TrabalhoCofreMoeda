package cofrinho;

public class Real extends Moeda{


    public Real(double valor) {
        super(valor);
    }

    @Override
    public double converterReal() {
        return valor;
    }

    @Override
    public String info() {
        return "Real";
    }
}
