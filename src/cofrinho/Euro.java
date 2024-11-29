package cofrinho;

public class Euro extends Moeda{ // Classe Euro com herança da classe Moeda

    public Euro(double valor) { // Constructor Euro
        super(valor); // Chama o construtor da classe Moeda para inicializar o atributo valor
    }

    @Override
    public double converterReal() { // Metodo de henrança que converte em real
        return valor * 6.35; // Valor * Cotação do Euro
    }

    @Override
    public String info() { // Metodo que retorna o tipo da moeda
        return "Euro";
    }
}
