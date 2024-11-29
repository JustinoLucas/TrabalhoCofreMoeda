package cofrinho;

import java.util.ArrayList;

public class Cofrinho {

    ArrayList<Moeda> dindin = new ArrayList<Moeda>(); // Lista de Array para o cofre

    public void adicionar(Moeda d) { // Metodo para adicionar moeda ao cofre
        dindin.add(d);
    }

    public void remover(String nomeTipo, double valor2) { // Metodo para remover moeda do cofre
        Moeda moedaRemove = null;
        final double EPSILON = 0.0001; // Margem de erro para comparação de doubles
        for (Moeda moeda : dindin) {
            if (moeda.info().equalsIgnoreCase(nomeTipo)) {  // Verifica o tipo da moeda com a do array
                moedaRemove = moeda;
                break;
            }
        }
        if (moedaRemove != null) {  // Verifica se moeda foi achada no cofre
            if (moedaRemove.valor >= valor2) {
                moedaRemove.valor -= valor2; // Subtrai o valor
                System.out.println("Removidos " + valor2 + " de " + nomeTipo + ".");
                if (Math.abs(moedaRemove.valor) < EPSILON) {
                    dindin.remove(moedaRemove); // Remove a moeda se o valor restante for zero
                    System.out.println(nomeTipo + " removido do cofrinho (saldo zerado).");
                }
            } else {
                System.out.println("Valor a remover maior que o disponível (" + moedaRemove.valor + ").");
            }
        } else {
            System.out.println("Tipo de Moeda não encontrada.");
        }

    }

    public void listar(){  // Metodo para Listar moedas no cofre
        if (dindin.isEmpty()) {
            System.out.println("Nenhuma moeda no cofre!");
        } else {
            System.out.println("Total de moedas no cofre: ");
            for (Moeda d : dindin) {
                System.out.println(d);
            }
        }
    }

    public double calcularConversao(){  // Metodo para Converter moedas para real
        double total = 0;
        for (Moeda d : dindin){
            total += d.converterReal();
        }
        return total;
    }


}
