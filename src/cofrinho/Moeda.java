package cofrinho;

public abstract class Moeda {
    double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public abstract double converterReal();

    public abstract String info();

    @Override
    public String toString() {
        return info() + " - Valor: " + valor;
    }
}
