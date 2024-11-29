package cofrinho;

public class Dolar extends Moeda{ // Classe Dolar com herança da classe Moeda

    public Dolar(double valor) { // Constructor Dolar
        super(valor); // Chama o construtor da classe Moeda para inicializar o atributo valor
    }

    @Override
    public double converterReal() { // Metodo de henrança que converte em real
        return valor * 6; // Valor * Cotação do Dolar
    }

    @Override
    public String info() { // Metodo que retorna o tipo da moeda
        return "Dolar";
    }
}
