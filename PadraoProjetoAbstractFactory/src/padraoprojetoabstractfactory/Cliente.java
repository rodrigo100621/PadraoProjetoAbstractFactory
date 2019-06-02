package padraoprojetoabstractfactory;

public class Cliente {

    public static void main(String[] args) {

        Produtos produtos = new Adidas();
        CamisaDeSelecoes camisaDeSelecoes = produtos.criarCamisasDeSelecoes();

        camisaDeSelecoes.motrarListaDeSelecoes();
        System.out.println("==========================");
        Bone bone = produtos.criarBone();
        bone.descricao();
        System.out.println("==========================");

        produtos  = new Nike();
        CamisasDeTime camisasDeTime = produtos.criarCamisasTimes();
        CamisaDeSelecoes camisaDeSelecoes1 = produtos.criarCamisasDeSelecoes();
        camisaDeSelecoes1.motrarListaDeSelecoes();
        System.out.println("===========================");
        camisasDeTime.motrarListaDeTimes();

        System.out.println("===========================");
        produtos = new Puma();
        Calsados calsados = produtos.criarCalsados();
        calsados.infoDosCalsados();

        produtos =  new  Mizuno();
        Bone bone1 = produtos.criarBone();
        bone1.descricao();

    }
}
