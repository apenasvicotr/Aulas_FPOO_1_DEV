
package enumeracao.atividade;
public enum CantinaEnum {
    
    COXINHA("Coxinha"),
    CAFÉ("Café"),
    XBACON("Café"),
    PRATOFEITO("X-Bacon"), 
    REFRIGERANTE("Refrigerante"),
    PAODEQUEIJO("Pão de Queijo"),
    SALGADINHO("Salgadinho"),
    CHOCOLATE("Chocolate");
    
    private String itens;

    private CantinaEnum(String itens) {
        this.itens = itens;
    }

    public String getItens() {
        return itens;
    }
    
    
    
    
}
