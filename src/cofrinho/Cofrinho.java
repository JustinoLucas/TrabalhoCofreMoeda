package cofrinho;

import java.util.ArrayList;

public class Cofrinho {

    ArrayList<Moeda> dindin = new ArrayList<Moeda>();

    public void adicionar(Moeda d) {
        dindin.add(d);
    }

    public void remover(Moeda d) {
        dindin.remove(d);
    }

    public void listar(){
        if (dindin.isEmpty()) {
            System.out.println("Nenhuma moeda no cofre!");
        } else {
            System.out.println("Total de moedas no cofre: ");
            for (Moeda d : dindin) {
                System.out.println(d);
            }
        }
    }

    public double calcularConversao(){
        double total = 0;
        for (Moeda d : dindin){
            total += d.converterReal();
        }
        return total;
    }


}
