package enumeracao.atividade;
public class Enumeracao {

    public static void main(String[] args) {
        //Cantina
        Itens itens = new Itens(CantinaEnum.CAFÉ.getItens());
        System.out.println(itens);
        itens.setItens(CantinaEnum.PAODEQUEIJO.getItens());
        System.out.println(itens);
        itens.setItens(CantinaEnum.CHOCOLATE.getItens());
        System.out.println(itens);

        
        //Livros
        Categorias categorias = new Categorias(LivrosEnum.AVENTURA.getTipo());
        System.out.println(categorias);
        categorias.setCategorias(LivrosEnum.DRAMA.getTipo());
        System.out.println(categorias);
        categorias.setCategorias(LivrosEnum.FICCAO.getTipo());
        System.out.println(categorias);
        

        //Meses
        Meses meses = new Meses(MesesEnum.AGOSTO.getMes());
        System.out.println(meses);
        meses.setMeses(MesesEnum.SETEMBRO.getMes());
        System.out.println(meses);
        meses.setMeses(MesesEnum.OUTUBRO.getMes());
        System.out.println(meses);
        
        //Redes Sociais
        Redes redes = new Redes(RedesSociaisEnum.INSTAGRAM.getRedesSociais());
        System.out.println(redes);
        redes.setRedes(RedesSociaisEnum.WHATSAPP.getRedesSociais());
        System.out.println(redes);
        redes.setRedes(RedesSociaisEnum.TIKTOK.getRedesSociais());
        System.out.println(redes);
    }

}
