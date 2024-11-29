package cofrinho;

public abstract class Moeda {  // Classe Abstrata Moeda
    double valor; // Atributo para armazenar o valor da moeda

    public Moeda(double valor) { // Constructor de Moeda
        this.valor = valor; // Inicializa o valor
    }

    public abstract double converterReal(); // Metodo abstrato para converter em real

    public abstract String info();  // Metodo abstrato que será implementado pelas subclasses

    @Override
    public String toString() { // Metodo para retornar em formato de texto um objeto
        return info() + " - Valor: " + valor;
    }
}
