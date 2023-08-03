package atividade01;

public class CalcularMedia {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Murilo",
                "murilo@gmail.com", 1234, 8.0, 7.0);
        
        double media = a1.CalcularMedia();
        System.out.println("A media do aluno sera:" +media);
    }
    
}
