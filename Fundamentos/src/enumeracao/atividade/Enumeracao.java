package enumeracao.atividade;

public class Enumeracao {

    public static void main(String[] args) {
        Itens itens = new Itens(CantinaEnum.CAFÉ.getItens());
        System.out.println(itens);

        Categorias categorias = new Categorias(LivrosEnum.AVENTURA.getTipo());
        System.out.println(categorias);

        Meses meses = new Meses(MesesEnum.AGOSTO.getMes());
        System.out.println(meses);
        
        Redes redes = new Redes(RedesSociaisEnum.INSTAGRAM.getRedesSociais());
        System.out.println(redes);
    }

}
