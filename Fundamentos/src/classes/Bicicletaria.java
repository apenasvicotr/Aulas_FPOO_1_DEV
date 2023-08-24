package classes;

/**
 *
 * @author Aluno
 */
public class Bicicletaria {
    public static void main(String[] args) {
        Bicicleta caloiCross = new Bicicleta(2, true, 8, "Caloi Cross", true, "Preta");
        
        
        caloiCross.andar(10);
        caloiCross.andar(20);
        caloiCross.andar(30);
        
        System.out.println(caloiCross);
        
        //Carros
        Carro gol = new Carro("Gol", "Volswagem", CorEnum.CINZA, 2013, 4, true,0, false);
        gol.trocarDeMarcha(MarchaEnum.PRIMEIRA_MARCHA);
        gol.andar(50);
        gol.trocarDeMarcha(MarchaEnum.SEGUNDA_MARCHA);
        gol.andar(90);
        
        System.out.println(gol);
        
        Carro civic = new Carro("Civic", "Honda", CorEnum.PRATA, 2020, 4, true,0, false);
        civic.trocarDeMarcha(MarchaEnum.PRIMEIRA_MARCHA);
        civic.andar(80);
        civic.trocarDeMarcha(MarchaEnum.SEGUNDA_MARCHA);
        civic.andar(120);
        
        System.out.println(civic);
        
        //Alunos
        Aluno ana = new Aluno("Ana Beatriz", "anabeatriz@gamil.com",1234);
        ana.estudar();
        System.out.println(ana);
        
        
        Aluno victor = new Aluno("Victor Luiz", "victorluiz@gmail.com", 4321);
        System.out.println(victor);
    }
}
