package orientaçaoobjetos;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class RedeSocial {
    
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        
        int qtdeEstrelas = 0;
        
        Post postagem1 = new Post("boss talikida", "Entupi a privada da minha irmã", 5000, 100000);
        System.out.println(postagem1);
        qtdeEstrelas = postagem1.superLegal(5);
        System.out.println("O post do usuario teve " +qtdeEstrelas + " estrelas");
        
        Post postagem2 = new Post("Tim Maia", "SHOW AO VIVO DO CÉU", 2500, 50000);
        System.out.println(postagem2);
        qtdeEstrelas = postagem2.legal(3);
        System.out.println("O post do usuario teve " +qtdeEstrelas + " estrelas");
        
        Post postagem3 = new Post("Cleiton", "Foto Minha na Praia", 13, 320);
        System.out.println(postagem3);
        qtdeEstrelas = postagem3.comum(1);
        System.out.println("O post do usuario teve " +qtdeEstrelas + " estrelas");
        
        
    }

}
