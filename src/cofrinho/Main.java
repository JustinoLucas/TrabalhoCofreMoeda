package cofrinho;

// Lucas Justino - UNINTER - Cadastro, Listagem e Remocão de Moedas em Cofrinho

import java.util.Scanner;

public class Main {

    public static void limpandoCsl() { // Metodo para limpar console !! NAO FUNCIONA EM IDE !! Só funciona em CMD do Windows ou Linux
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {

        int opcao;

        Scanner tecla = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();

        System.out.println("<--------------------------------------->");
        System.out.println("#                                       #");
        System.out.println("#         Cofrinho de Moedas            #");
        System.out.println("#                                       #");
        System.out.println("#         1 - Listar Moedas             #");
        System.out.println("#         2 - Adicionar Moedas          #");
        System.out.println("#         3 - Remover Moedas            #");
        System.out.println("#         4 - Calcular tudo para Real   #");
        System.out.println("#         0 - Encerrar Programa         #");
        System.out.println("#                                       #");
        System.out.println("<--------------------------------------->");
        System.out.println("Opção Selecionada: " + (opcao = tecla.nextInt()) + "\n");


        while (true) {
            switch (opcao) {
                case 1:
                    limpandoCsl();
                    cofrinho.listar();
                    break;
                case 2:
                    limpandoCsl();
                    System.out.println("<--------------------------------------->");
                    System.out.println("#         Adicionar Moedas              #");
                    System.out.println("#                                       #");
                    System.out.println("#         1 - Real                      #");
                    System.out.println("#         2 - Dolar                     #");
                    System.out.println("#         3 - Euro                      #");
                    System.out.println("#                                       #");
                    System.out.println("<--------------------------------------->");
                    int tipo = tecla.nextInt();
                    System.out.println("Digite a quantidade do valor da moeda: ");
                    double valor = tecla.nextDouble();
                    Moeda d = null;

                    if (tipo == 1) {
                        d = new Real(valor);
                    } else if (tipo == 2) {
                        d = new Dolar(valor);
                    } else if (tipo == 3) {
                        d = new Euro(valor);
                    } else {
                        System.out.println("Tipo inválido.");
                    }
                    if (d != null) cofrinho.adicionar(d);
                    break;
                case 3:
                    limpandoCsl();
                    System.out.println("<--------------------------------------->");
                    System.out.println("#           Remover Moedas              #");
                    System.out.println("#                                       #");
                    System.out.println("#         1 - Real                      #");
                    System.out.println("#         2 - Dolar                     #");
                    System.out.println("#         3 - Euro                      #");
                    System.out.println("#                                       #");
                    System.out.println("<--------------------------------------->");
                    int tipo2 = tecla.nextInt();
                    System.out.println("Digite a quantidade de valor da moeda para remover: ");
                    double valor2 = tecla.nextDouble();
                    String nomeTipo = null;

                    if (tipo2 == 1) {
                      nomeTipo = "Real";
                    } else if (tipo2 == 2) {
                        nomeTipo = "Dolar";
                    } else if (tipo2 == 3) {
                        nomeTipo = "Euro";
                    } else {
                        System.out.println("Tipo inválido.");
                    }
                    if(nomeTipo != null)cofrinho.remover(nomeTipo, valor2);
                    break;
                case 4:
                    limpandoCsl();
                    System.out.printf("Total de moedas convertido para Real: R$ %.2f%n", cofrinho.calcularConversao());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    tecla.close();
                    return;
                default:
                    System.out.println(" - Opção Invalida!");
            }

            limpandoCsl();
            System.out.println("<--------------------------------------->");
            System.out.println("#                                       #");
            System.out.println("#         Cofrinho de Moedas            #");
            System.out.println("#                                       #");
            System.out.println("#         1 - Listar Moedas             #");
            System.out.println("#         2 - Adicionar Moedas          #");
            System.out.println("#         3 - Remover Moedas            #");
            System.out.println("#         4 - Calcular tudo para Real   #");
            System.out.println("#         0 - Encerrar Programa         #");
            System.out.println("#                                       #");
            System.out.println("<--------------------------------------->");
            System.out.print("         Opção Selecionada: " + (opcao = tecla.nextInt()));
        }
    }
}
