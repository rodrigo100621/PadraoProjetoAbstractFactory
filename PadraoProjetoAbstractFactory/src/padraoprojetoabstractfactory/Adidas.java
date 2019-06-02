package padraoprojetoabstractfactory;

public class Adidas  implements Produtos {
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
        return new AbaCurvada();
    }

    @Override
    public Calsados criarCalsados() {
        return null;
    }
}
