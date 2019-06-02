package padraoprojetoabstractfactory;

public class Mizuno implements Produtos {

    @Override
    public CamisaDeSelecoes criarCamisasDeSelecoes() {
        return null;
    }

    @Override
    public CamisasDeTime criarCamisasTimes() {
        return null;
    }

    @Override
    public Bone criarBone() {

        return new AbaReta();
    }

    @Override
    public Calsados criarCalsados() {
        return new CalsadosCasuais();
    }
}
