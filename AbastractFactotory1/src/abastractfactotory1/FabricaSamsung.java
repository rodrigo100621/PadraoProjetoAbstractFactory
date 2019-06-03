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
public class FabricaSamsung implements FabricaNotebook{

    @Override
    public NotbookComum criarNotbookComum() {
    
         return new Samsung();
    }

    @Override
    public NotbookGamer crairNotbookGamer() {
    
         return null;
    }

    @Override
    public NotbookDesenvolverdor criaNotbookDesenvolvedor() {
          return new SamsungExpert();
    
    }

  
}
