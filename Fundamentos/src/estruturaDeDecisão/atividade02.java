package estruturaDeDecisão;

import java.util.Scanner;

public class Atividade02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a largura do seu terreno: ");
        int largura = scanner.nextInt();
        System.out.println("Digite o comprimento do seu terreno: ");
        int comprimento = scanner.nextInt();

        int areaTerreno = largura * comprimento;
        double valorFinal = 0;
        double valorMetro = 0;

        if (areaTerreno <= 250) {
            valorMetro = 8.50;
            valorFinal = areaTerreno * valorMetro;
            System.out.println("O valor para construir seu terreno sera de: " + valorFinal);
        } else if (areaTerreno <= 350) {
            valorMetro = 9.50;
            valorFinal = areaTerreno * valorMetro;
            System.out.println("O valor para construir seu terreno sera de: " + valorFinal);
        } else if (areaTerreno > 350){
            valorMetro = 11.50;
            valorFinal = areaTerreno * valorMetro;
            System.out.println("O valor para construir seu terreno sera de: " + valorFinal);
        }
    }
}
