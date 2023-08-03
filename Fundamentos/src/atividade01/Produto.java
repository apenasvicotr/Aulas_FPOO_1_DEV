package atividade01;

import java.util.Scanner;

public class Produto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        String nome = scanner.next();
        System.out.println("Digite o valor do produto: ");
        double valorproduto = scanner.nextDouble();
        System.out.println("Digite a quantidade: ");
        int quantidade = scanner.nextInt();
        System.out.println("Diite a forma de pagamento: Debito(D), Credito(C)");
        char pagamento = scanner.next().charAt(0);

        double valorFinal = 0;
        double valorParcelado = 0;
        if (pagamento == 'D') {
            valorFinal = valorproduto * 0.95 * quantidade;
            System.out.println("Deseseja parcelar sua compra? Sim(S), Nao(N)");
            char parcela = scanner.next().charAt(0);
            System.out.println("Digite o numero de parcelas: ");
            int parcelas = scanner.nextInt(parcela);
            if (parcela == 'S') {
                valorParcelado = valorFinal / parcelas;
                System.out.println("O valor final da sua compra do produto " + nome +
                        " na quantidade de " + quantidade + " unidades, parcelando " + parcelas + "vezes. "
                                + "Assim o valor final sera de: R$" +valorParcelado);
            if (parcela == 'N') {
                    System.out.println("O valor final da sua compra do produto " + nome +
                        " na quantidade de " + quantidade + " unidades, parcelando " + parcelas + "vezes. "
                                + "Assim o valor final sera de: R$" + valorFinal);
                }
                
            }
        } else if (pagamento == 'C') {
            valorFinal = valorproduto * quantidade;
            System.out.println("Deseseja parcelar sua compra? Sim(S), Nao(N)");
            char parcela = scanner.next().charAt(0);
            System.out.println("Digite o numero de parcelas: ");
            int parcelas = scanner.nextInt(parcela);
            if (parcela == 'S') {
                valorParcelado = valorFinal / parcelas;
                System.out.println("O valor final da sua compra do produto " + nome +
                        " na quantidade de " + quantidade + " unidades, parcelando " + parcelas + "vezes. "
                                + "Assim o valor final sera de: R$" +valorParcelado);
                if (parcela == 'N') {
                    System.out.println("O valor final da sua compra do produto " + nome +
                        " na quantidade de " + quantidade + " unidades, parcelando " + parcelas + "vezes. "
                                + "Assim o valor final sera de: R$" + valorFinal);
                }
                
            }
        }
    }
}
