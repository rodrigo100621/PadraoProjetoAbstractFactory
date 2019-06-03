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
public class Cliente{
    
   public static void main(String[] args) {
    
       FabricaNotebook tipo = new FabricaSamsung();
       NotbookComum notComum = tipo.criarNotbookComum();
       NotbookDesenvolverdor notDesenvolvimento =  tipo.criaNotbookDesenvolvedor();

       notComum.exibirInfoNotbookComum();
       notDesenvolvimento.exibirinfoNotbookDesenvolvedor();
        
        
       FabricaNotebook tipo2 = new FabricaPredator();
       NotbookGamer notGamer = tipo2.crairNotbookGamer();
       notGamer.exibirNotbookGamer();
    }
    
    
}
