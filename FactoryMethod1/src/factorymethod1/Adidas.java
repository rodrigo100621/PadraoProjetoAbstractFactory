package factorymethod1;

public class Adidas implements IFabricaProdutos {
    @Override
    public IProduto criarProdutos(String produtos) {
        if (produtos.equals("time")){
            return new CamisaDeTime();
        }else if (produtos.equals("selecao")){
            return new CamisasDeSelecao();
        }else {
            return null;
        }
    }
}
