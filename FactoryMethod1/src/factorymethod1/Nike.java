package factorymethod1;

public class Nike implements IFabricaProdutos {
    @Override
    public IProduto criarProdutos(String produtos) {
        if (produtos.equals("campo")){
            return new ChuteiraDeCampo();
        }else if (produtos.equals("quadra")){
            return new ChuteiraDeQuadra();
        }else {
            return null;
        }
    }
}
