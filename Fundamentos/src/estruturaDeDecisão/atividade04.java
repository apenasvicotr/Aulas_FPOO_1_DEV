package estruturaDeDecisão;

import java.util.Scanner;

public class atividade04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero do produto desejado:"
                + "\nNotebook Lenovo R$3299,00(1)"
                + "\nCelular MotoG22 R$1789,00(2)"
                + "\nCarro Hb20 R$68000,00(3)"
                + "\nApartamento R$180000,00(4)");
        int produto = scanner.nextInt();

        double valor = 0;
        double percentualEconomizar = 0;
        double quantidadeMeses = 0;

        if (produto == 1) {
            valor = 3299;
            percentualEconomizar = 0.05;
            quantidadeMeses = valor / (valor * percentualEconomizar);
            System.out.println("A quantidade de meses para comprar o prouto sera: " + quantidadeMeses);
        } else if (produto == 2) {
            valor = 1789;
            percentualEconomizar = 0.1;
            quantidadeMeses = valor / (valor * percentualEconomizar);
            System.out.println("A quantidade de meses para comprar o prouto sera: " + quantidadeMeses);
        }
        else if (produto == 3) {
            valor = 68000;
            percentualEconomizar = 0.02;
            quantidadeMeses = valor / (valor * percentualEconomizar);
            System.out.println("A quantidade de meses para comprar o prouto sera: " + quantidadeMeses);
        }
        else if (produto == 4) {
            valor =180000;
            percentualEconomizar = 0.01;
            quantidadeMeses = valor / (valor * percentualEconomizar);
            System.out.println("A quantidade de meses para comprar o prouto sera: " + quantidadeMeses);
        }
    }
}