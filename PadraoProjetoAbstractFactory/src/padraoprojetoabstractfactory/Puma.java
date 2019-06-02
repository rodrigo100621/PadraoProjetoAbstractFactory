package padraoprojetoabstractfactory;

public class Puma implements Produtos {
    @Override
    public CamisaDeSelecoes criarCamisasDeSelecoes() {
        return new SelecoesEropeias();
    }

    @Override
    public CamisasDeTime criarCamisasTimes() {
        return new TimesEuropeu();
    }

    @Override
    public Bone criarBone() {

        return null;
    }

    @Override
    public Calsados criarCalsados() {
        return new CalsadosEsportivos();
    }
}
