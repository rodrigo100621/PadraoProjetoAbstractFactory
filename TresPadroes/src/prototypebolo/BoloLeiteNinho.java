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
public class BoloLeiteNinho extends ProdutoPrototype{

    
     public BoloLeiteNinho(BoloLeiteNinho camisas) {

    }

    public BoloLeiteNinho() {
  
    }

    @Override
    public void exibirInformacao() {
        System.out.println("====================");
        System.out.println("Modelo:"+ getModelo());
        System.out.println("Informaçao:"+ getInformaçao());
        System.out.println("valor:"+ getValor());
    }

    @Override
    public BoloLeiteNinho clonar() {
        return new BoloLeiteNinho(this);
    }
    
   
}
