package orientaçaoobjetos;

public class Post implements ClassificaçãoPost{
    private String nomeUsuario;
    private String titulo;
    private int comentarios;
    private int likes;
    

    public Post(String nomeUsuario, String titulo, int comentarios, int likes) {
        this.nomeUsuario = nomeUsuario;
        this.titulo = titulo;
        this.comentarios = comentarios;
        this.likes = likes;
        
    }

    @Override
    public String toString() {
        return "Post{" + "nomeUsuario=" + nomeUsuario + ", titulo=" + titulo + ", comentarios=" + comentarios + ", likes=" + likes + '}';
    }
    
    @Override
    public int comum(int qtdeEstrelas){
        return UMA_ESTRELA;
    }
    
    @Override
    public int legal(int qtdeEstrelas){
        return TRES_ESTRELAS;
    }
    
    @Override
    public int superLegal(int qtdeEstrelas){
        return CINCO_ESTRELAS;
    }
    
}
