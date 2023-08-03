package atividade01;

import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu salario");
        double salario = scanner.nextDouble();
        if (salario >= 1350) {
            double salariofinal = salario * 1.1;
            System.out.println("Seu salario final sera de R$:" + salariofinal);
        } else {
            double salariofinal2 = salario *1.15;
            System.out.println("Seu salario final sera de R$:" + salariofinal2);
        }
    }
   
           
    
    
}
