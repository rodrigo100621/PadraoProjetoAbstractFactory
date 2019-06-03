/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abastractfactotory1;

/**
 *
 * @author rodri
 */
public class FabricaPredator implements FabricaNotebook{

    @Override
    public NotbookComum criarNotbookComum() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public NotbookGamer crairNotbookGamer() {
    
      return new PredatorExpert();
              
    }

    @Override
    public NotbookDesenvolverdor criaNotbookDesenvolvedor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
