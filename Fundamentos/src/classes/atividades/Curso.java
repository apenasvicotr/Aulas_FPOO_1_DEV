package classes.atividades;

public class Curso {

    private String nome;
    private String descricao;
    private CategoriaEnum categoria;
    private String inscricao;

    public Curso(String nome, String descricao, CategoriaEnum categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.inscricao = "Não Matriculado";
    }
    
    public void seInscerver(){
    this.inscricao = "Inscrito";
    }
    
    public void trancarCurso(){
    this.inscricao = "Curso Trancado";
    }

    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + ", descricao=" + descricao + ", inscricao=" + inscricao + '}';
    }
    
    

}
