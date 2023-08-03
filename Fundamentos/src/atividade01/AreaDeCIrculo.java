package atividade01;

import java.util.Scanner;

public class AreaDeCIrculo {
    public static void main(String[] args) {
        double pi = Math.PI;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Raio:");
        double raio = scanner.nextDouble();
        double area = raio * raio * pi ;
        System.out.println("A área do circulo sera:" + area);
    }
    
}
