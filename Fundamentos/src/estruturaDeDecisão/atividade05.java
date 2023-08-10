package estruturaDeDecisão;

import java.util.Scanner;

public class atividade05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o carro desejado:"
                + "\nFiat Argo(1)"
                + "\nFiat Mobi(2)"
                + "\nHyundai Hb20(3)");
        int carro = scanner.nextInt();
        System.out.println("Digite a quantidade de dias que ira alugar o carro: ");
        int dias = scanner.nextInt();
        System.out.println("Digite a quantidade de KM rodados na viagem: ");
        int quilometragem = scanner.nextInt();
        
        double valorDiaria = 0;
        double valorKM = 0;
        double valorViagem = 0;
        
        if (carro == 1) {
            valorDiaria = 98;
            valorKM = 2.39;
            valorViagem = valorDiaria * dias + valorKM * quilometragem;
            System.out.println("O valor da viagem será: R$" + valorViagem);
        }
        else if (carro == 2) {
            valorDiaria = 79;
            valorKM = 1.99;
            valorViagem = valorDiaria * dias + valorKM * quilometragem;
            System.out.println("O valor da viagem será: R$" + valorViagem);
        }
        else if (carro == 3) {
            valorDiaria = 102;
            valorKM = 2.99;
            valorViagem = valorDiaria * dias + valorKM * quilometragem;
            System.out.println("O valor da viagem será: R$" + valorViagem);
        }
    }
}
