package estruturaDeDecisão;

import java.util.Scanner;

public class atividade01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu Cargo:"
                + " Gerente(G), Supervisor(S), Tecnico(T), Auxiliar(A)");
        char cargo = scanner.nextLine().toUpperCase().charAt(0);

        double salario = 0;
        double INSS = 0;
        double convenio = 0;
        double descontos = 0;
        double salarioFinal = 0;

        if (cargo == 'G') {
            salario = 5590.0;
            INSS = 0.92;
            convenio = 289;
            salarioFinal = salario * INSS - convenio;
            System.out.println("Seu salario final no Cargo de Gerente sera de : R$" + salarioFinal);
        } 
        else if (cargo == 'S') {
            salario = 4128.0;
            INSS = 0.93;
            convenio = 239;
            salarioFinal = salario * INSS - convenio;
            System.out.println("Seu salario final no Cargo de Supervisor sera de : R$" + salarioFinal);
        }
        else if (cargo == 'T') {
            salario = 3789.0;
            INSS = 0.96;
            convenio = 189;
            salarioFinal = salario * INSS - convenio;
            System.out.println("Seu salario final no Cargo de Tecnico sera de : R$" + salarioFinal);
        }
        else if (cargo == 'A') {
            salario = 2345.0;
            INSS = 0.98;
            convenio = 156;
            salarioFinal = salario * INSS - convenio;
            System.out.println("Seu salario final no Cargo de Auxiliar sera de : R$" + salarioFinal);
        }
    }
}
