
package enumeracao.atividade;
public enum RedesSociaisEnum {
    
    INSTAGRAM("Insta"), 
    FACEBOOK("Face"),
    X("Twitter"),
    WHATSAPP("Zap"),
    TIKTOK("TikTok");
    
    private String redesSociais;

    private RedesSociaisEnum(String redesSociais) {
        this.redesSociais = redesSociais;
    }

    public String getRedesSociais() {
        return redesSociais;
    }
    
    
    
}
