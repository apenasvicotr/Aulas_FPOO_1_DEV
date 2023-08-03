package atividade01;

import java.util.Scanner;

public class Emprestimo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu salario: ");
        double salario = scanner.nextDouble();
        System.out.println("Digite o valor da casa: ");
        double valorCasa = scanner.nextDouble();
        System.out.println("Digite a quantidade de anos que ira levar para pagar: ");
        int anos = scanner.nextInt();
        
        double valorMensal = valorCasa / anos / 12;
        
        if (valorMensal > salario * 0.3) {
            System.out.println("Seu emprestimo foi negado, pois o valor ultrapassa 30% do seu salario");
        } else {
            System.out.println("Seu emprestimo foi aprovado");
        }
    }

}
