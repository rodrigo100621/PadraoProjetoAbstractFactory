package factorymethod1;

public class Cliente {

    public static void main(String[] args) {

        IFabricaProdutos produtos = new Adidas();
        IProduto p = produtos.criarProdutos("selecao");
        p.informacaoProdutos();
        System.out.println("================================================================");

        produtos = new Adidas();
        p = produtos.criarProdutos("time");
        p.informacaoProdutos();
        System.out.println("================================================================");

        produtos = new Nike();
        p= produtos.criarProdutos("quadra");
        p.informacaoProdutos();
        System.out.println("================================================================");

        IFabricaProdutos produtosNike = new Nike();
        IProduto nike = produtosNike.criarProdutos("campo");
        nike.informacaoProdutos();
        System.out.println("================================================================");

        produtos = new Mizuno();
        p= produtos.criarProdutos("tenis");
        p.informacaoProdutos();
        System.out.println("================================================================");

        produtos = new Mizuno();
        p= produtos.criarProdutos("polo");
        p.informacaoProdutos();
        System.out.println("================================================================");
    }

}
