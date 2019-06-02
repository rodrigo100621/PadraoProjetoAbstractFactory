package padraoprototype;

public class Tenis extends  ProdutoPrototype {


    public Tenis(Tenis tenis) {
        this.informaçao = tenis.getInformaçao();
        this.marca = tenis.getMarca();
    }

    public Tenis() {

    }


    @Override
    public void exibirInformacao() {
        System.out.println("====================");
        System.out.println("Marca:"+ getMarca());
        System.out.println("Informaçao:"+ getInformaçao());

    }

    @Override
    public Tenis clonar() {
        return new Tenis(Tenis.this);
    }
}
