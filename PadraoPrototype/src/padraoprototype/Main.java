package padraoprototype;

public class Main {  

    public static void main(String[] args) {


        Tenis prototipoTenis = new Tenis();

        ProdutoPrototype tenisCasual = prototipoTenis.clonar();
        tenisCasual.setMarca("Adidas");
        tenisCasual.setInformaçao("Informaçao para tenis casual");

        tenisCasual.exibirInformacao();

        ProdutoPrototype tenisCorrida = prototipoTenis.clonar();
        tenisCorrida.setMarca("Nike");
        tenisCorrida.setInformaçao("Informaçao para tenis tenis corrida");

        tenisCorrida.exibirInformacao();

  
        Camisas prototicoCamisa = new Camisas();
        ProdutoPrototype camisaSelecao = prototicoCamisa.clonar();
        camisaSelecao.setMarca("Adidas");
        camisaSelecao.setInformaçao("Informaçao para camisas de seleçao da marca adidas");

        camisaSelecao.exibirInformacao();

        ProdutoPrototype camisaTimes = prototicoCamisa.clonar();
        camisaTimes.setMarca("Puma");
        camisaTimes.setInformaçao("Informaçao para camisas de time da marca puma");

        camisaTimes.exibirInformacao();
    }
}
