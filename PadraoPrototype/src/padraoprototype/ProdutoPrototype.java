package padraoprototype;

public abstract class ProdutoPrototype {
    protected   String marca;
    protected String informaçao;


    public abstract void exibirInformacao();

    public abstract ProdutoPrototype clonar();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getInformaçao() {
        return informaçao;
    }

    public void setInformaçao(String informaçao) {
        this.informaçao = informaçao;
    }
}
