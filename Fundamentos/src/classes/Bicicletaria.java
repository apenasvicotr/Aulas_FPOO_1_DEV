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
        Carro gol = new Carro("Gol", "Volkswagem", "Cinza", 2013, 4, true);
        gol.andar(50);
        gol.andar(90);
        
        System.out.println(gol);
        
        Carro civic = new Carro("Civic", "Honda", "Prata", 2005, 4, false);
        civic.andar(80);
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
