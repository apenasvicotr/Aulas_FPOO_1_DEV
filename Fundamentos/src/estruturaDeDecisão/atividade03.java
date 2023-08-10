package estruturaDeDecisão;

import java.util.Scanner;

public class atividade03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de pessoas que iram almocar: ");
        int pessoas = scanner.nextInt();
        System.out.println("Escolha a opção de almoco: Bife Acebolado(1),"
                + " Filé de Frango(2), Brajola(3)");
        int opcao = scanner.nextInt();
        
        double valor = 0;
        double preco = 0;
        if (opcao == 1)  {
            preco = 19.99;
            valor = preco * pessoas;
            System.out.println("O valor do almoço sera: R$" + valor);
        }
        else if (opcao == 2)  {
            preco = 18.99;
            valor = preco * pessoas;
            System.out.println("O valor do almoço sera: R$" + valor);
        }
        else if (opcao == 3)  {
            preco = 23.99;
            valor = preco * pessoas;
            System.out.println("O valor do almoço sera: R$" + valor);
        }
    }
}
