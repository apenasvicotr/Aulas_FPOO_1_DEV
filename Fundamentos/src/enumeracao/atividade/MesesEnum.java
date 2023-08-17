
package enumeracao.atividade;
public enum MesesEnum {
    
    JANEIRO("Janeiro"),
    FEVEREIRO("Fevereiro"),
    MARCO("Março"),
    ABRIL("Abril"),
    MAIO("Maio"),
    JUNHO("Junho"), 
    JULHO("Julho"),
    AGOSTO("Agosto"),
    SETEMBRO("Setembro"),
    OUTUBRO("Outubro"),
    NOVEMBRO("Novembro"),
    DEZEMBRO("Dezembro");
    
    private String mes;

    private MesesEnum(String mes) {
        this.mes = mes;
    }

    public String getMes() {
        return mes;
    }
    
    
    
}
