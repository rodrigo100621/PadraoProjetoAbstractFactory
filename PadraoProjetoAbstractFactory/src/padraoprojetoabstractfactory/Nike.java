package padraoprojetoabstractfactory;

public class Nike implements Produtos {
    @Override
    public CamisaDeSelecoes criarCamisasDeSelecoes() {
        return new SelecoesSulAmericanos();
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
        return null;

    }
}
