package padraoprototype;

public class Chuteiras extends ProdutoPrototype {


    public Chuteiras(Chuteiras chuteiras) {

    }

    public Chuteiras() {

    }

    @Override
    public void exibirInformacao() {
        System.out.println("====================");
        System.out.println("Marca:"+ getMarca());
        System.out.println("Informaçao:"+ getInformaçao());
    }

    @Override
    public Chuteiras clonar() {

        return new Chuteiras(this);
    }
}
