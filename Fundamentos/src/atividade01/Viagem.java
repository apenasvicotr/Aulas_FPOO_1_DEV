package atividade01;

import java.util.Scanner;

public class Viagem {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a distancia da viagem em Km:");
        int distancia = scanner.nextInt();
        if (distancia <= 300) {
           double valorfinal = distancia * 0.50;
            System.out.println("O valor da passagem sera de R$:" + valorfinal);
        } else {
            double valorfinal2 = distancia * 0.45;
            System.out.println("O valor final da passagem sera de R$" + valorfinal2);
        }
    }
   
    
}
