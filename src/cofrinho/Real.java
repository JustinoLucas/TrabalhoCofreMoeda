package cofrinho;

public class Real extends Moeda{ // Classe Real com herança da classe Moeda


    public Real(double valor) { // Constructor Real
        super(valor); // Chama o construtor da classe Moeda para inicializar o atributo valor, Inicializa o valor na classe pai (Moeda)
    }

    @Override
    public double converterReal() {  // Metodo de henrança que converte em real
        return valor; // Retorna o valor em real
    }

    @Override
    public String info() { // Metodo que retorna o tipo da moeda
        return "Real";
    }
}
