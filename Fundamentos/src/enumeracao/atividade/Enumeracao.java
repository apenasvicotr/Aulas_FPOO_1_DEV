package enumeracao.atividade;

public class Enumeracao {

    public static void main(String[] args) {
        //Cantina
        Itens itens01 = new Itens(CantinaEnum.CAFÉ.getItens());
        System.out.println(itens01);
        Itens itens02 = new Itens(CantinaEnum.PAODEQUEIJO.getItens());
        System.out.println(itens02);
        Itens itens03 = new Itens(CantinaEnum.CHOCOLATE.getItens());
        System.out.println(itens03);

        //Livros
        Categorias categorias01 = new Categorias(LivrosEnum.AVENTURA.getTipo());
        System.out.println(categorias01);
        Categorias categorias02 = new Categorias(LivrosEnum.ROMANCE.getTipo());
        System.out.println(categorias02);
        Categorias categorias03 = new Categorias(LivrosEnum.FICCAO.getTipo());
        System.out.println(categorias03);

        //Meses
        Meses meses01 = new Meses(MesesEnum.AGOSTO.getMes());
        System.out.println(meses01);
        Meses meses02 = new Meses(MesesEnum.SETEMBRO.getMes());
        System.out.println(meses02);
        Meses meses03 = new Meses(MesesEnum.OUTUBRO.getMes());
        System.out.println(meses03);
        
        //Redes Sociais
        Redes redes01 = new Redes(RedesSociaisEnum.INSTAGRAM.getRedesSociais());
        System.out.println(redes01);
        Redes redes02 = new Redes(RedesSociaisEnum.WHATSAPP.getRedesSociais());
        System.out.println(redes02);
        Redes redes03 = new Redes(RedesSociaisEnum.TIKTOK.getRedesSociais());
        System.out.println(redes03);
    }

}
