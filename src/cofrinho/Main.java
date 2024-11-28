package cofrinho;

// Lucas Justino - UNINTER - Cadastro, Listagem e Remocão de Moedas em Cofrinho

import java.util.Scanner;

public class Main {

    public static void limpandoCsl() {
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
        System.out.println("Opção Selecionada: " + (opcao = tecla.nextInt()));


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

                    break;
                case 4:
                    limpandoCsl();

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
