/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trespadroes;

import abstractfactorydoce.DoceAmendoin;
import abstractfactorydoce.DoceComum;
import abstractfactorydoce.DoceLigth;
import abstractfactorydoce.FabricaDoce;
import abstractfactorydoce.FabricaMaranata;
import abstractfactorydoce.FabricaNestle;
import factorymethodbiscoito.Biscoito;
import factorymethodbiscoito.IBiscoito;
import factorymethodbiscoito.IFabricaBiscoitos;
import prototypebolo.BoloBaunilha;
import prototypebolo.BoloCenoura;
import prototypebolo.ProdutoPrototype;

/**
 *
 * @author rodri
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        System.out.println("-----------Padrao-Prototype-Bolos-----------------------------------------------------------------------------------------");
         BoloBaunilha prototipoBaunilha = new BoloBaunilha();

        ProdutoPrototype boloComum = prototipoBaunilha.clonar();
        boloComum.setModelo("Bolo Aniverssario");
        boloComum.setInformaçao("bolo comum para anverssario 15 anos");
        boloComum.setValor(12.00);

        boloComum.exibirInformacao();
        
        
        BoloCenoura prototipoCenoura = new BoloCenoura();

        ProdutoPrototype boloCasamento = prototipoCenoura.clonar();
        boloComum.setModelo("Bolo Casamento");
        boloComum.setInformaçao("Bolo 8 andares para casamento");
        boloComum.setValor(1200.00);

        boloComum.exibirInformacao();
        
 
        
        System.out.println("-----------Padrao-FactotyMethod-biscoito-----------------------------------------------------------------------------------------");
       
        
        IFabricaBiscoitos produtos = new Biscoito();
        IBiscoito p = produtos.criarProdutos("leite");
        p.informacaoProdutos();
        System.out.println("================================================================");

        produtos = new Biscoito();
        p = produtos.criarProdutos("mabel");
        p.informacaoProdutos();
        System.out.println("================================================================");

        produtos = new Biscoito();
        p= produtos.criarProdutos("nestle");
        p.informacaoProdutos();
        System.out.println("================================================================");

        produtos = new Biscoito();
        p= produtos.criarProdutos("nesfit");
        p.informacaoProdutos();
        System.out.println("================================================================");

        produtos = new Biscoito();
        p= produtos.criarProdutos("marilan");
        p.informacaoProdutos();
        System.out.println("================================================================");


        
        
        System.out.println("-----------Padrao-AbstractFactoty-doces-----------------------------------------------------------------------------------------");
       
    FabricaDoce fabrica = new FabricaNestle();
    DoceComum  amendoin = fabrica.doceComum();
    DoceLigth goiaba = fabrica.doceLight();
    
    amendoin.informacaoDoceComum();
    goiaba.informacaoDoceLigth();
    System.out.println();
    
    
    FabricaDoce fabrica2 = new FabricaMaranata();
    DoceComum  chocolate = fabrica.doceComum();
    DoceLigth banana = fabrica2.doceLight();
     
    chocolate.informacaoDoceComum();
    banana.informacaoDoceLigth();
 
    }
    
}
