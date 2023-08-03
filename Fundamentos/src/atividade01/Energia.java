package atividade01;

import java.util.Scanner;

public class Energia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de KW/h consumidos:");
        double KW = scanner.nextInt();
        System.out.println("Digite o tipo de Instalacao eletrica: "
                + "Residencida(R), Industria(I) ou Comercio(C)");
        char instalacao = scanner.next().charAt(0);
        System.out.println(instalacao);
        double valor = 0;
        if (instalacao == 'R') {
            if (KW <= 500) {
                valor = KW * 0.40;
                System.out.println("O valor gasto sera de R$:" + valor);
            } else {
                valor = KW * 0.65;
                System.out.println("O valor gasto sera de R$:" + valor);
            }
        }

       else if (instalacao == 'I') {
            if (KW <= 1000) {
                valor = KW * 0.55;
                System.out.println("O valor gasto sera de R$:" + valor);
            } else {
                valor = KW * 0.60;
                System.out.println("O valor gasto sera de R$:" + valor);
            }
        }
       else if (instalacao == 'C') {
            if (KW <= 5000) {
                valor = KW * 0.55;
                System.out.println("O valor gasto sera de R$:" + valor);
            } else {
                valor = KW * 0.60;
                System.out.println("O valor gasto sera de R$:" + valor);
            }

        }

    }
}
