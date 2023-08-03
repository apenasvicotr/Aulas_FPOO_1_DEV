package atividade01;

import java.util.Scanner;

public class Multa {
    public static void main(String[] args) {
        System.out.println("Digite a velocidade do automovel");
        Scanner scanner = new Scanner(System.in);
        int velocidade = scanner.nextInt();
        if (velocidade >= 80) {
            int valorMulta = (velocidade - 80) * 5;
            System.out.println("Voce foi multado em R$:" + valorMulta);
            
        } else {
            System.out.println("Voce nao foi multado, Parabens");
        }
    }
}
