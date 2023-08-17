
package enumeracao.atividade;
public enum LivrosEnum {
    
    ROMANCE("Romance"),
    MISTERIO("Mistério"),
    DRAMA("Drama"),
    AVENTURA("Aventura"),
    FICCAO("Ficção");
    
    private String tipo;

    private LivrosEnum(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    
    
    
}
