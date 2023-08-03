package atividade01;

public class MediaAritimetica {

    public static void main(String[] args) {
        int rs = somar(4, 5, 2, 6);
        System.out.println("A soma deu: " + rs);
    }

    public static int somar(int... valores) {
        int resultado = 0;
        for (int i = 0; i < valores.length; i++) {
            double valor = valores[i];
            resultado += valor / valores.length;
        }
return resultado;
    }
}

