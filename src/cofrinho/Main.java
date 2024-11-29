package cofrinho;

// Lucas Justino Turatto - RU: 4726794 - UNINTER - Cadastro, Listagem e Remocão de Moedas em Cofrinho
// https://github.com/JustinoLucas/TrabalhoCofreMoeda

import java.util.Scanner;  // Import da biblioteca para scanear um dado de entrada

public class Main {  // Classe Main

    public static void limpandoCsl() { // Metodo para limpar console !! NAO FUNCIONA EM IDE !! Só funciona em CMD do Windows ou Linux
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {  // Classe Estatica da Main onde acontece o programa

        int opcao;  // Inicialização da opção

        Scanner tecla = new Scanner(System.in);   // Inicialização da instancia Scanner
        Cofrinho cofrinho = new Cofrinho();  // Inicialização da instancia da classe Cofrinho

        System.out.println("<--------------------------------------->"); // Mostra o Menu inicial
        System.out.println("#         Cofrinho de Moedas            #");
        System.out.println("#                                       #");
        System.out.println("#         1 - Listar Moedas             #");
        System.out.println("#         2 - Adicionar Moedas          #");
        System.out.println("#         3 - Remover Moedas            #");
        System.out.println("#         4 - Calcular tudo para Real   #");
        System.out.println("#         0 - Encerrar Programa         #");
        System.out.println("<--------------------------------------->");
        System.out.println("Opção Selecionada: " + (opcao = tecla.nextInt()) + "\n");  // Pega entrada de dados digitada e transforma em Int se for Numero


        while (true) {  // Inicio do loop While
            switch (opcao) { // Switch case
                case 1:  // Case 1 para listar todas as moedas do cofre
                    limpandoCsl(); // Metodo para limpar console
                    cofrinho.listar(); // Metodo que lista as moedas
                    break;
                case 2:  // Case 2 para adicionar as moedas no cofre
                    limpandoCsl();
                    System.out.println("<--------------------------------------->");  // Menu de adicionar moedas
                    System.out.println("#         Adicionar Moedas              #");
                    System.out.println("#                                       #");
                    System.out.println("#         1 - Real                      #");
                    System.out.println("#         2 - Dolar                     #");
                    System.out.println("#         3 - Euro                      #");
                    System.out.println("<--------------------------------------->");
                    int tipo;
                    System.out.println("Opção Selecionada: " + (tipo = tecla.nextInt()) + "\n"); // Pega a entrada de dados digitada e transforma em Int se for Numero
                    System.out.println("Digite a quantidade do  valor da moeda: "); // Pega a entrada de dados digitada e transforma em Double
                    double valor = tecla.nextDouble();
                    Moeda d = null; // Declara a variável d - moeda - como nula inicialmente

                    if (tipo == 1) { // Decide qual moeda criar com base no tipo informado pelo usuário
                        d = new Real(valor); // Atribui a ela um objeto da subclasse Real
                                            // "new" essa palavra-chave cria uma nova instância objeto da classe especificada Real
                                            // "Real(valor)" Chama o construtor da classe Real e passa o valor para ele
                                            // O construtor é responsável por inicializar o objeto com os dados fornecidos
                    } else if (tipo == 2) {
                        d = new Dolar(valor);
                    } else if (tipo == 3) {
                        d = new Euro(valor);
                    } else {
                        System.out.println("Tipo inválido.");
                    }
                    if (d != null) cofrinho.adicionar(d); // Adiciona a moeda ao cofrinho se for válida
                    break;
                case 3: // Case 3 para remover moedas do cofrinho
                    limpandoCsl();
                    System.out.println("<--------------------------------------->"); // Inicio do Menu remover
                    System.out.println("#           Remover Moedas              #");
                    System.out.println("#                                       #");
                    System.out.println("#         1 - Real                      #");
                    System.out.println("#         2 - Dolar                     #");
                    System.out.println("#         3 - Euro                      #");
                    System.out.println("<--------------------------------------->");
                    int tipo2;
                    System.out.println("Opção Selecionada: " + (tipo2 = tecla.nextInt()) + "\n");
                    System.out.println("Digite a quantidade de valor da moeda para remover: ");
                    double valor2 = tecla.nextDouble();
                    String nomeTipo = null;

                    if (tipo2 == 1) { // Decide qual moeda remover com base no tipo informado pelo usuário
                      nomeTipo = "Real";
                    } else if (tipo2 == 2) {
                        nomeTipo = "Dolar";
                    } else if (tipo2 == 3) {
                        nomeTipo = "Euro";
                    } else {
                        System.out.println("Tipo inválido.");
                    }
                    if(nomeTipo != null)cofrinho.remover(nomeTipo, valor2); // Remove a moeda ao cofrinho se for válida
                    break;
                case 4: // Case 4 para listar total de moedas convertidas em Real
                    limpandoCsl();
                    System.out.printf("Total de moedas convertido para Real: R$ %.2f%n", cofrinho.calcularConversao());
                    break;
                case 0: // Case 0 para finalizar o Programa
                    System.out.println("Saindo...");
                    tecla.close();
                    return;
                default: // Opcao Default - opção invalida digitada
                    System.out.println(" - Opção Invalida!");
            }

            limpandoCsl();
            System.out.println("<--------------------------------------->");
            System.out.println("#         Cofrinho de Moedas            #");
            System.out.println("#                                       #");
            System.out.println("#         1 - Listar Moedas             #");
            System.out.println("#         2 - Adicionar Moedas          #");
            System.out.println("#         3 - Remover Moedas            #");
            System.out.println("#         4 - Calcular tudo para Real   #");
            System.out.println("#         0 - Encerrar Programa         #");
            System.out.println("<--------------------------------------->");
            System.out.println("Opção Selecionada: " + (opcao = tecla.nextInt()) + "\n");
        }
    }
}
