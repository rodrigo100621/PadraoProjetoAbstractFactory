/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypebolo;

/**
 *
 * @author rodri
 */
public class BoloBaunilha extends ProdutoPrototype{

    
     public BoloBaunilha(BoloBaunilha camisas) {

    }

    public BoloBaunilha() {
  
    }

    @Override
    public void exibirInformacao() {
        System.out.println("====================");
        System.out.println("modelo:"+ getModelo());
        System.out.println("Informaçao:"+ getInformaçao());
        System.out.println("valor:"+ getValor());
    }

    @Override
    public BoloBaunilha clonar() {
        return new BoloBaunilha(this);
    }
    
   
}
