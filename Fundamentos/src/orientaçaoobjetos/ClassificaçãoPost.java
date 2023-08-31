package orientaçaoobjetos;

public interface ClassificaçãoPost {
    int UMA_ESTRELA = 1;
    int TRES_ESTRELAS = 3;
    int CINCO_ESTRELAS = 5;
    
    public int comum(int qtdeEstrelas);
    public int legal(int qtdeEstrelas);
    public int superLegal(int qtdeEstrelas);
}
